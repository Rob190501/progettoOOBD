package dao.implementazione.postgresql;

import controller.Controller;
import dao.interfaccia.PresenzeDAOInterfaccia;
import dto.Lezione;
import dto.Studente;
import eccezioni.associazioni.AssociazioneFallitaException;
import eccezioni.create.CreateFallitoException;
import eccezioni.delete.DeleteFallitoException;
import eccezioni.retrieve.RetrieveFallitoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;



public class PresenzeDAOImplementazione implements PresenzeDAOInterfaccia {

    private Controller controller;
    private Connection connection;
    
    private String insertPresenza = "INSERT "
                                  + "INTO presenze (matricola, codice_lezione) "
                                  + "VALUES (?, ?)";
    
    private String selectPresenzeByStudente = "SELECT * "
                                            + "FROM presenze "
                                            + "WHERE matricola = ?";
    
    private String deletePresenza = "DELETE "
                                  + "FROM presenze "
                                  + "WHERE matricola = ? AND codice_lezione = ?";

    public PresenzeDAOImplementazione(Controller controller, Connection connection) {
        this.controller = controller;
        this.connection = connection;
    }
    
    @Override
    public void createPresenza(Studente studente, Lezione lezione) throws CreateFallitoException {
        try (PreparedStatement pstmt = connection.prepareStatement(insertPresenza)) {
            pstmt.setInt(1, studente.getMatricola());
            pstmt.setInt(2, lezione.getCodice());
            pstmt.executeUpdate();
            studente.addPresenza(lezione);
            lezione.addStudente(studente);
        }
        catch(SQLException e) {
            throw new CreateFallitoException("la Presenza", e.getMessage());
        }
    }

    @Override
    public void retrievePresenzeByStudente(Studente studente, LinkedList<Lezione> listaLezioni) throws RetrieveFallitoException, AssociazioneFallitaException {
        try (PreparedStatement pstmt = connection.prepareStatement(selectPresenzeByStudente)) {
            pstmt.setInt(1, studente.getMatricola());
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    Lezione lezione = trovaLezioneDellaPresenza(rs.getInt("codice_lezione"), listaLezioni);
                    studente.addPresenza(lezione);
                    lezione.addStudente(studente);
                }
            }
        }
        catch(SQLException e) {
            throw new RetrieveFallitoException("la Presenza", e.getMessage());
        }
    }
    
    private Lezione trovaLezioneDellaPresenza(int codice_lezione, LinkedList<Lezione> listaLezioni) throws AssociazioneFallitaException {
        for (Lezione lezione : listaLezioni) {
            if(codice_lezione == lezione.getCodice()) {
                return lezione;
            }
        }
        throw new AssociazioneFallitaException("Lezioni e Studenti");
    }

    @Override
    public void deletePresenza(Studente studente, Lezione lezione) throws DeleteFallitoException {
        try (PreparedStatement pstmt = connection.prepareStatement(deletePresenza)) {
            pstmt.setInt(1, studente.getMatricola());
            pstmt.setInt(2, lezione.getCodice());
            pstmt.executeUpdate();
            studente.removePresenza(lezione);
            lezione.removeStudente(studente);
        }
        catch(SQLException e) {
            throw new DeleteFallitoException("la Presenza dello Studente", e.getMessage());
        }
    }
    
}
