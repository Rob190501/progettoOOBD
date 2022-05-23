
package dto;

import java.util.Date;
import java.util.LinkedList;

public class Lezione {
    
    private int codice;
    private String titolo;
    private String descrizione;
    private String durata;
    private Date dataInizio;
    private Corso corsoDellaLezione;
    private LinkedList<Studente> studentiPresenti;

    public Lezione(int codiceLezione, String titoloLezione, String descrizioneLezione, String durataLezione, Date dataInizio, Corso corsoDellaLezione) {
        setCodice(codiceLezione);
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

    public Date getDataInizio() {
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

    public void setDataInizio(Date dataInizio) {
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
    
}
