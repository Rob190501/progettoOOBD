package dao.implementazione.postgresql;

import controller.Controller;
import dao.interfaccia.AreaTematicaDAOInterfaccia;
import dto.AreaTematica;
import eccezioni.create.CreateAreaTematicaFallitoException;
import eccezioni.delete.DeleteAreaTematicaFallitoException;
import eccezioni.retrieve.RetrieveAreaTematicaFallitoException;
import eccezioni.update.UpdateAreaTematicaFallitoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

public class AreaTematicaDAOImplementazione implements AreaTematicaDAOInterfaccia {

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

    public AreaTematicaDAOImplementazione(Controller controller, Connection connection) {
        this.controller = controller;
        this.connection = connection;
    }
    
    @Override
    public void createAreaTematica(AreaTematica area) throws CreateAreaTematicaFallitoException {
        try (PreparedStatement pstInsertAreaTematica = connection.prepareStatement(insertAreaTematica, Statement.RETURN_GENERATED_KEYS)) {
            pstInsertAreaTematica.setString(1, area.getNome());
            pstInsertAreaTematica.setString(2, area.getDescrizione());
            if (pstInsertAreaTematica.executeUpdate() != 1) {
                throw new CreateAreaTematicaFallitoException();
            }
            try (ResultSet rsInsertAreaTematica = pstInsertAreaTematica.getGeneratedKeys()) {
                if(rsInsertAreaTematica.next()) {
                    area.setCodice(rsInsertAreaTematica.getInt(1));
                }
                else {
                    throw new CreateAreaTematicaFallitoException();
                }
            }
        }
        catch(SQLException e) {
            throw new CreateAreaTematicaFallitoException(e.getMessage());
        }
    }

    @Override
    public LinkedList<AreaTematica> retrieveAllAreaTematica() throws RetrieveAreaTematicaFallitoException {
        try(PreparedStatement pst = connection.prepareStatement(selectAllAreaTematica); 
            ResultSet rs = pst.executeQuery()) {
            LinkedList<AreaTematica> listaAreeTematiche = new LinkedList<>();
            
            while(rs.next()) {
                int codice_area_tematica = rs.getInt("codice");
                String nome = rs.getString("nome");
                String descrizione = rs.getString("descrizione");

                AreaTematica area = new AreaTematica(codice_area_tematica, nome, descrizione);

                listaAreeTematiche.add(area);
            }
            
            return listaAreeTematiche;
        }
        catch(SQLException e) {
            throw new RetrieveAreaTematicaFallitoException(e.getMessage());
        }
    }

    @Override
    public void updateAreaTematica(AreaTematica areaTematica) throws UpdateAreaTematicaFallitoException {
        try (PreparedStatement pstUpdateAreaTematica = connection.prepareStatement(updateAreaTematica)) {
            pstUpdateAreaTematica.setString(1, areaTematica.getNome());
            pstUpdateAreaTematica.setString(2, areaTematica.getDescrizione());
            pstUpdateAreaTematica.setInt(3, areaTematica.getCodice());
            if (pstUpdateAreaTematica.executeUpdate() != 1) {
                throw new UpdateAreaTematicaFallitoException();
            }
        }
        catch(SQLException e) {
            throw new UpdateAreaTematicaFallitoException(e.getMessage());
        }
    }

    @Override
    public void deleteAreaTematica(AreaTematica areaTematica) throws DeleteAreaTematicaFallitoException {
        try (PreparedStatement pstDeleteAreaTematica = connection.prepareStatement(deleteAreaTematica)) {
            pstDeleteAreaTematica.setInt(1, areaTematica.getCodice());
            if (pstDeleteAreaTematica.executeUpdate() != 1) {
                throw new DeleteAreaTematicaFallitoException();
            }
            areaTematica.rimuoviDaAssociazioni();
        }
        catch(SQLException e) {
            throw new DeleteAreaTematicaFallitoException(e.getMessage());
        }
    }
    
}
