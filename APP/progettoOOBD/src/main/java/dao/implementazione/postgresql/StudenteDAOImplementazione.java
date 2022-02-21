package dao.implementazione.postgresql;

import controller.Controller;
import dao.interfaccia.StudenteDAOInterfaccia;
import dto.Corso;
import dto.Lezione;
import dto.Studente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.ListIterator;

public class StudenteDAOImplementazione implements StudenteDAOInterfaccia {

    private Controller controller;
    private Connection connection;
    
    private String insertStudente = "INSERT INTO studente (nome, cognome) VALUES (?, ?)";
    
    private String querySelectAllStudente = "SELECT * " +
                                            "FROM studente";
    
    private String querySelectCorsiFrequentati = "SELECT * " +
                                                 "FROM studenti_del_corso " +
                                                 "WHERE matricola = ?";
    
    private String querySelectPresenze = "SELECT * " +
                                         "FROM presenze " +
                                         "WHERE matricola = ?";
    
    public StudenteDAOImplementazione(Controller controller) {
        setController(controller);
        setConnection(controller.getConnection());
    }

    private void setController(Controller controller) {
        this.controller = controller;
    }

    private void setConnection(Connection connection) {
        this.connection = connection;
    }
    
    
    
    @Override
    public boolean createStudente(Studente studente) throws Exception {
        PreparedStatement pstInsertStudente = connection.prepareStatement(insertStudente, Statement.RETURN_GENERATED_KEYS);
        
        pstInsertStudente.setString(1, studente.getNome());
        
        pstInsertStudente.setString(2, studente.getCognome());
        
        pstInsertStudente.executeUpdate();
        
        ResultSet rsInsertStudente = pstInsertStudente.getGeneratedKeys();
        
        if(rsInsertStudente.next()) {
            studente.setMatricola(rsInsertStudente.getInt(1));
            return true;
        }
        else
            return false;
    }

    @Override
    public LinkedList<Studente> retrieveAllStudente(LinkedList<Corso>listaCorsi, LinkedList<Lezione> listaLezioni) throws Exception {
        LinkedList<Studente> listaStudenti = new LinkedList<Studente>();
        
        PreparedStatement pstRetrieveAllStudente = connection.prepareStatement(querySelectAllStudente);
        
        ResultSet rsRetrieveAllStudente = pstRetrieveAllStudente.executeQuery();
        
        while(rsRetrieveAllStudente.next()) {
            int matricola = rsRetrieveAllStudente.getInt("matricola");
            String nome = rsRetrieveAllStudente.getString("nome");
            String cognome = rsRetrieveAllStudente.getString("cognome");
            
            Studente studente = new Studente(matricola, nome, cognome);
            
            retrieveCorsiFrequentati(studente, listaCorsi);
            
            retrievePresenze(studente, listaLezioni);
            
            listaStudenti.add(studente);
        }
        
        pstRetrieveAllStudente.close();
        rsRetrieveAllStudente.close();
        
        return listaStudenti;
    }
    
    private void retrieveCorsiFrequentati(Studente studente, LinkedList<Corso> listaCorsi) throws Exception {
        PreparedStatement pstRetrieveCorsiFrequentati = connection.prepareStatement(querySelectCorsiFrequentati);
        
        pstRetrieveCorsiFrequentati.setInt(1, studente.getMatricola());
        
        ResultSet rsRetrieveCorsiFrequentati = pstRetrieveCorsiFrequentati.executeQuery();
        
        while(rsRetrieveCorsiFrequentati.next()) {
            for(Corso corso : listaCorsi) {
                if(rsRetrieveCorsiFrequentati.getInt("codice_corso") == corso.getCodiceCorso()) {
                    studente.addCorso(corso);
                }
            }
        }
        
        pstRetrieveCorsiFrequentati.close();
        rsRetrieveCorsiFrequentati.close();
    }
    
    private void retrievePresenze(Studente studente, LinkedList<Lezione> listaLezioni) throws Exception {
        PreparedStatement pstRetrievePresenze = connection.prepareStatement(querySelectPresenze);
        
        pstRetrievePresenze.setInt(1, studente.getMatricola());
        
        ResultSet rsRetrievePresenze = pstRetrievePresenze.executeQuery();
        
        while(rsRetrievePresenze.next()) {
            for(Lezione lezione : listaLezioni) {
                if(rsRetrievePresenze.getInt("codice_lezione") == lezione.getCodiceLezione()) {
                    studente.addPresenza(lezione);
                }
            }
        }
        
        pstRetrievePresenze.close();
        rsRetrievePresenze.close();
    }

    @Override
    public boolean updateStudente(Studente studente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean deleteStudente(Studente studente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
