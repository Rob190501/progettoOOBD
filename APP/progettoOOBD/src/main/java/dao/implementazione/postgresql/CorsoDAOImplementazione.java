package dao.implementazione.postgresql;

import controller.Controller;
import dao.interfaccia.CorsoDAOInterfaccia;
import dto.Corso;
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
import java.util.LinkedList;

public class CorsoDAOImplementazione implements CorsoDAOInterfaccia {

    private Controller controller;
    private Connection connection;
    
    private String insertCorso = "INSERT "
                               + "INTO corsi (nome, descrizione, tasso_presenze_min, partecipanti_max) "
                               + "VALUES (?, ?, ?, ?)";
    
    private String selectAllCorso = "SELECT * "
                                  + "FROM corsi";
    
    private String updateCorso = "UPDATE corsi "
                               + "SET nome = ?, descrizione = ?, tasso_presenze_min = ?, partecipanti_max = ? "
                               + "WHERE codice = ?";
    
    private String deleteCorso = "DELETE "
                               + "FROM corsi "
                               + "WHERE codice = ?";
    
    public CorsoDAOImplementazione(Controller controller, Connection connection) {
        this.controller = controller;
        this.connection = connection;
    }
    
    @Override
    public void createCorso(Corso corso) throws CreateFallitoException {
        try (PreparedStatement pstmt = connection.prepareStatement(insertCorso, Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setString(1, corso.getNome());
            pstmt.setString(2, corso.getDescrizione());
            pstmt.setInt(3, corso.getTassoPresenzeMinime());
            pstmt.setInt(4, corso.getNumeroMassimoIscritti());
            pstmt.executeUpdate();
            try (ResultSet rs = pstmt.getGeneratedKeys()) {
                rs.next();
                corso.setCodice(rs.getInt(1));
            }
        }
        catch(SQLException e) {
            throw new CreateFallitoException("Corso", e.getMessage());
        }
    }

    @Override
    public LinkedList<Corso> retrieveAllCorso() throws RetrieveFallitoException, AssociazioneFallitaException {
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(selectAllCorso)) {
            LinkedList listaCorsi = new LinkedList<Corso>();
            
            while (rs.next()) {
                int codice = rs.getInt("codice");
                String nome = rs.getString("nome");
                String descrizione = rs.getString("descrizione");
                int tasso_presenze_min = rs.getInt("tasso_presenze_min");
                int partecipanti_max = rs.getInt("partecipanti_max");

                Corso corso = new Corso(codice, nome, descrizione, tasso_presenze_min, partecipanti_max);
                    
                controller.setAreeTematicheDelCorso(corso);

                listaCorsi.add(corso);
            } 
            
            return listaCorsi;
        }
        catch(SQLException e) {
            throw new RetrieveFallitoException("il Corso", e.getMessage());
        }
    }

    @Override
    public void updateCorso(Corso corso) throws UpdateFallitoException {
        try (PreparedStatement pstmt = connection.prepareStatement(updateCorso)) {
            pstmt.setString(1, corso.getNome());
            pstmt.setString(2, corso.getDescrizione());
            pstmt.setInt(3, corso.getTassoPresenzeMinime());
            pstmt.setInt(4, corso.getNumeroMassimoIscritti());
            pstmt.setInt(5, corso.getCodice());
            pstmt.executeUpdate();
        }
        catch(SQLException e) {
            throw new UpdateFallitoException("il Corso", e.getMessage());
        }
    }

    @Override
    public void deleteCorso(Corso corso) throws DeleteFallitoException {
        try (PreparedStatement pstDeleteAreaCorso = connection.prepareStatement(deleteCorso)) {
            pstDeleteAreaCorso.setInt(1, corso.getCodice());
            pstDeleteAreaCorso.executeUpdate();
            corso.rimuoviDaAssociazioni();
        }
        catch(SQLException e) {
            throw new DeleteFallitoException("il Corso", e.getMessage());
        }
    }
    
}
