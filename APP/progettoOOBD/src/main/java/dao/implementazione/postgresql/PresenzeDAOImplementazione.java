package dao.implementazione.postgresql;

import controller.Controller;
import dao.interfaccia.PresenzeDAOInterfaccia;
import dto.Lezione;
import dto.Studente;
import eccezioni.create.CreatePresenzaFallitoException;
import eccezioni.delete.DeletePresenzaFallitoException;
import eccezioni.retrieve.RetrievePresenzaFallitoException;
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
    
    private String selectPresenze = "SELECT * "
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
    public void createPresenza(Studente studente, Lezione lezione) throws CreatePresenzaFallitoException {
        try (PreparedStatement pstInsertPresenza = connection.prepareStatement(insertPresenza)) {
            pstInsertPresenza.setInt(1, studente.getMatricola());
            pstInsertPresenza.setInt(2, lezione.getCodice());
            if (pstInsertPresenza.executeUpdate() != 1) {
                throw new CreatePresenzaFallitoException();
            }
            studente.addPresenza(lezione);
            lezione.addStudente(studente);
        }
        catch(SQLException e) {
            throw new CreatePresenzaFallitoException(e.getMessage());
        }
    }

    @Override
    public void retrievePresenze(Studente studente, LinkedList<Lezione> listaLezioni) throws RetrievePresenzaFallitoException {
        try (PreparedStatement pstRetrievePresenze = connection.prepareStatement(selectPresenze)) {
            pstRetrievePresenze.setInt(1, studente.getMatricola());
            try (ResultSet rsRetrievePresenze = pstRetrievePresenze.executeQuery()) {
                while (rsRetrievePresenze.next()) {
                    for (Lezione lezione : listaLezioni) {
                        if(rsRetrievePresenze.getInt("codice_lezione") == lezione.getCodice()) {
                            studente.addPresenza(lezione);
                            lezione.addStudente(studente);
                        }
                    }
                }
            }
        }
        catch(SQLException e) {
            throw new RetrievePresenzaFallitoException(e.getMessage());
        }
    }

    @Override
    public void deletePresenza(Studente studente, Lezione lezione) throws DeletePresenzaFallitoException {
        try (PreparedStatement pstDeletePresenza = connection.prepareStatement(deletePresenza)) {
            pstDeletePresenza.setInt(1, studente.getMatricola());
            pstDeletePresenza.setInt(2, lezione.getCodice());
            if (pstDeletePresenza.executeUpdate() != 1) {
                throw new DeletePresenzaFallitoException();
            }
            studente.removePresenza(lezione);
            lezione.removeStudente(studente);
        }
        catch(SQLException e) {
            throw new DeletePresenzaFallitoException(e.getMessage());
        }
    }
    
}
