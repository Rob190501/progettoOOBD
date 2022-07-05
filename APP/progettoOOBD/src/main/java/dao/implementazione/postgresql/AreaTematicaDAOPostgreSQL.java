package dao.implementazione.postgresql;

import controller.Controller;
import dao.interfaccia.AreaTematicaDAOInterfaccia;
import dto.AreaTematica;
import eccezioni.create.CreateFallitoException;
import eccezioni.delete.DeleteFallitoException;
import eccezioni.retrieve.RetrieveFallitoException;
import eccezioni.update.UpdateFallitoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.AbstractList;
import java.util.LinkedList;

public class AreaTematicaDAOPostgreSQL implements AreaTematicaDAOInterfaccia {

    private Controller controller;
    private Connection connection;
    
    private String selectAllAreaTematica = "SELECT * "
                                         + "FROM aree_tematiche";
    
    private String insertAreaTematica = "INSERT "
                                      + "INTO aree_tematiche (nome, descrizione)"
                                      + "VALUES (?, ?)";
    
    private String deleteAreaTematica = "DELETE "
                                      + "FROM aree_tematiche "
                                      + "WHERE codice = ?";
    
    private String updateAreaTematica = "UPDATE aree_tematiche "
                                      + "SET nome = ?, descrizione = ?"
                                      + "WHERE codice = ?";

    public AreaTematicaDAOPostgreSQL(Controller controller, Connection connection) {
        this.controller = controller;
        this.connection = connection;
    }
    
    @Override
    public void createAreaTematica(AreaTematica area) throws CreateFallitoException {
        try (PreparedStatement pstmt = connection.prepareStatement(insertAreaTematica, Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setString(1, area.getNome());
            pstmt.setString(2, area.getDescrizione());
            pstmt.executeUpdate();
            try (ResultSet rs = pstmt.getGeneratedKeys()) {
                rs.next();
                area.setCodice(rs.getInt(1));
            }
        }
        catch(SQLException e) {
            throw new CreateFallitoException("Area Tematica", e.getMessage());
        }
    }

    @Override
    public AbstractList<AreaTematica> retrieveAllAreaTematica() throws RetrieveFallitoException {
        try(Statement stmt = connection.createStatement(); 
            ResultSet rs = stmt.executeQuery(selectAllAreaTematica)) {
            AbstractList<AreaTematica> listaAreeTematiche = new LinkedList<>();
            
            while(rs.next()) {
                int codice = rs.getInt("codice");
                String nome = rs.getString("nome");
                String descrizione = rs.getString("descrizione");
                AreaTematica area = new AreaTematica(codice, nome, descrizione);
                listaAreeTematiche.add(area);
            }
            
            return listaAreeTematiche;
        }
        catch(SQLException e) {
            throw new RetrieveFallitoException("l'Area Tematica", e.getMessage());
        }
    }

    @Override
    public void updateAreaTematica(AreaTematica areaTematica) throws UpdateFallitoException {
        try (PreparedStatement pstmt = connection.prepareStatement(updateAreaTematica)) {
            pstmt.setString(1, areaTematica.getNome());
            pstmt.setString(2, areaTematica.getDescrizione());
            pstmt.setInt(3, areaTematica.getCodice());
            pstmt.executeUpdate();
        }
        catch(SQLException e) {
            throw new UpdateFallitoException("l'Area Tematica", e.getMessage());
        }
    }

    @Override
    public void deleteAreaTematica(AreaTematica areaTematica) throws DeleteFallitoException {
        try (PreparedStatement pstmt = connection.prepareStatement(deleteAreaTematica)) {
            pstmt.setInt(1, areaTematica.getCodice());
            pstmt.executeUpdate();
            areaTematica.rimuoviDaAssociazioni();
        }
        catch(SQLException e) {
            throw new DeleteFallitoException("l'Area Tematica", e.getMessage());
        }
    }
    
}
