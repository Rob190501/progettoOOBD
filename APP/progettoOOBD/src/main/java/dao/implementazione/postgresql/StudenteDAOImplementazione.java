package dao.implementazione.postgresql;

import controller.Controller;
import dao.interfaccia.StudenteDAOInterfaccia;
import dto.Corso;
import dto.Lezione;
import dto.Studente;
import eccezioni.associazioni.AssociazioneStudenteCorsoFallitaException;
import eccezioni.associazioni.AssociazioneStudenteLezioneFallitaException;
import eccezioni.create.CreateStudenteFallitoException;
import eccezioni.delete.DeleteStudenteFallitoException;
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
    
    private String querySelectAllStudente = "SELECT * "
                                          + "FROM studente";
    
    private String querySelectCorsiFrequentati = "SELECT * "
                                               + "FROM studenti_del_corso "
                                               + "WHERE matricola = ?";
    
    private String querySelectPresenze = "SELECT * "
                                       + "FROM presenze "
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
            pstInsertStudente.executeUpdate();

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
    public LinkedList<Studente> retrieveAllStudente(LinkedList<Corso>listaCorsi, LinkedList<Lezione> listaLezioni) throws SQLException, AssociazioneStudenteCorsoFallitaException, AssociazioneStudenteLezioneFallitaException {
        try (Statement stmtRetrieveAllStudente = connection.createStatement()) {
            LinkedList<Studente> listaStudenti = new LinkedList<>();
            
            try (ResultSet rsRetrieveAllStudente = stmtRetrieveAllStudente.executeQuery(querySelectAllStudente)) {
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
    
    private void retrieveCorsiFrequentati(Studente studente, LinkedList<Corso> listaCorsi) throws SQLException, AssociazioneStudenteCorsoFallitaException {
        try (PreparedStatement pstRetrieveCorsiFrequentati = connection.prepareStatement(querySelectCorsiFrequentati)) {
            pstRetrieveCorsiFrequentati.setInt(1, studente.getMatricola());

            try (ResultSet rsRetrieveCorsiFrequentati = pstRetrieveCorsiFrequentati.executeQuery()) {
                boolean flagCorsoAssegnato = true;

                while (rsRetrieveCorsiFrequentati.next()) {
                    flagCorsoAssegnato = false;
                    for (Corso corso : listaCorsi) {
                        if(rsRetrieveCorsiFrequentati.getInt("codice_corso") == corso.getCodice()) {
                            studente.addCorso(corso);
                            corso.addStudente(studente);
                            flagCorsoAssegnato = true;
                        }
                    }
                }

                if(!flagCorsoAssegnato) {
                    throw new AssociazioneStudenteCorsoFallitaException();
                }
            }
        }
    }
    
    private void retrievePresenze(Studente studente, LinkedList<Lezione> listaLezioni) throws SQLException, AssociazioneStudenteLezioneFallitaException {
        try (PreparedStatement pstRetrievePresenze = connection.prepareStatement(querySelectPresenze)) {
            pstRetrievePresenze.setInt(1, studente.getMatricola());

            try (ResultSet rsRetrievePresenze = pstRetrievePresenze.executeQuery()) {
                boolean flagLezioneAssegnata = true;
                
                while (rsRetrievePresenze.next()) {
                    flagLezioneAssegnata = false;
                    
                    for (Lezione lezione : listaLezioni) {
                        if(rsRetrievePresenze.getInt("codice_lezione") == lezione.getCodice()) {
                            studente.addPresenza(lezione);
                            lezione.addStudente(studente);
                            flagLezioneAssegnata = true;
                        }
                    }
                }
                
                if (!flagLezioneAssegnata) {
                    throw new AssociazioneStudenteLezioneFallitaException();
                }
            }
        }
    }

    @Override
    public void updateStudente(Studente studente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
