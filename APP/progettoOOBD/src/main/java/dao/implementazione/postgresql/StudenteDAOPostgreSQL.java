package dao.implementazione.postgresql;

import controller.Controller;
import dao.interfaccia.StudenteDAOInterfaccia;
import dto.Studente;
import eccezioni.associazioni.AssociazioneFallitaException;
import eccezioni.create.CreateFallitoException;
import eccezioni.delete.DeleteFallitoException;
import eccezioni.retrieve.RetrieveFallitoException;
import eccezioni.update.UpdateFallitoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.AbstractList;
import java.util.LinkedList;

public class StudenteDAOPostgreSQL implements StudenteDAOInterfaccia {

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
    
    public StudenteDAOPostgreSQL(Controller controller, Connection connection) {
        this.controller = controller;
        this.connection = connection;
    }
    
    @Override
    public void createStudente(Studente studente) throws CreateFallitoException {
        try (PreparedStatement pstmt = connection.prepareStatement(insertStudente, Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setString(1, studente.getNome());
            pstmt.setString(2, studente.getCognome());
            pstmt.executeUpdate();
            try (ResultSet rs = pstmt.getGeneratedKeys()) {
                rs.next();
                studente.setMatricola(rs.getInt(1));
            }
        }
        catch(SQLException e) {
            throw new CreateFallitoException("lo Studente", e.getMessage());
        }
    }

    @Override
    public AbstractList<Studente> retrieveAllStudente() throws RetrieveFallitoException, AssociazioneFallitaException {
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(selectAllStudente)) {
            AbstractList<Studente> listaStudenti = new LinkedList<>();
            
            while(rs.next()) {
                int matricola = rs.getInt("matricola");
                String nome = rs.getString("nome");
                String cognome = rs.getString("cognome");

                Studente studente = new Studente(matricola, nome, cognome);
                
                listaStudenti.add(studente);
            }
            
            return listaStudenti;
        }
        catch(SQLException e) {
            throw new RetrieveFallitoException("lo Studente", e.getMessage());
        }
    }

    @Override
    public void updateStudente(Studente studente) throws UpdateFallitoException {
        try (PreparedStatement pstmt = connection.prepareStatement(updateStudente)) {
            pstmt.setString(1, studente.getNome());
            pstmt.setString(2, studente.getCognome());
            pstmt.setInt(3, studente.getMatricola());
            pstmt.executeUpdate();
        }
        catch(SQLException e) {
            throw new UpdateFallitoException("lo Studente", e.getMessage());
        }
    }

    @Override
    public void deleteStudente(Studente studente) throws DeleteFallitoException {
        try (PreparedStatement pstmt = connection.prepareStatement(deleteStudente)) {
            pstmt.setInt(1, studente.getMatricola());
            pstmt.executeUpdate();
            studente.rimuoviDaAssociazioni();
        }
        catch(SQLException e) {
            throw new DeleteFallitoException("lo Studente", e.getMessage());
        }
    }
    
}
