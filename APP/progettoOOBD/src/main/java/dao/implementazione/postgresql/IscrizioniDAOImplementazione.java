package dao.implementazione.postgresql;

import controller.Controller;
import dao.interfaccia.StudenteDelCorsoDAOInterfaccia;
import dto.Corso;
import dto.Lezione;
import dto.Studente;
import eccezioni.create.CreateStudenteDelCorsoFallitoException;
import eccezioni.delete.DeletePresenzaFallitoException;
import eccezioni.delete.DeleteStudenteDelCorsoFallitoException;
import eccezioni.retrieve.RetrieveStudenteDelCorsoFallitoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;



public class IscrizioniDAOImplementazione implements StudenteDelCorsoDAOInterfaccia {

    private Controller controller;
    private Connection connection;

    public IscrizioniDAOImplementazione(Controller controller, Connection connection) {
        this.controller = controller;
        this.connection = connection;
    }
    
    private String insertStudenteDelCorso = "INSERT "
                                          + "INTO iscrizioni (matricola, codice_corso) "
                                          + "VALUES (?, ?)";
    
    private String selectCorsiFrequentati = "SELECT * "
                                          + "FROM iscrizioni "
                                          + "WHERE matricola = ?";
    
    private String deleteStudenteDelCorso = "DELETE "
                                          + "FROM iscrizioni "
                                          + "WHERE matricola = ? AND codice_corso = ?";
    
    @Override
    public void createStudenteDelCorso(Studente studente, Corso corso) throws CreateStudenteDelCorsoFallitoException {
        try (PreparedStatement pstInsertStudenteDelCorso = connection.prepareStatement(insertStudenteDelCorso)) {
            pstInsertStudenteDelCorso.setInt(1, studente.getMatricola());
            pstInsertStudenteDelCorso.setInt(2, corso.getCodice());
            if (pstInsertStudenteDelCorso.executeUpdate() != 1) {
                throw new CreateStudenteDelCorsoFallitoException();
            }
            studente.addCorso(corso);
            corso.addStudente(studente);
        }
        catch(SQLException e) {
            throw new CreateStudenteDelCorsoFallitoException(e.getMessage());
        }
    }
    
    public void retrieveCorsiFrequentati(Studente studente, LinkedList<Corso> listaCorsi) throws RetrieveStudenteDelCorsoFallitoException {
        try (PreparedStatement pstRetrieveCorsiFrequentati = connection.prepareStatement(selectCorsiFrequentati)) {
            pstRetrieveCorsiFrequentati.setInt(1, studente.getMatricola());
            try (ResultSet rsRetrieveCorsiFrequentati = pstRetrieveCorsiFrequentati.executeQuery()) {
                while (rsRetrieveCorsiFrequentati.next()) {
                    for (Corso corso : listaCorsi) {
                        if(rsRetrieveCorsiFrequentati.getInt("codice_corso") == corso.getCodice()) {
                            studente.addCorso(corso);
                            corso.addStudente(studente);
                        }
                    }
                }
            }
        }
        catch(SQLException e) {
            throw new RetrieveStudenteDelCorsoFallitoException(e.getMessage());
        }
    }

    @Override
    public void deleteStudenteDelCorso(Studente studente, Corso corso) throws DeleteStudenteDelCorsoFallitoException, DeletePresenzaFallitoException {
        try (PreparedStatement pstDeleteStudenteDelCorso = connection.prepareStatement(deleteStudenteDelCorso)) {
            for(Lezione lezione : studente.getPresenzeDiUnCorso(corso)) {
               controller.removePresenza(studente, lezione);
            }
            pstDeleteStudenteDelCorso.setInt(1, studente.getMatricola());
            pstDeleteStudenteDelCorso.setInt(2, corso.getCodice());
            if (pstDeleteStudenteDelCorso.executeUpdate() != 1) {
                throw new DeleteStudenteDelCorsoFallitoException();
            }
            studente.removeCorso(corso);
            corso.removeStudente(studente);
            
        }
        catch(SQLException e) {
            throw new DeleteStudenteDelCorsoFallitoException(e.getMessage());
        }
    }
    
}
