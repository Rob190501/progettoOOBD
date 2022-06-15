package dao.interfaccia;

import dto.Lezione;
import dto.Studente;
import eccezioni.associazioni.AssociazioneFallitaException;
import eccezioni.create.CreateFallitoException;
import eccezioni.delete.DeleteFallitoException;
import eccezioni.retrieve.RetrieveFallitoException;
import java.util.LinkedList;

public interface PresenzeDAOInterfaccia {
    
    public void createPresenza(Studente studente, Lezione lezione) throws CreateFallitoException;
    
    public void retrievePresenzeByStudente(Studente studente, LinkedList<Lezione> listaLezioni) throws RetrieveFallitoException, AssociazioneFallitaException;
    
    public void deletePresenza(Studente studente, Lezione lezione) throws DeleteFallitoException;
    
}
