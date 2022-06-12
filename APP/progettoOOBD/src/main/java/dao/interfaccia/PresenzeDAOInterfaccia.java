package dao.interfaccia;

import dto.Lezione;
import dto.Studente;
import eccezioni.create.CreatePresenzaFallitoException;
import eccezioni.delete.DeletePresenzaFallitoException;
import eccezioni.retrieve.RetrievePresenzaFallitoException;
import java.util.LinkedList;

public interface PresenzeDAOInterfaccia {
    
    public void createPresenza(Studente studente, Lezione lezione) throws CreatePresenzaFallitoException;
    
    public void retrievePresenze(Studente studente, LinkedList<Lezione> listaLezioni) throws RetrievePresenzaFallitoException;
    
    public void deletePresenza(Studente studente, Lezione lezione) throws DeletePresenzaFallitoException;
    
}
