package dao.interfaccia;

import dto.Studente;
import eccezioni.associazioni.AssociazioneFallitaException;
import eccezioni.create.CreateFallitoException;
import eccezioni.delete.DeleteFallitoException;
import eccezioni.retrieve.RetrieveFallitoException;
import eccezioni.update.UpdateFallitoException;
import java.util.AbstractList;

public interface StudenteDAOInterfaccia {
    
    public abstract void createStudente(Studente studente) throws CreateFallitoException;
    
    public abstract AbstractList<Studente> retrieveAllStudente() throws RetrieveFallitoException, AssociazioneFallitaException;
    
    public abstract void updateStudente(Studente studente) throws UpdateFallitoException;
    
    public abstract void deleteStudente(Studente studente) throws DeleteFallitoException;
    
}
