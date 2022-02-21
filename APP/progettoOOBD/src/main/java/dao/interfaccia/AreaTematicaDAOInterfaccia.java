package dao.interfaccia;

import dto.AreaTematica;
import java.util.LinkedList;

public interface AreaTematicaDAOInterfaccia {
    
    public boolean createAreaTematica(AreaTematica area);
    
    public LinkedList<AreaTematica> retrieveAllAreaTematica() throws Exception;
    
    public boolean updateAreaTematica(AreaTematica areaTematica);
    
    public boolean deleteAreaTematica(AreaTematica areaTematica);
    
}
