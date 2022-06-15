package dao.interfaccia;

import dto.Studente;
import eccezioni.associazioni.AssociazioneFallitaException;
import eccezioni.create.CreateFallitoException;
import eccezioni.delete.DeleteFallitoException;
import eccezioni.retrieve.RetrieveFallitoException;
import eccezioni.update.UpdateFallitoException;
import java.util.LinkedList;

public interface StudenteDAOInterfaccia {
    
    public void createStudente(Studente studente) throws CreateFallitoException;
    
    public LinkedList<Studente> retrieveAllStudente() throws RetrieveFallitoException, AssociazioneFallitaException;
    
    public void updateStudente(Studente studente) throws UpdateFallitoException;
    
    public void deleteStudente(Studente studente) throws DeleteFallitoException;
    
}
