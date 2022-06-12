package dao.interfaccia;

import dto.AreaTematica;
import dto.Corso;
import eccezioni.create.CreateAreaDelCorsoFallitoException;
import eccezioni.delete.DeleteAreaDelCorsoFallitoException;
import eccezioni.retrieve.RetrieveAreaDelCorsoFallitoException;
import java.util.LinkedList;

public interface AreaDelCorsoDAOInterfaccia {
    
    public void createAreaDelCorso(Corso corso, AreaTematica areaTematica) throws CreateAreaDelCorsoFallitoException;
    
    public void retrieveAreeDelCorso(Corso corso, LinkedList<AreaTematica> listaAreeTematiche) throws RetrieveAreaDelCorsoFallitoException;
    
    public void deleteAreaDelCorso(Corso corso, AreaTematica areaTematica) throws DeleteAreaDelCorsoFallitoException;
    
}
