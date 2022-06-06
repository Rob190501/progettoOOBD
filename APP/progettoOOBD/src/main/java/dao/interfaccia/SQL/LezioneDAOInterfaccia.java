package dao.interfaccia.SQL;

import dto.Corso;
import dto.Lezione;
import eccezioni.associazioni.AssociazioneLezioneCorsoFallitaException;
import eccezioni.create.CreateLezioneFallitoException;
import eccezioni.delete.DeleteLezioneFallitoException;
import eccezioni.retrieve.RetrieveLezioneFallitoException;
import eccezioni.update.UpdateLezioneFallitoException;
import java.util.LinkedList;

public interface LezioneDAOInterfaccia {
    
    public void createLezione(Lezione lez) throws CreateLezioneFallitoException;
    
    public LinkedList<Lezione> retrieveAllLezione(LinkedList<Corso> listaCorsi) throws RetrieveLezioneFallitoException, AssociazioneLezioneCorsoFallitaException;
    
    public void updateLezione(Lezione lez) throws UpdateLezioneFallitoException;
    
    public void deleteLezione(Lezione lez) throws DeleteLezioneFallitoException;
    
}
