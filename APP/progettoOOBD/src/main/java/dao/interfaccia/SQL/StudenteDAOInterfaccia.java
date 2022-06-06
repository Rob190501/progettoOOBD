package dao.interfaccia.SQL;

import dto.Studente;
import eccezioni.create.CreateStudenteFallitoException;
import eccezioni.delete.DeleteStudenteFallitoException;
import eccezioni.update.UpdateStudenteFallitoException;
import java.sql.SQLException;
import java.util.LinkedList;

public interface StudenteDAOInterfaccia {
    
    public void createStudente(Studente studente) throws SQLException, CreateStudenteFallitoException;
    
    public LinkedList<Studente> retrieveAllStudente() throws SQLException;
    
    public void updateStudente(Studente studente) throws SQLException, UpdateStudenteFallitoException;
    
    public void deleteStudente(Studente studente) throws SQLException, DeleteStudenteFallitoException;
    
}
