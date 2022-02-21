package dao.interfaccia;

import dto.AreaTematica;
import dto.Corso;
import java.util.LinkedList;

public interface CorsoDAOInterfaccia {
    
    public boolean createCorso(Corso corso);
    
    public LinkedList<Corso> retrieveAllCorso(LinkedList<AreaTematica> listaAreeTematiche) throws Exception;
    
    public boolean updateCorso(Corso corso);
    
    public boolean deleteCorso(Corso corso);
    
}