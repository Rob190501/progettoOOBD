package dao.interfaccia;

import dto.AreaTematica;
import eccezioni.create.CreateFallitoException;
import eccezioni.delete.DeleteFallitoException;
import eccezioni.retrieve.RetrieveFallitoException;
import eccezioni.update.UpdateFallitoException;
import java.util.LinkedList;

public interface AreaTematicaDAOInterfaccia {
    
    public void createAreaTematica(AreaTematica area) throws CreateFallitoException;
    
    public LinkedList<AreaTematica> retrieveAllAreaTematica() throws RetrieveFallitoException;
    
    public void updateAreaTematica(AreaTematica areaTematica) throws UpdateFallitoException;
    
    public void deleteAreaTematica(AreaTematica areaTematica) throws DeleteFallitoException;
    
}
