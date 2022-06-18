package dao.interfaccia;

import dto.Lezione;
import eccezioni.associazioni.AssociazioneFallitaException;
import eccezioni.create.CreateFallitoException;
import eccezioni.delete.DeleteFallitoException;
import eccezioni.retrieve.RetrieveFallitoException;
import eccezioni.update.UpdateFallitoException;
import java.util.LinkedList;

public interface LezioneDAOInterfaccia {
    
    public void createLezione(Lezione lez) throws CreateFallitoException;
    
    public LinkedList<Lezione> retrieveAllLezione() throws RetrieveFallitoException, AssociazioneFallitaException;
    
    public void updateLezione(Lezione lez) throws UpdateFallitoException;
    
    public void deleteLezione(Lezione lez) throws DeleteFallitoException;
    
}
