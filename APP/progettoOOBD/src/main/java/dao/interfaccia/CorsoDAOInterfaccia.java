package dao.interfaccia;

import dto.AreaTematica;
import dto.Corso;
import java.util.LinkedList;

public interface CorsoDAOInterfaccia {
    
    public void createCorso(Corso corso);
    
    public LinkedList<Corso> retrieveAllCorso(LinkedList<AreaTematica> listaAreeTematiche) throws Exception;
    
    public void updateCorso(Corso corso);
    
    public void deleteCorso(Corso corso);
    
}