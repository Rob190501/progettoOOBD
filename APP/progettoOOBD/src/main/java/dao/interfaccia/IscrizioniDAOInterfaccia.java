package dao.interfaccia;

import dto.Corso;
import dto.Studente;
import eccezioni.associazioni.AssociazioneFallitaException;
import eccezioni.create.CreateFallitoException;
import eccezioni.delete.DeleteFallitoException;
import eccezioni.retrieve.RetrieveFallitoException;
import java.util.LinkedList;

public interface IscrizioniDAOInterfaccia {
    
    public void createIscrizione(Studente studente, Corso corso) throws CreateFallitoException;
    
    public void retrieveIscrizioniByStudente(Studente studente, LinkedList<Corso> listaCorsi) throws RetrieveFallitoException, AssociazioneFallitaException;
    
    public void deleteIscrizione(Studente studente, Corso corso) throws DeleteFallitoException;
    
}
