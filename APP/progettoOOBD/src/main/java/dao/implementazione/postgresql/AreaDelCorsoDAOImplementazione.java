package dao.implementazione.postgresql;

import controller.Controller;
import dao.interfaccia.AreaDelCorsoDAOInterfaccia;
import dto.AreaTematica;
import dto.Corso;
import eccezioni.associazioni.AssociazioneFallitaException;
import eccezioni.create.CreateFallitoException;
import eccezioni.delete.DeleteFallitoException;
import eccezioni.retrieve.RetrieveFallitoException;
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
    public void createAreaDelCorso(Corso corso, AreaTematica areaTematica) throws CreateFallitoException {
        try (PreparedStatement pstmt = connection.prepareStatement(insertAreaDelCorso)) {
            pstmt.setInt(1, areaTematica.getCodice());
            pstmt.setInt(2, corso.getCodice());
            pstmt.executeUpdate();
            areaTematica.addCorso(corso);
            corso.addAreaTematica(areaTematica);
        }
        catch(SQLException e) {
            throw new CreateFallitoException("Area Tematica del Corso", e.getMessage());
        }
    }

    @Override
    public void retrieveAllAreaDelCorso(Corso corso, LinkedList<AreaTematica> listaAreeTematiche) throws RetrieveFallitoException, AssociazioneFallitaException {
        try (PreparedStatement pstmt = connection.prepareStatement(selectAreeDelCorso)) {
            pstmt.setInt(1, corso.getCodice());
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    AreaTematica areaTematica = trovaAreaDelCorso(rs.getInt("codice_area_tematica"), listaAreeTematiche);
                    corso.addAreaTematica(areaTematica);
                    areaTematica.addCorso(corso);
                }
            }
        }
        catch(SQLException e) {
            throw new RetrieveFallitoException("l'Area del Corso", e.getMessage());
        }
    }
    
    public AreaTematica trovaAreaDelCorso(int codice_area_tematica, LinkedList<AreaTematica> listaAreeTematiche) throws AssociazioneFallitaException {
        for (AreaTematica areaTematica : listaAreeTematiche) {
            if(codice_area_tematica == areaTematica.getCodice()) {
                return areaTematica;
            }
        }
        throw new AssociazioneFallitaException("Aree tematiche e Corsi");
    }

    @Override
    public void deleteAreaDelCorso(Corso corso, AreaTematica areaTematica) throws DeleteFallitoException {
        try (PreparedStatement pstmt = connection.prepareStatement(deleteAreaDelCorso)) {
            pstmt.setInt(1, areaTematica.getCodice());
            pstmt.setInt(2, corso.getCodice());
            pstmt.executeUpdate();
            areaTematica.removeCorso(corso);
            corso.removeAreaTematica(areaTematica);
        }
        catch(SQLException e) {
            throw new DeleteFallitoException("l'Area del Corso", e.getMessage());
        }
    }
    
}
