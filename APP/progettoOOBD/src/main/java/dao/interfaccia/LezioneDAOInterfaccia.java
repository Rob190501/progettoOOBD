package dao.interfaccia;

import dto.Corso;
import dto.Lezione;
import eccezioni.associazioni.AssociazioneFallitaException;
import eccezioni.create.CreateFallitoException;
import eccezioni.delete.DeleteFallitoException;
import eccezioni.retrieve.RetrieveFallitoException;
import eccezioni.update.UpdateFallitoException;
import java.util.AbstractList;

public interface LezioneDAOInterfaccia {
    
    public abstract void createLezione(Lezione lez) throws CreateFallitoException;
    
    public abstract AbstractList<Lezione> retrieveAllLezione() throws RetrieveFallitoException, AssociazioneFallitaException;
    
    public abstract void retrieveCorsoDellaLezione(Lezione lezione, AbstractList<Corso> listaCorsi) throws RetrieveFallitoException, AssociazioneFallitaException;
    
    public abstract void updateLezione(Lezione lez) throws UpdateFallitoException;
    
    public abstract void deleteLezione(Lezione lez) throws DeleteFallitoException;
    
}
