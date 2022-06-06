package dao.implementazione.postgresql;

import controller.Controller;
import dao.interfaccia.SQL.CorsoDAOInterfaccia;
import dto.Corso;
import eccezioni.create.CreateCorsoFallitoException;
import eccezioni.delete.DeleteCorsoFallitoException;
import eccezioni.retrieve.RetrieveAreaDelCorsoFallitoException;
import eccezioni.retrieve.RetrieveCorsoFallitoException;
import eccezioni.update.UpdateCorsoFallitoException;
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
                               + "INTO corso (nome_corso, descrizione_corso, tasso_presenze_min, partecipanti_max) "
                               + "VALUES (?, ?, ?, ?)";
    
    private String selectAllCorso = "SELECT * "
                                  + "FROM corso";
    
    private String updateCorso = "UPDATE corso "
                               + "SET nome_corso = ?, descrizione_corso = ?, tasso_presenze_min = ?, partecipanti_max = ?"
                               + "WHERE codice_corso = ?";
    
    private String deleteCorso = "DELETE "
                               + "FROM corso "
                               + "WHERE codice_corso = ?";
    
    public CorsoDAOImplementazione(Controller controller, Connection connection) {
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
    public void createCorso(Corso corso) throws CreateCorsoFallitoException {
        try (PreparedStatement pstInsertCorso = connection.prepareStatement(insertCorso, Statement.RETURN_GENERATED_KEYS)) {
            pstInsertCorso.setString(1, corso.getNome());
            pstInsertCorso.setString(2, corso.getDescrizione());
            pstInsertCorso.setInt(3, corso.getTassoPresenzeMinime());
            pstInsertCorso.setInt(4, corso.getNumeroMassimoIscritti());
            if (pstInsertCorso.executeUpdate() != 1) {
                throw new CreateCorsoFallitoException();
            }
            try (ResultSet rsInsertAreaTematica = pstInsertCorso.getGeneratedKeys()) {
                if(rsInsertAreaTematica.next()) {
                    corso.setCodice(rsInsertAreaTematica.getInt(1));
                }
                else {
                    throw new CreateCorsoFallitoException();
                }
            }
        }
        catch(SQLException e) {
            throw new CreateCorsoFallitoException(e.getMessage());
        }
    }

    @Override
    public LinkedList<Corso> retrieveAllCorso() throws RetrieveCorsoFallitoException, RetrieveAreaDelCorsoFallitoException {
        try (Statement stmtRetrieveAllCorso = connection.createStatement();
             ResultSet rsRetrieveAllCorso = stmtRetrieveAllCorso.executeQuery(selectAllCorso)) {
            LinkedList listaCorsi = new LinkedList<Corso>();
            
            while (rsRetrieveAllCorso.next()) {
                int codice_corso = rsRetrieveAllCorso.getInt("codice_corso");
                String nome_corso = rsRetrieveAllCorso.getString("nome_corso");
                String descrizione_corso = rsRetrieveAllCorso.getString("descrizione_corso");
                int tasso_presenze_min = rsRetrieveAllCorso.getInt("tasso_presenze_min");
                int partecipanti_max = rsRetrieveAllCorso.getInt("partecipanti_max");

                Corso corso = new Corso(codice_corso, nome_corso, descrizione_corso, tasso_presenze_min, partecipanti_max);
                    
                controller.setAreeTematiche(corso);

                listaCorsi.add(corso);
            } 
            
            return listaCorsi;
        }
        catch(SQLException e) {
            throw new RetrieveCorsoFallitoException(e.getMessage());
        }
    }

    @Override
    public void updateCorso(Corso corso) throws UpdateCorsoFallitoException {
        try (PreparedStatement pstUpdateCorso = connection.prepareStatement(updateCorso)) {
            pstUpdateCorso.setString(1, corso.getNome());
            pstUpdateCorso.setString(2, corso.getDescrizione());
            pstUpdateCorso.setInt(3, corso.getTassoPresenzeMinime());
            pstUpdateCorso.setInt(4, corso.getNumeroMassimoIscritti());
            pstUpdateCorso.setInt(5, corso.getCodice());
            if (pstUpdateCorso.executeUpdate() != 1) {
                throw new UpdateCorsoFallitoException();
            }
        }
        catch(SQLException e) {
            throw new UpdateCorsoFallitoException(e.getMessage());
        }
    }

    @Override
    public void deleteCorso(Corso corso) throws DeleteCorsoFallitoException {
        try (PreparedStatement pstDeleteAreaCorso = connection.prepareStatement(deleteCorso)) {
            pstDeleteAreaCorso.setInt(1, corso.getCodice());
            if (pstDeleteAreaCorso.executeUpdate() != 1) {
                throw new DeleteCorsoFallitoException();
            }
        }
        catch(SQLException e) {
            throw new DeleteCorsoFallitoException(e.getMessage());
        }
    }
    
}
