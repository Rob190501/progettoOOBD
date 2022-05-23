package dao.implementazione.postgresql;

import controller.Controller;
import dao.interfaccia.CorsoDAOInterfaccia;
import dto.AreaTematica;
import dto.Corso;
import eccezioni.associazioni.AssociazioneCorsoAreaTematicaFallitaException;
import eccezioni.create.CreateCorsoFallitoException;
import eccezioni.delete.DeleteCorsoFallitoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

public class CorsoDAOImplementazione implements CorsoDAOInterfaccia {

    private Controller controller;
    private Connection connection;
    
    private String insertCorso = "INSERT "
                                      + "INTO corso (nome_corso, descrizione_corso, tasso_presenze_min, partecipanti_max) "
                                      + "VALUES (?, ?, ?, ?)";
    
    private String querySelectAllCorso = "SELECT * " +
                                         "FROM corso";
    
    private String querySelectAreeDelCorso = "SELECT codice_area_tematica " +
                                             "FROM area_del_corso " +
                                             "WHERE codice_corso = ?";
    
    private String deleteCorso = "DELETE "
                               + "FROM corso "
                               + "WHERE codice_corso = ?";
    
    public CorsoDAOImplementazione(Controller controller, Connection connection) {
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
    public void createCorso(Corso corso) throws SQLException, CreateCorsoFallitoException {
        try (PreparedStatement pstInsertCorso = connection.prepareStatement(insertCorso, Statement.RETURN_GENERATED_KEYS)) {
            pstInsertCorso.setString(1, corso.getNome());
            pstInsertCorso.setString(2, corso.getDescrizione());
            pstInsertCorso.setInt(3, corso.getTassoPresenzeMinime());
            pstInsertCorso.setInt(4, corso.getNumeroMassimoIscritti());
            if (pstInsertCorso.executeUpdate() != 1) {
                throw new CreateCorsoFallitoException();
            }
            try (ResultSet rsInsertAreaTematica = pstInsertCorso.getGeneratedKeys()) {
                if(rsInsertAreaTematica.next()) {
                    corso.setCodice(rsInsertAreaTematica.getInt(1));
                }
                else {
                    throw new CreateCorsoFallitoException();
                }
            }
        }
    }

    @Override
    public LinkedList<Corso> retrieveAllCorso(LinkedList<AreaTematica> listaAreeTematiche) throws SQLException, AssociazioneCorsoAreaTematicaFallitaException {
        try (Statement stmtRetrieveAllCorso = connection.createStatement()) {
            
            try (ResultSet rsRetrieveAllCorso = stmtRetrieveAllCorso.executeQuery(querySelectAllCorso)) {
                LinkedList listaCorsi = new LinkedList<Corso>();
                
                while (rsRetrieveAllCorso.next()) {
                    int codice_corso = rsRetrieveAllCorso.getInt("codice_corso");
                    String nome_corso = rsRetrieveAllCorso.getString("nome_corso");
                    String descrizione_corso = rsRetrieveAllCorso.getString("descrizione_corso");
                    int tasso_presenze_min = rsRetrieveAllCorso.getInt("tasso_presenze_min");
                    int partecipanti_max = rsRetrieveAllCorso.getInt("partecipanti_max");

                    Corso corso = new Corso(codice_corso, nome_corso, descrizione_corso, tasso_presenze_min, partecipanti_max);
                    aggiungiAreeTematiche(corso, listaAreeTematiche);

                    listaCorsi.add(corso);
                }
                
                return listaCorsi;
            }
        }
    }
    
    private void aggiungiAreeTematiche(Corso corso, LinkedList<AreaTematica> listaAreeTematiche) throws SQLException, AssociazioneCorsoAreaTematicaFallitaException {
        try (PreparedStatement pstAreeDelCorso = connection.prepareStatement(querySelectAreeDelCorso)) {
            pstAreeDelCorso.setInt(1, corso.getCodice());
            
            try (ResultSet rsAreeDelCorso = pstAreeDelCorso.executeQuery()) {
                boolean flagAreaTematicaAssegnata = true;

                while (rsAreeDelCorso.next()) {
                    flagAreaTematicaAssegnata = false;
                    
                    for (AreaTematica areaTematica : listaAreeTematiche) {
                        if(rsAreeDelCorso.getInt("codice_area_tematica") == areaTematica.getCodice()) {
                            corso.addAreaTematica(areaTematica);
                            areaTematica.addCorso(corso);
                            flagAreaTematicaAssegnata = true;
                        }
                    }
                }
                
                if (!flagAreaTematicaAssegnata){
                    throw new AssociazioneCorsoAreaTematicaFallitaException();
                }
            }
        }
    }

    @Override
    public void updateCorso(Corso corso) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteCorso(Corso corso) throws SQLException, DeleteCorsoFallitoException {
        try (PreparedStatement pstDeleteAreaCorso = connection.prepareStatement(deleteCorso)) {
            pstDeleteAreaCorso.setInt(1, corso.getCodice());
            if (pstDeleteAreaCorso.executeUpdate() != 1) {
                throw new DeleteCorsoFallitoException();
            }
        }
    }
    
}
