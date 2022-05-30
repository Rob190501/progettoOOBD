package dao.implementazione.postgresql;

import controller.Controller;
import dao.interfaccia.StudenteDAOInterfaccia;
import dto.Corso;
import dto.Lezione;
import dto.Studente;
import eccezioni.associazioni.AssociazioneStudenteCorsoFallitaException;
import eccezioni.associazioni.AssociazioneStudenteLezioneFallitaException;
import eccezioni.create.CreateStudenteDelCorsoFallitoException;
import eccezioni.create.CreateStudenteFallitoException;
import eccezioni.delete.DeleteStudenteDelCorsoFallitoException;
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
    
    private String deleteStudente = "DELETE "
                                  + "FROM studente "
                                  + "WHERE matricola = ?";
    
    private String insertStudenteDelCorso = "INSERT "
                                          + "INTO studenti_del_corso (matricola, codice_corso) "
                                          + "VALUES (?, ?)";
    
    private String updateStudente = "UPDATE studente "
                                  + "SET nome = ?, cognome = ?"
                                  + "WHERE matricola = ?";
    
    private String deleteStudenteDelCorso = "DELETE "
                                          + "FROM studenti_del_corso "
                                          + "WHERE matricola = ? AND codice_corso = ?";
    
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
    public LinkedList<Studente> retrieveAllStudente(LinkedList<Corso>listaCorsi, LinkedList<Lezione> listaLezioni) throws SQLException, AssociazioneStudenteCorsoFallitaException, AssociazioneStudenteLezioneFallitaException {
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
    
    private void retrieveCorsiFrequentati(Studente studente, LinkedList<Corso> listaCorsi) throws SQLException, AssociazioneStudenteCorsoFallitaException {
        try (PreparedStatement pstRetrieveCorsiFrequentati = connection.prepareStatement(selectCorsiFrequentati)) {
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
        try (PreparedStatement pstRetrievePresenze = connection.prepareStatement(selectPresenze)) {
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
    
    public void createStudenteDelCorso(Studente studente, Corso corso) throws SQLException, CreateStudenteDelCorsoFallitoException {
        try (PreparedStatement pstInsertStudenteDelCorso = connection.prepareStatement(insertStudenteDelCorso)) {
            pstInsertStudenteDelCorso.setInt(1, studente.getMatricola());
            pstInsertStudenteDelCorso.setInt(2, corso.getCodice());
            if (pstInsertStudenteDelCorso.executeUpdate() != 1) {
                throw new CreateStudenteDelCorsoFallitoException();
            }
        }
    }
    
    public void deleteStudenteDelCorso(Studente studente, Corso corso) throws SQLException, DeleteStudenteDelCorsoFallitoException {
        try (PreparedStatement pstDeleteStudenteDelCorso = connection.prepareStatement(deleteStudenteDelCorso)) {
            pstDeleteStudenteDelCorso.setInt(1, studente.getMatricola());
            pstDeleteStudenteDelCorso.setInt(2, corso.getCodice());
            if (pstDeleteStudenteDelCorso.executeUpdate() != 1) {
                throw new DeleteStudenteDelCorsoFallitoException();
            }
        }
    }
    
}
