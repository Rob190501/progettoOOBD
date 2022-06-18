
package dto;

import java.time.ZonedDateTime;
import java.util.LinkedList;

public class Lezione {
    
    private int codice;
    private String titolo;
    private String descrizione;
    private String durata;
    private ZonedDateTime dataInizio;
    private Corso corsoDellaLezione;
    private LinkedList<Studente> studentiPresenti;

    public Lezione(int codiceLezione, String titoloLezione, String descrizioneLezione, String durataLezione, ZonedDateTime dataInizio) {
        setCodice(codiceLezione);
        setTitolo(titoloLezione);
        setDescrizione(descrizioneLezione);
        setDurata(durataLezione);
        setDataInizio(dataInizio);
        studentiPresenti = new LinkedList<>();
    }
    
    public Lezione(String titoloLezione, String descrizioneLezione, String durataLezione, ZonedDateTime dataInizio, Corso corsoDellaLezione) {
        setTitolo(titoloLezione);
        setDescrizione(descrizioneLezione);
        setDurata(durataLezione);
        setDataInizio(dataInizio);
        setCorsoDellaLezione(corsoDellaLezione);
        studentiPresenti = new LinkedList<>();
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

    public Corso getCorsoDellaLezione() {
        return corsoDellaLezione;
    }

    public LinkedList<Studente> getStudentiPresenti() {
        return studentiPresenti;
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

    public void setCorsoDellaLezione(Corso corsoDellaLezione) {
        this.corsoDellaLezione = corsoDellaLezione;
    }
    
    public void addStudente(Studente studente) {
        studentiPresenti.add(studente);
    }
    
    public void removeStudente(Studente studente) {
        studentiPresenti.remove(studente);
    }
    
    public Object[] creaRiga() {
        Object[] riga = {this, codice, titolo, descrizione, dataInizio, durata};
        return riga;
    }
    
    public String toString() {
        return codice + " | " + titolo + " | " + descrizione + " | " + durata + " | " + dataInizio + " | " + corsoDellaLezione.getNome();
    }
    
    public void rimuoviDaAssociazioni() {
        corsoDellaLezione.getListaLezioni().remove(this);
        
        for(Studente studente : studentiPresenti) {
            studente.getListaPresenze().remove(this);
        }
    }
    
    public int getNumeroPresenti() {
        return studentiPresenti.size();
    }
    
}
