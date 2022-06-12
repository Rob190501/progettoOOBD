package dao.interfaccia;

import dto.AreaTematica;
import eccezioni.create.CreateAreaTematicaFallitoException;
import eccezioni.delete.DeleteAreaTematicaFallitoException;
import eccezioni.retrieve.RetrieveAreaTematicaFallitoException;
import eccezioni.update.UpdateAreaTematicaFallitoException;
import java.util.LinkedList;

public interface AreaTematicaDAOInterfaccia {
    
    public void createAreaTematica(AreaTematica area) throws CreateAreaTematicaFallitoException;
    
    public LinkedList<AreaTematica> retrieveAllAreaTematica() throws RetrieveAreaTematicaFallitoException;
    
    public void updateAreaTematica(AreaTematica areaTematica) throws UpdateAreaTematicaFallitoException;
    
    public void deleteAreaTematica(AreaTematica areaTematica) throws DeleteAreaTematicaFallitoException;
    
}
