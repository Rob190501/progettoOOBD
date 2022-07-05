package dao.implementazione.postgresql;

import controller.Controller;
import dto.Corso;
import dto.Lezione;
import dto.Studente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import dao.interfaccia.IscrizioniDAOInterfaccia;
import eccezioni.associazioni.AssociazioneFallitaException;
import eccezioni.create.CreateFallitoException;
import eccezioni.delete.DeleteFallitoException;
import eccezioni.retrieve.RetrieveFallitoException;
import java.util.AbstractList;



public class IscrizioniDAOPostgreSQL implements IscrizioniDAOInterfaccia {

    private Controller controller;
    private Connection connection;

    public IscrizioniDAOPostgreSQL(Controller controller, Connection connection) {
        this.controller = controller;
        this.connection = connection;
    }
    
    private String insertIscrizione = "INSERT "
                                    + "INTO iscrizioni (matricola, codice_corso) "
                                    + "VALUES (?, ?)";
    
    private String selectIscrizioniByStudente = "SELECT * "
                                              + "FROM iscrizioni "
                                              + "WHERE matricola = ?";
    
    private String deleteIscrizione = "DELETE "
                                    + "FROM iscrizioni "
                                    + "WHERE matricola = ? AND codice_corso = ?";
    
    @Override
    public void createIscrizione(Studente studente, Corso corso) throws CreateFallitoException {
        try (PreparedStatement pstmt = connection.prepareStatement(insertIscrizione)) {
            pstmt.setInt(1, studente.getMatricola());
            pstmt.setInt(2, corso.getCodice());
            pstmt.executeUpdate();
            studente.addCorso(corso);
            corso.addStudente(studente);
        }
        catch(SQLException e) {
            throw new CreateFallitoException("l'Iscrizione", e.getMessage());
        }
    }
    
    public void retrieveIscrizioniByStudente(Studente studente, AbstractList<Corso> listaCorsi) throws RetrieveFallitoException, AssociazioneFallitaException {
        try (PreparedStatement pstmt = connection.prepareStatement(selectIscrizioniByStudente)) {
            pstmt.setInt(1, studente.getMatricola());
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    Corso corso = trovaCorsoFrequentato(rs.getInt("codice_corso"), listaCorsi);
                    studente.addCorso(corso);
                    corso.addStudente(studente);
                }
            }
        }
        catch(SQLException e) {
            throw new RetrieveFallitoException("l'Iscrizione", e.getMessage());
        }
    }
    
    private Corso trovaCorsoFrequentato(int codice_corso, AbstractList<Corso> listaCorsi) throws AssociazioneFallitaException {
        for (Corso corso : listaCorsi) {
            if(codice_corso == corso.getCodice()) {
                return corso;
            }
        }
        throw new AssociazioneFallitaException("Studenti e Corsi");
    }

    @Override
    public void deleteIscrizione(Studente studente, Corso corso) throws DeleteFallitoException {
        try (PreparedStatement pstmt = connection.prepareStatement(deleteIscrizione)) {
            for(Lezione lezione : studente.getPresenzeDiUnCorso(corso)) {
               controller.removePresenza(studente, lezione);
            }
            pstmt.setInt(1, studente.getMatricola());
            pstmt.setInt(2, corso.getCodice());
            pstmt.executeUpdate();
            studente.removeCorso(corso);
            corso.removeStudente(studente);
        }
        catch(SQLException e) {
            throw new DeleteFallitoException("l'Iscrizione", e.getMessage());
        }
    }
    
}
