package dto;

import java.time.ZonedDateTime;
import java.util.AbstractList;
import java.util.LinkedList;



public class Lezione {
    
    private int codice;
    private String titolo;
    private String descrizione;
    private String durata;
    private ZonedDateTime dataInizio;
    private Corso corso;
    private AbstractList<Studente> listaStudenti;

    public Lezione(int codice, String titolo, String descrizione, String durata, ZonedDateTime dataInizio) {
        this.codice = codice;
        this.titolo = titolo;
        this.descrizione = descrizione;
        this.durata = durata;
        this.dataInizio = dataInizio;
        this.listaStudenti = new LinkedList<>();
    }
    
    public Lezione(String titolo, String descrizione, String durata, ZonedDateTime dataInizio, Corso corso) {
        this.titolo = titolo;
        this.descrizione = descrizione;
        this.durata = durata;
        this.dataInizio = dataInizio;
        this.corso = corso;
        this.listaStudenti = new LinkedList<>();
    }
    
    public int getCodice() {
        return codice;
    }
    
    public String getTitolo() {
        return titolo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String getDurata() {
        return durata;
    }

    public ZonedDateTime getDataInizio() {
        return dataInizio;
    }

    public Corso getCorso() {
        return corso;
    }

    public AbstractList<Studente> getListaStudenti() {
        return listaStudenti;
    }
    
    public void setCodice(int codice) {
        this.codice = codice;
    }

    public void setTitolo(String nomeLezione) {
        this.titolo = nomeLezione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public void setDurata(String durata) {
        this.durata = durata;
    }

    public void setDataInizio(ZonedDateTime dataInizio) {
        this.dataInizio = dataInizio;
    }

    public void setCorso(Corso corso) {
        this.corso = corso;
    }
    
    public void addStudente(Studente studente) {
        listaStudenti.add(studente);
    }
    
    public void removeStudente(Studente studente) {
        listaStudenti.remove(studente);
    }
    
    public Object[] creaRiga() {
        Object[] riga = {this, codice, titolo, descrizione, dataInizio, durata};
        return riga;
    }
    
    public void rimuoviDaAssociazioni() {
        corso.getListaLezioni().remove(this);
        
        for(Studente studente : listaStudenti) {
            studente.getListaLezioni().remove(this);
        }
    }
    
    public int getNumeroPresenti() {
        return listaStudenti.size();
    }
    
}
