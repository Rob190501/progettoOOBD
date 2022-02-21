package dao.interfaccia;

import dto.Corso;
import dto.Lezione;
import dto.Studente;
import java.util.LinkedList;

public interface StudenteDAOInterfaccia {
    
    public boolean createStudente(Studente studente) throws Exception;
    
    public LinkedList<Studente> retrieveAllStudente(LinkedList<Corso> listaCorsi, LinkedList<Lezione> listaLezioni) throws Exception;
    
    public boolean updateStudente(Studente studente);
    
    public boolean deleteStudente(Studente studente);
    
}
