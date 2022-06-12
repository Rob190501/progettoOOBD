package dao.implementazione.postgresql;

import controller.Controller;
import dao.interfaccia.AreaDelCorsoDAOInterfaccia;
import dto.AreaTematica;
import dto.Corso;
import eccezioni.create.CreateAreaDelCorsoFallitoException;
import eccezioni.delete.DeleteAreaDelCorsoFallitoException;
import eccezioni.retrieve.RetrieveAreaDelCorsoFallitoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;



public class AreaDelCorsoDAOImplementazione implements AreaDelCorsoDAOInterfaccia {

    private Controller controller;
    private Connection connection;
    
    private String insertAreaDelCorso = "INSERT "
                                      + "INTO aree_dei_corsi (codice_area_tematica, codice_corso) "
                                      + "VALUES (?, ?)";
    
    private String selectAreeDelCorso = "SELECT codice_area_tematica "
                                      + "FROM aree_dei_corsi "
                                      + "WHERE codice_corso = ?";
    
    private String deleteAreaDelCorso = "DELETE "
                                      + "FROM aree_dei_corsi "
                                      + "WHERE codice_area_tematica = ? AND codice_corso = ?";

    public AreaDelCorsoDAOImplementazione(Controller controller, Connection connection) {
        this.controller = controller;
        this.connection = connection;
    }
    
    @Override
    public void createAreaDelCorso(Corso corso, AreaTematica areaTematica) throws CreateAreaDelCorsoFallitoException {
        try (PreparedStatement pstInsertAreaDelCorso = connection.prepareStatement(insertAreaDelCorso)) {
            pstInsertAreaDelCorso.setInt(1, areaTematica.getCodice());
            pstInsertAreaDelCorso.setInt(2, corso.getCodice());
            if (pstInsertAreaDelCorso.executeUpdate() != 1) {
                throw new CreateAreaDelCorsoFallitoException();
            }
            areaTematica.addCorso(corso);
            corso.addAreaTematica(areaTematica);
        }
        catch(SQLException e) {
            throw new CreateAreaDelCorsoFallitoException(e.getMessage());
        }
    }

    @Override
    public void retrieveAreeDelCorso(Corso corso, LinkedList<AreaTematica> listaAreeTematiche) throws RetrieveAreaDelCorsoFallitoException {
        try (PreparedStatement pstAreeDelCorso = connection.prepareStatement(selectAreeDelCorso)) {
            pstAreeDelCorso.setInt(1, corso.getCodice());
            try (ResultSet rsAreeDelCorso = pstAreeDelCorso.executeQuery()) {
                while (rsAreeDelCorso.next()) {
                    for (AreaTematica areaTematica : listaAreeTematiche) {
                        if(rsAreeDelCorso.getInt("codice_area_tematica") == areaTematica.getCodice()) {
                            corso.addAreaTematica(areaTematica);
                            areaTematica.addCorso(corso);
                        }
                    }
                }
            }
        }
        catch(SQLException e) {
            throw new RetrieveAreaDelCorsoFallitoException(e.getMessage());
        }
    }

    @Override
    public void deleteAreaDelCorso(Corso corso, AreaTematica areaTematica) throws DeleteAreaDelCorsoFallitoException {
        try (PreparedStatement pstDeleteAreaDelCorso = connection.prepareStatement(deleteAreaDelCorso)) {
            pstDeleteAreaDelCorso.setInt(1, areaTematica.getCodice());
            pstDeleteAreaDelCorso.setInt(2, corso.getCodice());
            if (pstDeleteAreaDelCorso.executeUpdate() != 1) {
                throw new DeleteAreaDelCorsoFallitoException();
            }
            areaTematica.removeCorso(corso);
            corso.removeAreaTematica(areaTematica);
        }
        catch(SQLException e) {
            throw new DeleteAreaDelCorsoFallitoException(e.getMessage());
        }
    }
    
}
