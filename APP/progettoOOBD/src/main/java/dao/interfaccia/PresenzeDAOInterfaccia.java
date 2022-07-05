package dao.interfaccia;

import dto.Lezione;
import dto.Studente;
import eccezioni.associazioni.AssociazioneFallitaException;
import eccezioni.create.CreateFallitoException;
import eccezioni.delete.DeleteFallitoException;
import eccezioni.retrieve.RetrieveFallitoException;
import java.util.AbstractList;

public interface PresenzeDAOInterfaccia {
    
    public abstract void createPresenza(Studente studente, Lezione lezione) throws CreateFallitoException;
    
    public abstract void retrievePresenzeByStudente(Studente studente, AbstractList<Lezione> listaLezioni) throws RetrieveFallitoException, AssociazioneFallitaException;
    
    public abstract void deletePresenza(Studente studente, Lezione lezione) throws DeleteFallitoException;
    
}
