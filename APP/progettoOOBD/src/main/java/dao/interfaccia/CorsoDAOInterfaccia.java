package dao.interfaccia;

import dto.Corso;
import eccezioni.create.CreateCorsoFallitoException;
import eccezioni.delete.DeleteCorsoFallitoException;
import eccezioni.retrieve.RetrieveAreaDelCorsoFallitoException;
import eccezioni.retrieve.RetrieveCorsoFallitoException;
import eccezioni.update.UpdateCorsoFallitoException;
import java.util.LinkedList;

public interface CorsoDAOInterfaccia {
    
    public void createCorso(Corso corso) throws CreateCorsoFallitoException;
    
    public LinkedList<Corso> retrieveAllCorso() throws RetrieveCorsoFallitoException, RetrieveAreaDelCorsoFallitoException;
    
    public void updateCorso(Corso corso) throws UpdateCorsoFallitoException;
    
    public void deleteCorso(Corso corso) throws DeleteCorsoFallitoException;
    
}