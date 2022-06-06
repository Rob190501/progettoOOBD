package dao.interfaccia.SQL;

import dto.Studente;
import eccezioni.create.CreateStudenteFallitoException;
import eccezioni.delete.DeleteStudenteFallitoException;
import eccezioni.retrieve.RetrievePresenzaFallitoException;
import eccezioni.retrieve.RetrieveStudenteDelCorsoFallitoException;
import eccezioni.retrieve.RetrieveStudenteFallitoException;
import eccezioni.update.UpdateStudenteFallitoException;
import java.util.LinkedList;

public interface StudenteDAOInterfaccia {
    
    public void createStudente(Studente studente) throws CreateStudenteFallitoException;
    
    public LinkedList<Studente> retrieveAllStudente() throws RetrieveStudenteFallitoException, RetrieveStudenteDelCorsoFallitoException, RetrievePresenzaFallitoException;
    
    public void updateStudente(Studente studente) throws UpdateStudenteFallitoException;
    
    public void deleteStudente(Studente studente) throws DeleteStudenteFallitoException;
    
}
