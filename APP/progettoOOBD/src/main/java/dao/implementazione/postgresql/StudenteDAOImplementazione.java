package dao.implementazione.postgresql;

import controller.Controller;
import dao.interfaccia.StudenteDAOInterfaccia;
import dto.Studente;
import eccezioni.create.CreateStudenteFallitoException;
import eccezioni.delete.DeleteStudenteFallitoException;
import eccezioni.retrieve.RetrievePresenzaFallitoException;
import eccezioni.retrieve.RetrieveStudenteDelCorsoFallitoException;
import eccezioni.retrieve.RetrieveStudenteFallitoException;
import eccezioni.update.UpdateStudenteFallitoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

public class StudenteDAOImplementazione implements StudenteDAOInterfaccia {

    private Controller controller;
    private Connection connection;
    
    private String insertStudente = "INSERT "
                                  + "INTO studenti (nome, cognome) "
                                  + "VALUES (?, ?)";
    
    private String selectAllStudente = "SELECT * "
                                     + "FROM studenti";
    
    private String updateStudente = "UPDATE studenti "
                                  + "SET nome = ?, cognome = ?"
                                  + "WHERE matricola = ?";
    
    private String deleteStudente = "DELETE "
                                  + "FROM studenti "
                                  + "WHERE matricola = ?";
    
    public StudenteDAOImplementazione(Controller controller, Connection connection) {
        this.controller = controller;
        this.connection = connection;
    }
    
    @Override
    public void createStudente(Studente studente) throws CreateStudenteFallitoException {
        try (PreparedStatement pstInsertStudente = connection.prepareStatement(insertStudente, Statement.RETURN_GENERATED_KEYS)) {
            pstInsertStudente.setString(1, studente.getNome());
            pstInsertStudente.setString(2, studente.getCognome());
            if (pstInsertStudente.executeUpdate() != 1) {
                throw new CreateStudenteFallitoException();
            }
            try (ResultSet rsInsertStudente = pstInsertStudente.getGeneratedKeys()) {
                if(rsInsertStudente.next()) {
                    studente.setMatricola(rsInsertStudente.getInt(1));
                }
                else {
                    throw new CreateStudenteFallitoException();
                }
            }
        }
        catch(SQLException e) {
            throw new CreateStudenteFallitoException(e.getMessage());
        }
    }

    @Override
    public LinkedList<Studente> retrieveAllStudente() throws RetrieveStudenteFallitoException, RetrieveStudenteDelCorsoFallitoException, RetrievePresenzaFallitoException {
        try (Statement stmtRetrieveAllStudente = connection.createStatement();
             ResultSet rsRetrieveAllStudente = stmtRetrieveAllStudente.executeQuery(selectAllStudente)) {
            LinkedList<Studente> listaStudenti = new LinkedList<>();
            
            while(rsRetrieveAllStudente.next()) {
                int matricola = rsRetrieveAllStudente.getInt("matricola");
                String nome = rsRetrieveAllStudente.getString("nome");
                String cognome = rsRetrieveAllStudente.getString("cognome");

                Studente studente = new Studente(matricola, nome, cognome);
                    
                controller.setCorsiFrequentati(studente);
                controller.setPresenze(studente);
                    
                listaStudenti.add(studente);
            }
            
            return listaStudenti;
        }
        catch(SQLException e) {
            throw new RetrieveStudenteFallitoException(e.getMessage());
        }
    }

    @Override
    public void updateStudente(Studente studente) throws UpdateStudenteFallitoException {
        try (PreparedStatement pstUpdateStudente = connection.prepareStatement(updateStudente)) {
            pstUpdateStudente.setString(1, studente.getNome());
            pstUpdateStudente.setString(2, studente.getCognome());
            pstUpdateStudente.setInt(3, studente.getMatricola());
            if (pstUpdateStudente.executeUpdate() != 1) {
                throw new UpdateStudenteFallitoException();
            }
        }
        catch(SQLException e) {
            throw new UpdateStudenteFallitoException(e.getMessage());
        }
    }

    @Override
    public void deleteStudente(Studente studente) throws DeleteStudenteFallitoException {
        try (PreparedStatement pstDeleteStudente = connection.prepareStatement(deleteStudente)) {
            pstDeleteStudente.setInt(1, studente.getMatricola());
            if (pstDeleteStudente.executeUpdate() != 1) {
                throw new DeleteStudenteFallitoException();
            }
            studente.rimuoviDaAssociazioni();
        }
        catch(SQLException e) {
            throw new DeleteStudenteFallitoException(e.getMessage());
        }
    }
    
}
