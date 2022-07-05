package dao.interfaccia;

import dto.Corso;
import dto.Studente;
import eccezioni.associazioni.AssociazioneFallitaException;
import eccezioni.create.CreateFallitoException;
import eccezioni.delete.DeleteFallitoException;
import eccezioni.retrieve.RetrieveFallitoException;
import java.util.AbstractList;

public interface IscrizioniDAOInterfaccia {
    
    public abstract void createIscrizione(Studente studente, Corso corso) throws CreateFallitoException;
    
    public abstract void retrieveIscrizioniByStudente(Studente studente, AbstractList<Corso> listaCorsi) throws RetrieveFallitoException, AssociazioneFallitaException;
    
    public abstract void deleteIscrizione(Studente studente, Corso corso) throws DeleteFallitoException;
    
}
