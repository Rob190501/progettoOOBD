package dao.implementazione.postgresql;

import controller.Controller;
import dao.interfaccia.SQL.LezioneDAOInterfaccia;
import dto.Corso;
import dto.Lezione;
import eccezioni.associazioni.AssociazioneLezioneCorsoFallitaException;
import eccezioni.create.CreateLezioneFallitoException;
import eccezioni.delete.DeleteLezioneFallitoException;
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
                                 + "INTO lezione (titolo_lezione, descrizione_lezione, durata_lezione, data_inizio, codice_corso) "
                                 + "VALUES (?, ?, ?::INTERVAL, ?, ?)";
    
    private String querySelectAllLezione = "SELECT * "
                                         + "FROM lezione";
    
    private String updateLezione = "UPDATE lezione "
                                 + "SET titolo_lezione = ?, descrizione_lezione = ?, durata_lezione = ?::INTERVAL, data_inizio = ?"
                                 + "WHERE codice_lezione = ?";
    
    private String deleteLezione = "DELETE "
                                  + "FROM lezione "
                                  + "WHERE codice_lezione = ?";
    
    public LezioneDAOImplementazione(Controller controller, Connection connection) {
        setController(controller);
        setConnection(connection);
    }
    
    private void setController(Controller controller) {
        this.controller = controller;
    }

    private void setConnection(Connection connection) {
        this.connection = connection;
    }
    
    @Override
    public void createLezione(Lezione lezione) throws SQLException, CreateLezioneFallitoException {
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
    }

    @Override
    public LinkedList<Lezione> retrieveAllLezione(LinkedList<Corso> listaCorsi) throws SQLException, AssociazioneLezioneCorsoFallitaException {
        try (Statement stmtRetrieveAllLezione = connection.createStatement()) {
            try (ResultSet rsRetrieveAllLezione = stmtRetrieveAllLezione.executeQuery(querySelectAllLezione)) {
                LinkedList<Lezione> listaLezioni = new LinkedList<Lezione>();

                while (rsRetrieveAllLezione.next()) {
                    int codice_lezione = rsRetrieveAllLezione.getInt("codice_lezione");
                    String titolo_lezione = rsRetrieveAllLezione.getString("titolo_lezione");
                    String descrizione_lezione = rsRetrieveAllLezione.getString("descrizione_lezione");
                    String durata_lezione = rsRetrieveAllLezione.getString("durata_lezione").substring(0, 5);
                    ZonedDateTime data_inizio = ZonedDateTime.ofInstant(rsRetrieveAllLezione.getTimestamp("data_inizio").toInstant(), ZoneId.of("Europe/Rome"));
                    data_inizio = data_inizio.truncatedTo(ChronoUnit.MINUTES);
                    
                    int codice_corso = rsRetrieveAllLezione.getInt("codice_corso");
                    Corso corsoDellaLezione = trovaCorso(codice_corso, listaCorsi);
                    
                    Lezione lezione = new Lezione(codice_lezione, titolo_lezione, descrizione_lezione, durata_lezione, data_inizio, corsoDellaLezione);
                    corsoDellaLezione.addLezione(lezione);
                    listaLezioni.add(lezione);
                }
                
                return listaLezioni;
            }
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
    public void updateLezione(Lezione lezione) throws SQLException, UpdateLezioneFallitoException {
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
    }

    @Override
    public void deleteLezione(Lezione lezione) throws SQLException, DeleteLezioneFallitoException {
        try (PreparedStatement pstDeleteLezione = connection.prepareStatement(deleteLezione)) {
            pstDeleteLezione.setInt(1, lezione.getCodice());
            if (pstDeleteLezione.executeUpdate() != 1) {
                throw new DeleteLezioneFallitoException();
            }
        }
    }
    
}
