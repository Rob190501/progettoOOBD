package dao.implementazione.postgresql;

import controller.Controller;
import dao.interfaccia.SQL.StudenteDelCorsoDAOInterfaccia;
import dto.Corso;
import dto.Studente;
import eccezioni.create.CreateStudenteDelCorsoFallitoException;
import eccezioni.delete.DeleteStudenteDelCorsoFallitoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class StudenteDelCorsoDAOImplementazione implements StudenteDelCorsoDAOInterfaccia {

    private Controller controller;
    private Connection connection;

    public StudenteDelCorsoDAOImplementazione(Controller controller, Connection connection) {
        this.controller = controller;
        this.connection = connection;
    }
    
    private String insertStudenteDelCorso = "INSERT "
                                          + "INTO studenti_del_corso (matricola, codice_corso) "
                                          + "VALUES (?, ?)";
    
    private String deleteStudenteDelCorso = "DELETE "
                                          + "FROM studenti_del_corso "
                                          + "WHERE matricola = ? AND codice_corso = ?";
    
    @Override
    public void createStudenteDelCorso(Studente studente, Corso corso) throws SQLException, CreateStudenteDelCorsoFallitoException {
        try (PreparedStatement pstInsertStudenteDelCorso = connection.prepareStatement(insertStudenteDelCorso)) {
            pstInsertStudenteDelCorso.setInt(1, studente.getMatricola());
            pstInsertStudenteDelCorso.setInt(2, corso.getCodice());
            if (pstInsertStudenteDelCorso.executeUpdate() != 1) {
                throw new CreateStudenteDelCorsoFallitoException();
            }
        }
    }

    @Override
    public void deleteStudenteDelCorso(Studente studente, Corso corso) throws SQLException, DeleteStudenteDelCorsoFallitoException {
        try (PreparedStatement pstDeleteStudenteDelCorso = connection.prepareStatement(deleteStudenteDelCorso)) {
            pstDeleteStudenteDelCorso.setInt(1, studente.getMatricola());
            pstDeleteStudenteDelCorso.setInt(2, corso.getCodice());
            if (pstDeleteStudenteDelCorso.executeUpdate() != 1) {
                throw new DeleteStudenteDelCorsoFallitoException();
            }
        }
    }
    
}
