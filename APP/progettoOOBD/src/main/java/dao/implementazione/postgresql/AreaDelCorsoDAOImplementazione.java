package dao.implementazione.postgresql;

import controller.Controller;
import dao.interfaccia.SQL.AreaDelCorsoDAOInterfaccia;
import dto.AreaTematica;
import dto.Corso;
import eccezioni.create.CreateAreaDelCorsoFallitoException;
import eccezioni.delete.DeleteAreaDelCorsoFallitoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;



public class AreaDelCorsoDAOImplementazione implements AreaDelCorsoDAOInterfaccia {

    private Controller controller;
    private Connection connection;
    
    private String selectAreeDelCorso = "SELECT codice_area_tematica "
                                      + "FROM area_del_corso "
                                      + "WHERE codice_corso = ?";

    public AreaDelCorsoDAOImplementazione(Controller controller, Connection connection) {
        this.controller = controller;
        this.connection = connection;
    }
    
    @Override
    public void createAreaDelCorso(Corso corso, AreaTematica areaTematica) throws SQLException, CreateAreaDelCorsoFallitoException {
        
    }

    @Override
    public void retrieveAreeDelCorso(Corso corso, LinkedList<AreaTematica> listaAreeTematiche) throws SQLException {
        try (PreparedStatement pstAreeDelCorso = connection.prepareStatement(selectAreeDelCorso)) {
            pstAreeDelCorso.setInt(1, corso.getCodice());
            try (ResultSet rsAreeDelCorso = pstAreeDelCorso.executeQuery()) {
                while (rsAreeDelCorso.next()) {
                    for (AreaTematica areaTematica : listaAreeTematiche) {
                        if(rsAreeDelCorso.getInt("codice_area_tematica") == areaTematica.getCodice()) {
                            corso.addAreaTematica(areaTematica);
                            areaTematica.addCorso(corso);
                        }
                    }
                }
            }
        }
    }

    @Override
    public void deleteAreaDelCorso(Corso corso, AreaTematica areaTematica) throws SQLException, DeleteAreaDelCorsoFallitoException {
        
    }
    
}
