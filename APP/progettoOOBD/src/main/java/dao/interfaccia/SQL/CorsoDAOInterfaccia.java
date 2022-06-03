package dao.interfaccia.SQL;

import dto.AreaTematica;
import dto.Corso;
import eccezioni.create.CreateCorsoFallitoException;
import eccezioni.delete.DeleteCorsoFallitoException;
import eccezioni.update.UpdateCorsoFallitoException;
import java.sql.SQLException;
import java.util.LinkedList;

public interface CorsoDAOInterfaccia {
    
    public void createCorso(Corso corso) throws SQLException, CreateCorsoFallitoException;
    
    public LinkedList<Corso> retrieveAllCorso(LinkedList<AreaTematica> listaAreeTematiche) throws SQLException;
    
    public void updateCorso(Corso corso) throws SQLException, UpdateCorsoFallitoException;
    
    public void deleteCorso(Corso corso) throws SQLException, DeleteCorsoFallitoException;
    
}