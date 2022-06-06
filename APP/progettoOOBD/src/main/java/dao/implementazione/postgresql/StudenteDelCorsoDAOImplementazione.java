package dao.implementazione.postgresql;

import controller.Controller;
import dao.interfaccia.SQL.StudenteDelCorsoDAOInterfaccia;
import dto.Corso;
import dto.Lezione;
import dto.Studente;
import eccezioni.create.CreateStudenteDelCorsoFallitoException;
import eccezioni.delete.DeletePresenzaFallitoException;
import eccezioni.delete.DeleteStudenteDelCorsoFallitoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;



public class StudenteDelCorsoDAOImplementazione implements StudenteDelCorsoDAOInterfaccia {

    private Controller controller;
    private Connection connection;

    public StudenteDelCorsoDAOImplementazione(Controller controller, Connection connection) {
        this.controller = controller;
        this.connection = connection;
    }
    
    private String insertStudenteDelCorso = "INSERT "
                                          + "INTO studenti_del_corso (matricola, codice_corso) "
                                          + "VALUES (?, ?)";
    
    private String selectCorsiFrequentati = "SELECT * "
                                          + "FROM studenti_del_corso "
                                          + "WHERE matricola = ?";
    
    private String deleteStudenteDelCorso = "DELETE "
                                          + "FROM studenti_del_corso "
                                          + "WHERE matricola = ? AND codice_corso = ?";
    
    @Override
    public void createStudenteDelCorso(Studente studente, Corso corso) throws SQLException, CreateStudenteDelCorsoFallitoException {
        try (PreparedStatement pstInsertStudenteDelCorso = connection.prepareStatement(insertStudenteDelCorso)) {
            pstInsertStudenteDelCorso.setInt(1, studente.getMatricola());
            pstInsertStudenteDelCorso.setInt(2, corso.getCodice());
            if (pstInsertStudenteDelCorso.executeUpdate() != 1) {
                throw new CreateStudenteDelCorsoFallitoException();
            }
            studente.addCorso(corso);
            corso.addStudente(studente);
        }
    }
    
    public void retrieveCorsiFrequentati(Studente studente, LinkedList<Corso> listaCorsi) throws SQLException {
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

    @Override
    public void deleteStudenteDelCorso(Studente studente, Corso corso) throws SQLException, DeleteStudenteDelCorsoFallitoException, DeletePresenzaFallitoException {
        try (PreparedStatement pstDeleteStudenteDelCorso = connection.prepareStatement(deleteStudenteDelCorso)) {
            pstDeleteStudenteDelCorso.setInt(1, studente.getMatricola());
            pstDeleteStudenteDelCorso.setInt(2, corso.getCodice());
            if (pstDeleteStudenteDelCorso.executeUpdate() != 1) {
                throw new DeleteStudenteDelCorsoFallitoException();
            }
            studente.removeCorso(corso);
            corso.removeStudente(studente);
            for(Lezione lezione : studente.getPresenze()) {
                if(lezione.getCorsoDellaLezione().equals(corso)) {
                    controller.removePresenza(studente, lezione);
                }
            }
        }
    }
    
}
