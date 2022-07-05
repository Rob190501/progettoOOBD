package dao.interfaccia;

import dto.AreaTematica;
import eccezioni.create.CreateFallitoException;
import eccezioni.delete.DeleteFallitoException;
import eccezioni.retrieve.RetrieveFallitoException;
import eccezioni.update.UpdateFallitoException;
import java.util.AbstractList;

public interface AreaTematicaDAOInterfaccia {
    
    public abstract void createAreaTematica(AreaTematica area) throws CreateFallitoException;
    
    public abstract AbstractList<AreaTematica> retrieveAllAreaTematica() throws RetrieveFallitoException;
    
    public abstract void updateAreaTematica(AreaTematica areaTematica) throws UpdateFallitoException;
    
    public abstract void deleteAreaTematica(AreaTematica areaTematica) throws DeleteFallitoException;
    
}
