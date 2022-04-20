package dto;

import java.util.LinkedList;

public class Studente {
    private int matricola;
    private String nome;
    private String cognome;
    private LinkedList<Corso> corsiFrequentati;
    private LinkedList<Lezione> presenze;

    public Studente(int matricola, String nome, String cognome) {
        setMatricola(matricola);
        setNome(nome);
        setCognome(cognome);
        corsiFrequentati = new LinkedList<>();
        presenze = new LinkedList<>();
        
    }
    
    public Studente(String nome, String cognome) {
        setNome(nome);
        setCognome(cognome);
        corsiFrequentati = new LinkedList<Corso>();
        presenze = new LinkedList<Lezione>();
        
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

    public LinkedList<Corso> getCorsiFrequentati() {
        return corsiFrequentati;
    }

    public LinkedList<Lezione> getPresenze() {
        return presenze;
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
        corsiFrequentati.add(corso);
    }
    
    public void removeCorso(Corso corso) {
        corsiFrequentati.remove(corso);
    }
    
    public void addPresenza(Lezione lezione) {
        presenze.add(lezione);
    }
    
    public void removePresenza(Lezione lezione) {
        presenze.remove(lezione);
    }
    
    public void rimuoviDaAssociazioni() {
        for(Lezione lezione : presenze) {
            lezione.getStudentiPresenti().remove(this);
        }
        
        for(Corso corso : corsiFrequentati) {
            corso.getStudentiIscritti().remove(this);
        }
    }
    
    public Object[] creaRiga() {
        Object[] riga = {this, matricola, nome, cognome};
        return riga;
    }
    
    public String toString() {
        return matricola + " | " + nome + " | " + cognome + corsiFrequentati.toString() + presenze.toString();
    }
    
}
