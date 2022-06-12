package dao.implementazione.postgresql;

import controller.Controller;
import dao.interfaccia.LezioneDAOInterfaccia;
import dto.Corso;
import dto.Lezione;
import eccezioni.associazioni.AssociazioneLezioneCorsoFallitaException;
import eccezioni.create.CreateLezioneFallitoException;
import eccezioni.delete.DeleteLezioneFallitoException;
import eccezioni.retrieve.RetrieveLezioneFallitoException;
import eccezioni.update.UpdateLezioneFallitoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.LinkedList;

public class LezioneDAOImplementazione implements LezioneDAOInterfaccia {

    private Controller controller;
    private Connection connection;
    
    private String insertLezione = "INSERT "
                                 + "INTO lezioni (titolo, descrizione, durata, data_inizio, codice_corso) "
                                 + "VALUES (?, ?, ?::INTERVAL, ?, ?)";
    
    private String querySelectAllLezione = "SELECT * "
                                         + "FROM lezioni";
    
    private String updateLezione = "UPDATE lezioni "
                                 + "SET titolo = ?, descrizione = ?, durata = ?::INTERVAL, data_inizio = ?"
                                 + "WHERE codice = ?";
    
    private String deleteLezione = "DELETE "
                                  + "FROM lezioni "
                                  + "WHERE codice = ?";
    
    public LezioneDAOImplementazione(Controller controller, Connection connection) {
        this.controller = controller;
        this.connection = connection;
    }
    
    @Override
    public void createLezione(Lezione lezione) throws CreateLezioneFallitoException {
        try (PreparedStatement pstInsertLezione = connection.prepareStatement(insertLezione, Statement.RETURN_GENERATED_KEYS)) {
            pstInsertLezione.setString(1, lezione.getTitolo());
            pstInsertLezione.setString(2, lezione.getDescrizione());
            pstInsertLezione.setString(3, lezione.getDurata());
            pstInsertLezione.setTimestamp(4, Timestamp.valueOf(lezione.getDataInizio().toLocalDateTime()));
            pstInsertLezione.setInt(5, lezione.getCorsoDellaLezione().getCodice());
            
            if (pstInsertLezione.executeUpdate() != 1) {
                throw new CreateLezioneFallitoException();
            }
            try (ResultSet rsInsertLezione = pstInsertLezione.getGeneratedKeys()) {
                if(rsInsertLezione.next()) {
                    lezione.setCodice(rsInsertLezione.getInt(1));
                }
                else {
                    throw new CreateLezioneFallitoException();
                }
            }
        }
        catch(SQLException e) {
            throw new CreateLezioneFallitoException(e.getMessage());
        }
    }

    @Override
    public LinkedList<Lezione> retrieveAllLezione(LinkedList<Corso> listaCorsi) throws RetrieveLezioneFallitoException, AssociazioneLezioneCorsoFallitaException {
        try (Statement stmtRetrieveAllLezione = connection.createStatement();
             ResultSet rsRetrieveAllLezione = stmtRetrieveAllLezione.executeQuery(querySelectAllLezione)) {
            LinkedList<Lezione> listaLezioni = new LinkedList<>();

            while (rsRetrieveAllLezione.next()) {
                int codice_lezione = rsRetrieveAllLezione.getInt("codice");
                String titolo = rsRetrieveAllLezione.getString("titolo");
                String descrizione = rsRetrieveAllLezione.getString("descrizione");
                String durata = rsRetrieveAllLezione.getString("durata").substring(0, 5);
                ZonedDateTime data_inizio = ZonedDateTime.ofInstant(rsRetrieveAllLezione.getTimestamp("data_inizio").toInstant(), ZoneId.of("Europe/Rome"));
                data_inizio = data_inizio.truncatedTo(ChronoUnit.MINUTES);
                    
                int codice_corso = rsRetrieveAllLezione.getInt("codice_corso");
                Corso corsoDellaLezione = trovaCorso(codice_corso, listaCorsi);
                    
                Lezione lezione = new Lezione(codice_lezione, titolo, descrizione, durata, data_inizio, corsoDellaLezione);
                corsoDellaLezione.addLezione(lezione);
                listaLezioni.add(lezione);
            }
                
            return listaLezioni;
        }
        catch(SQLException e) {
            throw new RetrieveLezioneFallitoException(e.getMessage());
        }
    }
    
    private Corso trovaCorso(int codice_corso, LinkedList<Corso> listaCorsi) throws AssociazioneLezioneCorsoFallitaException {
        for (Corso corso : listaCorsi) {
            if (corso.getCodice() == codice_corso) {
                return corso;
            }
        }
        throw new AssociazioneLezioneCorsoFallitaException();
    }

    @Override
    public void updateLezione(Lezione lezione) throws UpdateLezioneFallitoException {
        try (PreparedStatement pstUpdateLezione = connection.prepareStatement(updateLezione)) {
            pstUpdateLezione.setString(1, lezione.getTitolo());
            pstUpdateLezione.setString(2, lezione.getDescrizione());
            pstUpdateLezione.setString(3, lezione.getDurata());
            pstUpdateLezione.setTimestamp(4, Timestamp.valueOf(lezione.getDataInizio().toLocalDateTime()));
            pstUpdateLezione.setInt(5, lezione.getCodice());
            if (pstUpdateLezione.executeUpdate() != 1) {
                throw new UpdateLezioneFallitoException();
            }
        }
        catch(SQLException e) {
            throw new UpdateLezioneFallitoException(e.getMessage());
        }
    }

    @Override
    public void deleteLezione(Lezione lezione) throws DeleteLezioneFallitoException {
        try (PreparedStatement pstDeleteLezione = connection.prepareStatement(deleteLezione)) {
            pstDeleteLezione.setInt(1, lezione.getCodice());
            if (pstDeleteLezione.executeUpdate() != 1) {
                throw new DeleteLezioneFallitoException();
            }
            lezione.rimuoviDaAssociazioni();
        }
        catch(SQLException e) {
            throw new DeleteLezioneFallitoException(e.getMessage());
        }
    }
    
}
