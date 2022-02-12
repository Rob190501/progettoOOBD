package dao.interfaccia;

import dto.AreaTematica;
import java.util.LinkedList;

public interface AreaTematicaDAOInterfaccia {
    
    public boolean createLezione(AreaTematica area);
    
    public AreaTematica retrieveAreaTematicaByNomeAreaTematica(String nomeAreaTematica);
    
    public LinkedList<AreaTematica> retrieveAllAreaTematica() throws Exception;
    
    public boolean updateAreaTematica(AreaTematica areaTematica);
    
    public boolean deleteAreaTematica(AreaTematica areaTematica);
    
}
