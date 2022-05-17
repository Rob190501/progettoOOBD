package dao.interfaccia;

import dto.AreaTematica;
import eccezioni.create.CreateAreaTematicaFallitaException;
import eccezioni.delete.DeleteAreaTematicaFallitaException;
import java.sql.SQLException;
import java.util.LinkedList;

public interface AreaTematicaDAOInterfaccia {
    
    public void createAreaTematica(AreaTematica area) throws SQLException, CreateAreaTematicaFallitaException;
    
    public LinkedList<AreaTematica> retrieveAllAreaTematica() throws SQLException;
    
    public void updateAreaTematica(AreaTematica areaTematica);
    
    public void deleteAreaTematica(AreaTematica areaTematica) throws SQLException, DeleteAreaTematicaFallitaException;
    
}
