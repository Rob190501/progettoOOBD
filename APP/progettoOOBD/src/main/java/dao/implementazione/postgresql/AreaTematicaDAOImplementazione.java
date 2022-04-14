package dao.implementazione.postgresql;

import controller.Controller;
import dao.interfaccia.AreaTematicaDAOInterfaccia;
import dto.AreaTematica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class AreaTematicaDAOImplementazione implements AreaTematicaDAOInterfaccia {

    private Controller controller;
    private Connection connection;
    
    private String query = "SELECT * " +
                           "FROM area_tematica";

    public AreaTematicaDAOImplementazione(Controller controller, Connection connection) {
        setController(controller);
        setConnection(connection);
    }
    
    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    
    @Override
    public void createAreaTematica(AreaTematica area) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public LinkedList<AreaTematica> retrieveAllAreaTematica() throws SQLException {
        LinkedList<AreaTematica> listaAreeTematiche = new LinkedList<>();
        
        PreparedStatement pst = connection.prepareStatement(query);
        
        ResultSet rs = pst.executeQuery();
        
        while(rs.next()) {
            int codice_area_tematica = rs.getInt("codice_area_tematica");
            String nome_area_tematica = rs.getString("nome_area_tematica");
            String descrizione_area = rs.getString("descrizione_area_tematica");
            
            AreaTematica area = new AreaTematica(codice_area_tematica, nome_area_tematica, descrizione_area);
            
            listaAreeTematiche.add(area);
        }
        
        pst.close();
        rs.close();
        
        return listaAreeTematiche;
    }

    @Override
    public void updateAreaTematica(AreaTematica areaTematica) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteAreaTematica(AreaTematica areaTematica) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
