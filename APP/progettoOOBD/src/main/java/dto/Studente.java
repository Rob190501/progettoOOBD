package dto;

import java.util.LinkedList;

public class Studente {
    private String matricola;
    private String nome;
    private String cognome;
    private LinkedList<Corso> corsiFrequentati;
    private LinkedList<Lezione> presenze;

    public Studente(String matricola, String nome, String cognome) {
        setMatricola(matricola);
        setNome(nome);
        setCognome(cognome);
        presenze = new LinkedList<Lezione>();
    }
    
    public String getMatricola() {
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

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    
    public void addPresenza(Lezione lezione) {
        presenze.add(lezione);
    }
    
}
