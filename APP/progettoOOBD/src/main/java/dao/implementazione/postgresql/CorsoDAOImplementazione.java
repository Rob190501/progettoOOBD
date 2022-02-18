package dao.implementazione.postgresql;

import controller.Controller;
import dao.interfaccia.CorsoDAOInterfaccia;
import dto.AreaTematica;
import dto.Corso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

public class CorsoDAOImplementazione implements CorsoDAOInterfaccia {

    private Controller controller;
    private Connection connection;
    
    private String querySelectAllCorso = "SELECT * " +
                                         "FROM corso";
    
    private String querySelectAreeDelCorso = "SELECT codice_area_tematica " +
                                             "FROM area_del_corso " +
                                             "WHERE codice_corso = ?";
    
    public CorsoDAOImplementazione(Controller controller) {
        setController(controller);
        setConnection(controller.getConnection());
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    
    @Override
    public boolean createCorso(Corso corso) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Corso retrieveCorsoByNomeCorso(String nomeAreaTematica) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public LinkedList<Corso> retrieveAllCorso(LinkedList<AreaTematica> listaAreeTematiche) throws Exception {
        LinkedList<Corso> listaCorsi = new LinkedList<Corso>();
        
        PreparedStatement pstRetrieveAllCorso = connection.prepareStatement(querySelectAllCorso);
        
        ResultSet rsRetrieveAllCorso = pstRetrieveAllCorso.executeQuery();
        
        while(rsRetrieveAllCorso.next()) {
            int codice_corso = rsRetrieveAllCorso.getInt("codice_corso");
            String nome_corso = rsRetrieveAllCorso.getString("nome_corso");
            String descrizione_corso = rsRetrieveAllCorso.getString("descrizione_corso");
            int tasso_presenze_min = rsRetrieveAllCorso.getInt("tasso_presenze_min");
            int partecipanti_max = rsRetrieveAllCorso.getInt("partecipanti_max");
            
            Corso corso = new Corso(codice_corso, nome_corso, descrizione_corso, tasso_presenze_min, partecipanti_max);
            
            aggiungiAreeTematiche(corso, listaAreeTematiche);
            
            listaCorsi.add(corso);
        }
        
        pstRetrieveAllCorso.close();
        rsRetrieveAllCorso.close();
        
        return listaCorsi;
    }
    
    public void aggiungiAreeTematiche(Corso corso, LinkedList<AreaTematica> listaAreeTematiche) throws Exception{
        PreparedStatement pstAreeDelCorso = connection.prepareStatement(querySelectAreeDelCorso);
            
            pstAreeDelCorso.setInt(1, corso.getCodiceCorso());
            
            ResultSet rsAreeDelCorso = pstAreeDelCorso.executeQuery();
            
            while(rsAreeDelCorso.next()) {
                for(AreaTematica areaTematica : listaAreeTematiche) {
                    if(areaTematica.getCodiceAreaTematica() == rsAreeDelCorso.getInt("codice_area_tematica"))
                        corso.addAreaTematica(areaTematica);
                }
            }
            
            pstAreeDelCorso.close();
            rsAreeDelCorso.close();
    }

    @Override
    public boolean updateCorso(Corso corso) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean deleteCorso(Corso corso) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
