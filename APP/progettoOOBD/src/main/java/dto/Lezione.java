
package dto;

import java.util.LinkedList;

public class Lezione {
    
    private int codice;
    private String titolo;
    private String descrizione;
    private String durata;
    private String dataInizio;
    private String oraInizio;
    private Corso corsoDellaLezione;
    private LinkedList<Studente> studentiPresenti;

    public Lezione(int codiceLezione, String titoloLezione, String descrizioneLezione, String durataLezione, String dataInizio, String oraInizio, Corso corsoDellaLezione) {
        setCodice(codiceLezione);
        setTitolo(titoloLezione);
        setDescrizione(descrizioneLezione);
        setDurata(durataLezione);
        setDataInizio(dataInizio);
        setOraInizio(oraInizio);
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

    public String getDataInizio() {
        return dataInizio;
    }

    public String getOraInizio() {
        return oraInizio;
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

    public void setDataInizio(String dataInizio) {
        this.dataInizio = dataInizio;
    }

    public void setOraInizio(String oraInizio) {
        this.oraInizio = oraInizio;
    }

    public void setCorsoDellaLezione(Corso corsoDellaLezione) {
        this.corsoDellaLezione = corsoDellaLezione;
    }
    
    public void addStudente(Studente studente) {
        studentiPresenti.add(studente);
    }
    
    public String toString() {
        return codice + " | " + titolo + " | " + descrizione + " | " + durata + " | " + dataInizio + " | " + oraInizio + " | " + corsoDellaLezione.getNome();
    }
    
}
