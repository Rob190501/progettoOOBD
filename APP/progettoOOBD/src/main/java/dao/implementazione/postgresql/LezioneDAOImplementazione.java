package dao.implementazione.postgresql;

import controller.Controller;
import dao.interfaccia.LezioneDAOInterfaccia;
import dto.Corso;
import dto.Lezione;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

public class LezioneDAOImplementazione implements LezioneDAOInterfaccia {

    private Controller controller;
    private Connection connection;
    
    private String querySelectAllLezione = "SELECT * "+
                                           "FROM lezione";
    
    public LezioneDAOImplementazione(Controller controller) {
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
    public boolean createLezione(Lezione lez) {
        return true;
    }

    @Override
    public LinkedList<Lezione> retrieveAllLezione(LinkedList<Corso> listaCorsi) throws Exception{
        LinkedList<Lezione> listaLezioni = new LinkedList<Lezione>();
        
        PreparedStatement pstRetrieveAllLezione = connection.prepareStatement(querySelectAllLezione);
        
        ResultSet rsRetrieveAllLezione = pstRetrieveAllLezione.executeQuery();
        
        while(rsRetrieveAllLezione.next()) {
            int codice_lezione = rsRetrieveAllLezione.getInt("codice_lezione");
            String titolo_lezione = rsRetrieveAllLezione.getString("titolo_lezione");
            String descrizione_lezione = rsRetrieveAllLezione.getString("descrizione_lezione");
            String durata_lezione = rsRetrieveAllLezione.getString("durata_lezione");
            String data_inizio = rsRetrieveAllLezione.getString("data_inizio");
            String ora_inizio = rsRetrieveAllLezione.getString("ora_inizio");
            int codice_corso = rsRetrieveAllLezione.getInt("codice_corso");
            
            Corso corso_della_lezione = trovaCorso(codice_corso, listaCorsi);
            
            Lezione lezione = new Lezione(codice_lezione, titolo_lezione, descrizione_lezione, durata_lezione, data_inizio, ora_inizio, corso_della_lezione);
            
            listaLezioni.add(lezione);
        }
        
        pstRetrieveAllLezione.close();
        rsRetrieveAllLezione.close();
        
        return listaLezioni;
    }
    
    private Corso trovaCorso(int codice_corso, LinkedList<Corso> listaCorsi) {
        for(Corso corso : listaCorsi) {
            if(corso.getCodiceCorso() == codice_corso)
                return corso;
        }
        return null;
    }

    @Override
    public boolean updateLezione(Lezione lez) {
        return true;
    }

    @Override
    public boolean deleteLezione(Lezione lez) {
        return true;
    }
    
}
