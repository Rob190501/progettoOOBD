package dao.implementazione.postgresql;

import controller.Controller;
import dao.interfaccia.SQL.StudenteDAOInterfaccia;
import dto.Corso;
import dto.Lezione;
import dto.Studente;
import eccezioni.create.CreateStudenteFallitoException;
import eccezioni.delete.DeleteStudenteFallitoException;
import eccezioni.update.UpdateStudenteFallitoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

public class StudenteDAOImplementazione implements StudenteDAOInterfaccia {

    private Controller controller;
    private Connection connection;
    
    private String insertStudente = "INSERT "
                                  + "INTO studente (nome, cognome) "
                                  + "VALUES (?, ?)";
    
    private String selectAllStudente = "SELECT * "
                                     + "FROM studente";
    
    private String selectCorsiFrequentati = "SELECT * "
                                          + "FROM studenti_del_corso "
                                          + "WHERE matricola = ?";
    
    private String selectPresenze = "SELECT * "
                                  + "FROM presenze "
                                  + "WHERE matricola = ?";
    
    private String updateStudente = "UPDATE studente "
                                  + "SET nome = ?, cognome = ?"
                                  + "WHERE matricola = ?";
    
    private String deleteStudente = "DELETE "
                                  + "FROM studente "
                                  + "WHERE matricola = ?";
    
    public StudenteDAOImplementazione(Controller controller, Connection connection) {
        setController(controller);
        setConnection(connection);
    }

    private void setController(Controller controller) {
        this.controller = controller;
    }

    private void setConnection(Connection connection) {
        this.connection = connection;
    }
    
    @Override
    public void createStudente(Studente studente) throws SQLException, CreateStudenteFallitoException {
        try (PreparedStatement pstInsertStudente = connection.prepareStatement(insertStudente, Statement.RETURN_GENERATED_KEYS)) {
            pstInsertStudente.setString(1, studente.getNome());
            pstInsertStudente.setString(2, studente.getCognome());
            if (pstInsertStudente.executeUpdate() != 1) {
                throw new CreateStudenteFallitoException();
            }
            try (ResultSet rsInsertStudente = pstInsertStudente.getGeneratedKeys()) {
                if(rsInsertStudente.next()) {
                    studente.setMatricola(rsInsertStudente.getInt(1));
                }
                else {
                    throw new CreateStudenteFallitoException();
                }
            }
        }
    }

    @Override
    public LinkedList<Studente> retrieveAllStudente(LinkedList<Corso>listaCorsi, LinkedList<Lezione> listaLezioni) throws SQLException {
        try (Statement stmtRetrieveAllStudente = connection.createStatement()) {
            LinkedList<Studente> listaStudenti = new LinkedList<>();
            
            try (ResultSet rsRetrieveAllStudente = stmtRetrieveAllStudente.executeQuery(selectAllStudente)) {
                while(rsRetrieveAllStudente.next()) {
                    int matricola = rsRetrieveAllStudente.getInt("matricola");
                    String nome = rsRetrieveAllStudente.getString("nome");
                    String cognome = rsRetrieveAllStudente.getString("cognome");

                    Studente studente = new Studente(matricola, nome, cognome);
                    retrieveCorsiFrequentati(studente, listaCorsi);
                    retrievePresenze(studente, listaLezioni);
                    listaStudenti.add(studente);
                }
            }
            
            return listaStudenti;
        }
    }
    
    private void retrieveCorsiFrequentati(Studente studente, LinkedList<Corso> listaCorsi) throws SQLException {
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
    }
    
    private void retrievePresenze(Studente studente, LinkedList<Lezione> listaLezioni) throws SQLException {
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
    }

    @Override
    public void updateStudente(Studente studente) throws SQLException, UpdateStudenteFallitoException {
        try (PreparedStatement pstUpdateStudente = connection.prepareStatement(updateStudente)) {
            pstUpdateStudente.setString(1, studente.getNome());
            pstUpdateStudente.setString(2, studente.getCognome());
            pstUpdateStudente.setInt(3, studente.getMatricola());
            if (pstUpdateStudente.executeUpdate() != 1) {
                throw new UpdateStudenteFallitoException();
            }
        }
    }

    @Override
    public void deleteStudente(Studente studente) throws SQLException, DeleteStudenteFallitoException {
        try (PreparedStatement pstDeleteStudente = connection.prepareStatement(deleteStudente)) {
            pstDeleteStudente.setInt(1, studente.getMatricola());
            if (pstDeleteStudente.executeUpdate() != 1) {
                throw new DeleteStudenteFallitoException();
            }
        }
    }
    
}
