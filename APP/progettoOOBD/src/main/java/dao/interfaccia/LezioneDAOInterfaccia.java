package dao.interfaccia;

import dto.Corso;
import dto.Lezione;
import eccezioni.associazioni.AssociazioneLezioneCorsoFallitaException;
import eccezioni.create.CreateLezioneFallitoException;
import eccezioni.delete.DeleteLezioneFallitoException;
import java.sql.SQLException;
import java.util.LinkedList;

public interface LezioneDAOInterfaccia {
    
    public void createLezione(Lezione lez) throws SQLException, CreateLezioneFallitoException;
    
    public LinkedList<Lezione> retrieveAllLezione(LinkedList<Corso> listaCorsi) throws SQLException, AssociazioneLezioneCorsoFallitaException;
    
    public void updateLezione(Lezione lez);
    
    public void deleteLezione(Lezione lez) throws SQLException, DeleteLezioneFallitoException;
    
}
