package dto;

import java.util.AbstractList;
import java.util.LinkedList;



public class Studente {
    private int matricola;
    private String nome;
    private String cognome;
    private AbstractList<Corso> listaCorsi;
    private AbstractList<Lezione> listaLezioni;

    public Studente(int matricola, String nome, String cognome) {
        this.matricola = matricola;
        this.nome = nome;
        this.cognome = cognome;
        this.listaCorsi = new LinkedList<>();
        this.listaLezioni = new LinkedList<>();
        
    }
    
    public Studente(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        this.listaCorsi = new LinkedList<Corso>();
        this.listaLezioni = new LinkedList<Lezione>();
        
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

    public AbstractList<Corso> getListaCorsi() {
        return listaCorsi;
    }

    public AbstractList<Lezione> getListaLezioni() {
        return listaLezioni;
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
        listaCorsi.add(corso);
    }
    
    public void removeCorso(Corso corso) {
        listaCorsi.remove(corso);
    }
    
    public void addPresenza(Lezione lezione) {
        listaLezioni.add(lezione);
    }
    
    public void removePresenza(Lezione lezione) {
        listaLezioni.remove(lezione);
    }
    
    public void rimuoviDaAssociazioni() {
        for(Lezione lezione : listaLezioni) {
            lezione.getListaStudenti().remove(this);
        }
        
        for(Corso corso : listaCorsi) {
            corso.getListaStudenti().remove(this);
        }
    }
    
    public Object[] creaRiga() {
        Object[] riga = {this, matricola, nome, cognome};
        return riga;
    }
    
    public LinkedList<Lezione> getPresenzeDiUnCorso(Corso corso) {
        LinkedList<Lezione> presenzeDiUnCorso = new LinkedList<>();
        for(Lezione lezione : listaLezioni) {
            if(lezione.getCorso().equals(corso)) {
                presenzeDiUnCorso.add(lezione);
            }
        }
        return presenzeDiUnCorso;
    }
    
    public int getNumeroPresenzeDiUnCorso(Corso corso) {
        int contatorePresenze = 0;
        for(Lezione lezione :  listaLezioni) {
            if(lezione.getCorso().equals(corso)) {
                contatorePresenze++;
            }
        }
        return contatorePresenze;
    }
    
    public boolean eIdoneo(Corso corso) {
        return ( ((getNumeroPresenzeDiUnCorso(corso) * 100) / corso.getNumeroLezioni()) >= corso.getTassoPresenzeMinime() );
    }
    
}
