package dao.interfaccia;

import dto.AreaTematica;
import dto.Corso;
import eccezioni.create.CreateCorsoFallitoException;
import eccezioni.delete.DeleteCorsoFallitoException;
import java.sql.SQLException;
import java.util.LinkedList;

public interface CorsoDAOInterfaccia {
    
    public void createCorso(Corso corso) throws SQLException, CreateCorsoFallitoException;
    
    public LinkedList<Corso> retrieveAllCorso(LinkedList<AreaTematica> listaAreeTematiche) throws Exception;
    
    public void updateCorso(Corso corso);
    
    public void deleteCorso(Corso corso) throws SQLException, DeleteCorsoFallitoException;
    
}