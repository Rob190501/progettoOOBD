package dao.interfaccia;

import dto.AreaTematica;
import dto.Corso;
import eccezioni.associazioni.AssociazioneFallitaException;
import eccezioni.create.CreateFallitoException;
import eccezioni.delete.DeleteFallitoException;
import eccezioni.retrieve.RetrieveFallitoException;
import java.util.AbstractList;

public interface AreaDelCorsoDAOInterfaccia {
    
    public abstract void createAreaDelCorso(Corso corso, AreaTematica areaTematica) throws CreateFallitoException;
    
    public abstract void retrieveAllAreaDelCorso(Corso corso, AbstractList<AreaTematica> listaAreeTematiche) throws RetrieveFallitoException, AssociazioneFallitaException;
    
    public abstract void deleteAreaDelCorso(Corso corso, AreaTematica areaTematica) throws DeleteFallitoException;
    
}
