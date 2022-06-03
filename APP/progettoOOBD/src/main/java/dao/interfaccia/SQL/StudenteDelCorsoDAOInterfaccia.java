package dao.interfaccia.SQL;

import dto.Corso;
import dto.Studente;
import eccezioni.create.CreateStudenteDelCorsoFallitoException;
import eccezioni.delete.DeleteStudenteDelCorsoFallitoException;
import java.sql.SQLException;

public interface StudenteDelCorsoDAOInterfaccia {
    
    public void createStudenteDelCorso(Studente studente, Corso corso) throws SQLException, CreateStudenteDelCorsoFallitoException;
    
    public void deleteStudenteDelCorso(Studente studente, Corso corso) throws SQLException, DeleteStudenteDelCorsoFallitoException;
    
}
