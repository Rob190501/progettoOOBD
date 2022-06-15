package dao.interfaccia;

import dto.AreaTematica;
import dto.Corso;
import eccezioni.associazioni.AssociazioneFallitaException;
import eccezioni.create.CreateFallitoException;
import eccezioni.delete.DeleteFallitoException;
import eccezioni.retrieve.RetrieveFallitoException;
import java.util.LinkedList;

public interface AreaDelCorsoDAOInterfaccia {
    
    public void createAreaDelCorso(Corso corso, AreaTematica areaTematica) throws CreateFallitoException;
    
    public void retrieveAllAreaDelCorso(Corso corso, LinkedList<AreaTematica> listaAreeTematiche) throws RetrieveFallitoException, AssociazioneFallitaException;
    
    public void deleteAreaDelCorso(Corso corso, AreaTematica areaTematica) throws DeleteFallitoException;
    
}
