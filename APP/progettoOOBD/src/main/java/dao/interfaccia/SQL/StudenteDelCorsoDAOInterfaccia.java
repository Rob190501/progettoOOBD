package dao.interfaccia.SQL;

import dto.Corso;
import dto.Studente;
import eccezioni.create.CreateStudenteDelCorsoFallitoException;
import eccezioni.delete.DeletePresenzaFallitoException;
import eccezioni.delete.DeleteStudenteDelCorsoFallitoException;
import java.sql.SQLException;
import java.util.LinkedList;

public interface StudenteDelCorsoDAOInterfaccia {
    
    public void createStudenteDelCorso(Studente studente, Corso corso) throws SQLException, CreateStudenteDelCorsoFallitoException;
    
    public void retrieveCorsiFrequentati(Studente studente, LinkedList<Corso> listaCorsi) throws SQLException;
    
    public void deleteStudenteDelCorso(Studente studente, Corso corso) throws SQLException, DeleteStudenteDelCorsoFallitoException, DeletePresenzaFallitoException;
    
}
