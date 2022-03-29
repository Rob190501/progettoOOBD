package dto;

import java.util.LinkedList;

public class Corso {
    
    private int codiceCorso;
    private String nomeCorso;
    private String descrizioneCorso;
    private int tassoPresenzeMin;
    private int partecipantiMax;
    private LinkedList<Studente> studentiDelCorso;
    private LinkedList<Lezione> lezioniDelCorso;
    private LinkedList<AreaTematica> areeDelCorso;

    public Corso(int codiceCorso, String nomeCorso, String descrizioneCorso, int tassoPresenzeMin, int partecipantiMax) {
        setCodiceCorso(codiceCorso);
        setNomeCorso(nomeCorso);
        setDescrizioneCorso(descrizioneCorso);
        setTassoPresenzeMin(tassoPresenzeMin);
        setPartecipantiMax(partecipantiMax);
        studentiDelCorso = new LinkedList<>();
        lezioniDelCorso = new LinkedList<>();
        areeDelCorso = new LinkedList<>();
    }
    
    public int getCodiceCorso() {
        return codiceCorso;
    }
    
    public String getNomeCorso() {
        return nomeCorso;
    }

    public String getDescrizioneCorso() {
        return descrizioneCorso;
    }

    public int getTassoPresenzeMin() {
        return tassoPresenzeMin;
    }

    public int getPartecipantiMax() {
        return partecipantiMax;
    }
    
    public void setCodiceCorso(int codiceCorso) {
        this.codiceCorso = codiceCorso;
    }
    
    public void setNomeCorso(String nomeCorso) {
        this.nomeCorso = nomeCorso;
    }

    public void setDescrizioneCorso(String descrizioneCorso) {
        this.descrizioneCorso = descrizioneCorso;
    }

    public void setTassoPresenzeMin(int tassoPresenzeMin) {
        this.tassoPresenzeMin = tassoPresenzeMin;
    }

    public void setPartecipantiMax(int partecipantiMax) {
        this.partecipantiMax = partecipantiMax;
    }
    
    public void addStudente(Studente studente) {
        studentiDelCorso.add(studente);
    }
    
    public void addLezione(Lezione lezione) {
        lezioniDelCorso.add(lezione);
    }
    
    public void addAreaTematica(AreaTematica areaTematica) {
        areeDelCorso.add(areaTematica);
    }
    
    public String toString() {
        return nomeCorso + areeDelCorso.toString();
    }
    
}
