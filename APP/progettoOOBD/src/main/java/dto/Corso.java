package dto;

import java.util.LinkedList;

public class Corso {
    
    private int codice;
    private String nome;
    private String descrizione;
    private int tassoPresenzeMinime;
    private int numeroMassimoIscritti;
    private LinkedList<Studente> studentiIscritti;
    private LinkedList<Lezione> lezioniDelCorso;
    private LinkedList<AreaTematica> areeTematicheDelCorso;

    public Corso(int codice, String nome, String descrizione, int tassoPresenzeMin, int numeroMassimoIscritti) {
        setCodice(codice);
        setNome(nome);
        setDescrizione(descrizione);
        setTassoPresenzeMinime(tassoPresenzeMin);
        setNumeroMassimoIscritti(numeroMassimoIscritti);
        studentiIscritti = new LinkedList<>();
        lezioniDelCorso = new LinkedList<>();
        areeTematicheDelCorso = new LinkedList<>();
    }
    
    public Corso(String nome, String descrizione, int tassoPresenzeMin, int numeroMassimoIscritti) {
        setNome(nome);
        setDescrizione(descrizione);
        setTassoPresenzeMinime(tassoPresenzeMin);
        setNumeroMassimoIscritti(numeroMassimoIscritti);
        studentiIscritti = new LinkedList<>();
        lezioniDelCorso = new LinkedList<>();
        areeTematicheDelCorso = new LinkedList<>();
    }
    
    public int getCodice() {
        return codice;
    }
    
    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public int getTassoPresenzeMinime() {
        return tassoPresenzeMinime;
    }

    public int getNumeroMassimoIscritti() {
        return numeroMassimoIscritti;
    }
    
    public LinkedList<Studente> getStudentiIscritti() {
        return studentiIscritti;
    }
    
    public LinkedList<Lezione> getLezioniDelCorso() {
        return lezioniDelCorso;
    }
    
    public LinkedList<AreaTematica> getAreeTematicheDelCorso() {
        return areeTematicheDelCorso;
    }
    
    public void setCodice(int codice) {
        this.codice = codice;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setTassoPresenzeMinime(int tassoPresenzeMinime) {
        this.tassoPresenzeMinime = tassoPresenzeMinime;
    }

    public void setNumeroMassimoIscritti(int numeroMassimoIscritti) {
        this.numeroMassimoIscritti = numeroMassimoIscritti;
    }
    
    public void addStudente(Studente studente) {
        studentiIscritti.add(studente);
    }
    
    public void removeStudente(Studente studente) {
        studentiIscritti.remove(studente);
    }
    
    public void addLezione(Lezione lezione) {
        lezioniDelCorso.add(lezione);
    }
    
    public void removeLezione(Lezione lezione) {
        lezioniDelCorso.remove(lezione);
    }
    
    public void addAreaTematica(AreaTematica areaTematica) {
        areeTematicheDelCorso.add(areaTematica);
    }
    
    public void removeAreaTematica(AreaTematica areaTematica) {
        areeTematicheDelCorso.remove(areaTematica);
    }
    
    public Object[] creaRiga() {
        Object[] riga = {this, codice, nome, descrizione, tassoPresenzeMinime, numeroMassimoIscritti};
        return riga;
    }
    
    public boolean eFrequentabile(Studente studente) {
        if(!studentiIscritti.contains(studente) && studentiIscritti.size() < numeroMassimoIscritti) {
            return true;
        }
        return false;
    }
    
    public String toString() {
        return nome + areeTematicheDelCorso.toString();
    }
    
}
