package dao.interfaccia;

import dto.Corso;
import dto.Lezione;
import java.util.LinkedList;

public interface LezioneDAOInterfaccia {
    
    public boolean createLezione(Lezione lez);
    
    public LinkedList<Lezione> retrieveAllLezione(LinkedList<Corso> listaCorsi) throws Exception;
    
    public boolean updateLezione(Lezione lez);
    
    public boolean deleteLezione(Lezione lez);
    
}
