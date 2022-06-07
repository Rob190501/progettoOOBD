package dto;

import java.util.LinkedList;

public class Studente {
    private int matricola;
    private String nome;
    private String cognome;
    private LinkedList<Corso> listaCorsiFrequentati;
    private LinkedList<Lezione> listaPresenze;

    public Studente(int matricola, String nome, String cognome) {
        setMatricola(matricola);
        setNome(nome);
        setCognome(cognome);
        listaCorsiFrequentati = new LinkedList<>();
        listaPresenze = new LinkedList<>();
        
    }
    
    public Studente(String nome, String cognome) {
        setNome(nome);
        setCognome(cognome);
        listaCorsiFrequentati = new LinkedList<Corso>();
        listaPresenze = new LinkedList<Lezione>();
        
    }
    
    public int getMatricola() {
        return matricola;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public LinkedList<Corso> getListaCorsiFrequentati() {
        return listaCorsiFrequentati;
    }

    public LinkedList<Lezione> getListaPresenze() {
        return listaPresenze;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    
    public void addCorso(Corso corso) {
        listaCorsiFrequentati.add(corso);
    }
    
    public void removeCorso(Corso corso) {
        listaCorsiFrequentati.remove(corso);
    }
    
    public void addPresenza(Lezione lezione) {
        listaPresenze.add(lezione);
    }
    
    public void removePresenza(Lezione lezione) {
        listaPresenze.remove(lezione);
    }
    
    public void rimuoviDaAssociazioni() {
        for(Lezione lezione : listaPresenze) {
            lezione.getStudentiPresenti().remove(this);
        }
        
        for(Corso corso : listaCorsiFrequentati) {
            corso.getStudentiIscritti().remove(this);
        }
    }
    
    public Object[] creaRiga() {
        Object[] riga = {this, matricola, nome, cognome};
        return riga;
    }
    
    public String toString() {
        return matricola + " | " + nome + " | " + cognome + listaCorsiFrequentati.toString() + listaPresenze.toString();
    }
    
    public int getNumeroPresenzeDiUnCorso(Corso corso) {
        int contatorePresenze = 0;
        for(Lezione lezione :  listaPresenze) {
            if(lezione.getCorsoDellaLezione().equals(corso)) {
                contatorePresenze++;
            }
        }
        return contatorePresenze;
    }
    
    public boolean eIdoneo(Corso corso) {
        int tassoStudente = (getNumeroPresenzeDiUnCorso(corso) * 100) / corso.getNumeroLezioni();
        return tassoStudente >= corso.getTassoPresenzeMinime();
    }
    
}
