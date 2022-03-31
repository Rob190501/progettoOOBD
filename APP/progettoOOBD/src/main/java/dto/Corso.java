package dto;

import java.util.LinkedList;

public class Corso {
    
    private int codice;
    private String nome;
    private String descrizione;
    private int tassoPresenzeMinime;
    private int NumeroMassimoIscritti;
    private LinkedList<Studente> studentiIscritti;
    private LinkedList<Lezione> lezioniDelCorso;
    private LinkedList<AreaTematica> areeTematicheDelCorso;

    public Corso(int codiceCorso, String nomeCorso, String descrizioneCorso, int tassoPresenzeMin, int partecipantiMax) {
        setCodice(codiceCorso);
        setNome(nomeCorso);
        setDescrizione(descrizioneCorso);
        setTassoPresenzeMinime(tassoPresenzeMin);
        setNumeroMassimoIscritti(partecipantiMax);
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
        return NumeroMassimoIscritti;
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

    public void setNumeroMassimoIscritti(int NumeroMassimoIscritti) {
        this.NumeroMassimoIscritti = NumeroMassimoIscritti;
    }
    
    public void addStudente(Studente studente) {
        studentiIscritti.add(studente);
    }
    
    public void addLezione(Lezione lezione) {
        lezioniDelCorso.add(lezione);
    }
    
    public void addAreaTematica(AreaTematica areaTematica) {
        areeTematicheDelCorso.add(areaTematica);
    }
    
    public String toString() {
        return nome + areeTematicheDelCorso.toString();
    }
    
}
