package dao.interfaccia;

import dto.Corso;
import eccezioni.associazioni.AssociazioneFallitaException;
import eccezioni.create.CreateFallitoException;
import eccezioni.delete.DeleteFallitoException;
import eccezioni.retrieve.RetrieveFallitoException;
import eccezioni.update.UpdateFallitoException;
import java.util.AbstractList;

public interface CorsoDAOInterfaccia {
    
    public abstract void createCorso(Corso corso) throws CreateFallitoException;
    
    public abstract AbstractList<Corso> retrieveAllCorso() throws RetrieveFallitoException, AssociazioneFallitaException;
    
    public abstract void updateCorso(Corso corso) throws UpdateFallitoException;
    
    public abstract void deleteCorso(Corso corso) throws DeleteFallitoException;
    
}