package dao.interfaccia.SQL;

import dto.Lezione;
import dto.Studente;
import eccezioni.create.CreatePresenzaFallitoException;
import eccezioni.delete.DeletePresenzaFallitoException;
import java.sql.SQLException;
import java.util.LinkedList;

public interface PresenzeDAOInterfaccia {
    
    public void createPresenza(Studente studente, Lezione lezione) throws SQLException, CreatePresenzaFallitoException;
    
    public void retrievePresenze(Studente studente, LinkedList<Lezione> listaLezioni) throws SQLException;
    
    public void deletePresenza(Studente studente, Lezione lezione) throws SQLException, DeletePresenzaFallitoException;
    
}
