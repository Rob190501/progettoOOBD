package dao.implementazione.postgresql;

import controller.Controller;
import dao.interfaccia.LezioneDAOInterfaccia;
import dto.Corso;
import dto.Lezione;
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
import java.sql.Timestamp;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.AbstractList;
import java.util.LinkedList;

public class LezioneDAOPostgreSQL implements LezioneDAOInterfaccia {

    private Controller controller;
    private Connection connection;
    
    private String insertLezione = "INSERT "
                                 + "INTO lezioni (titolo, descrizione, durata, data_inizio, codice_corso) "
                                 + "VALUES (?, ?, ?::INTERVAL, ?, ?)";
    
    private String querySelectAllLezione = "SELECT * "
                                         + "FROM lezioni";
    
    private String selectCorsoDellaLezione = "SELECT codice_corso "
                                           + "FROM lezioni "
                                           + "WHERE codice = ?";
    
    private String updateLezione = "UPDATE lezioni "
                                 + "SET titolo = ?, descrizione = ?, durata = ?::INTERVAL, data_inizio = ?"
                                 + "WHERE codice = ?";
    
    private String deleteLezione = "DELETE "
                                  + "FROM lezioni "
                                  + "WHERE codice = ?";
    
    public LezioneDAOPostgreSQL(Controller controller, Connection connection) {
        this.controller = controller;
        this.connection = connection;
    }
    
    @Override
    public void createLezione(Lezione lezione) throws CreateFallitoException {
        try (PreparedStatement pstmt = connection.prepareStatement(insertLezione, Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setString(1, lezione.getTitolo());
            pstmt.setString(2, lezione.getDescrizione());
            pstmt.setString(3, lezione.getDurata());
            pstmt.setTimestamp(4, Timestamp.valueOf(lezione.getDataInizio().toLocalDateTime()));
            pstmt.setInt(5, lezione.getCorso().getCodice());
            pstmt.executeUpdate();
            try (ResultSet rs = pstmt.getGeneratedKeys()) {
                rs.next();
                lezione.setCodice(rs.getInt(1));
            }
        }
        catch(SQLException e) {
            throw new CreateFallitoException("la Lezione", e.getMessage());
        }
    }

    @Override
    public AbstractList<Lezione> retrieveAllLezione() throws RetrieveFallitoException, AssociazioneFallitaException {
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(querySelectAllLezione)) {
            AbstractList<Lezione> listaLezioni = new LinkedList<>();

            while (rs.next()) {
                int codice_lezione = rs.getInt("codice");
                String titolo = rs.getString("titolo");
                String descrizione = rs.getString("descrizione");
                String durata = rs.getString("durata").substring(0, 5);
                ZonedDateTime data_inizio = ZonedDateTime.ofInstant(rs.getTimestamp("data_inizio").toInstant(), ZoneId.of(controller.getFusoOrario())).truncatedTo(ChronoUnit.MINUTES);
                    
                Lezione lezione = new Lezione(codice_lezione, titolo, descrizione, durata, data_inizio);
                
                listaLezioni.add(lezione);
            }
                
            return listaLezioni;
        }
        catch(SQLException e) {
            throw new RetrieveFallitoException("la Lezione", e.getMessage());
        }
    }
    
    public void retrieveCorsoDellaLezione(Lezione lezione, AbstractList<Corso> listaCorsi) throws RetrieveFallitoException, AssociazioneFallitaException {
        try (PreparedStatement pstmt = connection.prepareStatement(selectCorsoDellaLezione)) {
            pstmt.setInt(1, lezione.getCodice());
            try (ResultSet rs = pstmt.executeQuery()) {
                while(rs.next()) {
                    Corso corsoDellaLezione = trovaCorsoDellaLezione(rs.getInt("codice_corso"), listaCorsi);
                    lezione.setCorso(corsoDellaLezione);
                    corsoDellaLezione.addLezione(lezione);
                }
            }
        }
        catch (SQLException e) {
            throw new RetrieveFallitoException("il corso della lezione", e.getMessage());
        }
    }
    
    private Corso trovaCorsoDellaLezione(int codice_corso, AbstractList<Corso> listaCorsi) throws AssociazioneFallitaException {
        for (Corso corso : listaCorsi) {
            if (corso.getCodice() == codice_corso) {
                return corso;
            }
        }
        throw new AssociazioneFallitaException("Lezioni e Corsi");
    }

    @Override
    public void updateLezione(Lezione lezione) throws UpdateFallitoException {
        try (PreparedStatement pstmt = connection.prepareStatement(updateLezione)) {
            pstmt.setString(1, lezione.getTitolo());
            pstmt.setString(2, lezione.getDescrizione());
            pstmt.setString(3, lezione.getDurata());
            pstmt.setTimestamp(4, Timestamp.valueOf(lezione.getDataInizio().toLocalDateTime()));
            pstmt.setInt(5, lezione.getCodice());
            pstmt.executeUpdate();
        }
        catch(SQLException e) {
            throw new UpdateFallitoException("la Lezione", e.getMessage());
        }
    }

    @Override
    public void deleteLezione(Lezione lezione) throws DeleteFallitoException {
        try (PreparedStatement pstmt = connection.prepareStatement(deleteLezione)) {
            pstmt.setInt(1, lezione.getCodice());
            pstmt.executeUpdate();
            lezione.rimuoviDaAssociazioni();
        }
        catch(SQLException e) {
            throw new DeleteFallitoException("la Lezione", e.getMessage());
        }
    }
    
}
