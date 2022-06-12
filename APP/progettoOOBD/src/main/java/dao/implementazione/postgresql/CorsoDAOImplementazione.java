package dao.implementazione.postgresql;

import controller.Controller;
import dao.interfaccia.CorsoDAOInterfaccia;
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
                int codice = rsRetrieveAllCorso.getInt("codice");
                String nome = rsRetrieveAllCorso.getString("nome");
                String descrizione = rsRetrieveAllCorso.getString("descrizione");
                int tasso_presenze_min = rsRetrieveAllCorso.getInt("tasso_presenze_min");
                int partecipanti_max = rsRetrieveAllCorso.getInt("partecipanti_max");

                Corso corso = new Corso(codice, nome, descrizione, tasso_presenze_min, partecipanti_max);
                    
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
            corso.rimuoviDaAssociazioni();
        }
        catch(SQLException e) {
            throw new DeleteCorsoFallitoException(e.getMessage());
        }
    }
    
}
