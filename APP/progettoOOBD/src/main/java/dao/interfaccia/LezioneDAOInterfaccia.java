package dao.interfaccia;

import dto.Corso;
import dto.Lezione;
import java.util.LinkedList;

public interface LezioneDAOInterfaccia {
    
    public void createLezione(Lezione lez);
    
    public LinkedList<Lezione> retrieveAllLezione(LinkedList<Corso> listaCorsi) throws Exception;
    
    public void updateLezione(Lezione lez);
    
    public void deleteLezione(Lezione lez);
    
}
