package dao.interfaccia;

import dto.AreaTematica;
import java.util.LinkedList;

public interface AreaTematicaDAOInterfaccia {
    
    public void createAreaTematica(AreaTematica area);
    
    public LinkedList<AreaTematica> retrieveAllAreaTematica() throws Exception;
    
    public void updateAreaTematica(AreaTematica areaTematica);
    
    public void deleteAreaTematica(AreaTematica areaTematica);
    
}
