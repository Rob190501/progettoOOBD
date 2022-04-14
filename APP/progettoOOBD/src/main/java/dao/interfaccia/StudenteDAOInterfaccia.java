package dao.interfaccia;

import dto.Corso;
import dto.Lezione;
import dto.Studente;
import java.util.LinkedList;

public interface StudenteDAOInterfaccia {
    
    public void createStudente(Studente studente) throws Exception;
    
    public LinkedList<Studente> retrieveAllStudente(LinkedList<Corso> listaCorsi, LinkedList<Lezione> listaLezioni) throws Exception;
    
    public void updateStudente(Studente studente) throws Exception;
    
    public void deleteStudente(Studente studente) throws Exception;
    
}
