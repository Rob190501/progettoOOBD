package dao.interfaccia.SQL;

import dto.AreaTematica;
import dto.Corso;
import eccezioni.create.CreateAreaDelCorsoFallitoException;
import eccezioni.delete.DeleteAreaDelCorsoFallitoException;
import java.sql.SQLException;
import java.util.LinkedList;

public interface AreaDelCorsoDAOInterfaccia {
    
    public void createAreaDelCorso(Corso corso, AreaTematica areaTematica) throws SQLException, CreateAreaDelCorsoFallitoException;
    
    public void retrieveAreeDelCorso(Corso corso, LinkedList<AreaTematica> listaAreeTematiche) throws SQLException;
    
    public void deleteAreaDelCorso(Corso corso, AreaTematica areaTematica) throws SQLException, DeleteAreaDelCorsoFallitoException;
    
}
