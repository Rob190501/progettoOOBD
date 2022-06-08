package dto;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Corso {
    
    private int codice;
    private String nome;
    private String descrizione;
    private int tassoPresenzeMinime;
    private int numeroMassimoIscritti;
    private LinkedList<Studente> studentiIscritti;
    private LinkedList<Lezione> listaLezioni;
    private LinkedList<AreaTematica> areeTematicheDelCorso;

    public Corso(int codice, String nome, String descrizione, int tassoPresenzeMin, int numeroMassimoIscritti) {
        setCodice(codice);
        setNome(nome);
        setDescrizione(descrizione);
        setTassoPresenzeMinime(tassoPresenzeMin);
        setNumeroMassimoIscritti(numeroMassimoIscritti);
        studentiIscritti = new LinkedList<>();
        listaLezioni = new LinkedList<>();
        areeTematicheDelCorso = new LinkedList<>();
    }
    
    public Corso(String nome, String descrizione, int tassoPresenzeMin, int numeroMassimoIscritti) {
        setNome(nome);
        setDescrizione(descrizione);
        setTassoPresenzeMinime(tassoPresenzeMin);
        setNumeroMassimoIscritti(numeroMassimoIscritti);
        studentiIscritti = new LinkedList<>();
        listaLezioni = new LinkedList<>();
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
    
    public LinkedList<Lezione> getListaLezioni() {
        return listaLezioni;
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
        listaLezioni.add(lezione);
    }
    
    public void removeLezione(Lezione lezione) {
        listaLezioni.remove(lezione);
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
    
    public void rimuoviDaAssociazioni() {
        for(Studente studente : studentiIscritti) {
            studente.getListaCorsiFrequentati().remove(this);
        }
        
        for(AreaTematica areaTematica : areeTematicheDelCorso) {
            areaTematica.removeCorso(this);
        }
    }
    
    public int getNumeroLezioni() {
        return listaLezioni.size();
    }
    
    public int getNumeroPresenzeMinimo() {
        try {
            int min = listaLezioni.getFirst().getNumeroPresenti();
            for(Lezione lezione : listaLezioni) {
                if(lezione.getNumeroPresenti()<min) {
                    min = lezione.getNumeroPresenti();
                }
            }
            return min;
        }
        catch (NoSuchElementException e) {
            return 0;
        }
    }
    
    public int getNumeroPresenzeMassimo() {
        try {
            int max = listaLezioni.getFirst().getNumeroPresenti();
            for(Lezione lezione : listaLezioni) {
                if(lezione.getNumeroPresenti()>max) {
                    max = lezione.getNumeroPresenti();
                }
            }
            return max;
        }
        catch (NoSuchElementException e) {
            return 0;
        }
    }
    
    public float getNumeroPresenzeMedio() {
        try {
            int presenzeTotali = 0;
            for(Lezione lezione : listaLezioni) {
                presenzeTotali += lezione.getNumeroPresenti();
            }
            return (float) presenzeTotali/listaLezioni.size();
        }
        catch (ArithmeticException e) {
            return 0;
        }
    }
    
    public float getPercentualeRiempimentoMedia() {
        int presenzeEffettive = 0;
        for(Lezione lezione : listaLezioni) {
            presenzeEffettive += lezione.getNumeroPresenti();
        }
        int numeroLezioni = listaLezioni.size();
        int numeroIscritti = studentiIscritti.size();
        
        int presenzeMassime = numeroIscritti * numeroLezioni;
        
        return (float) ((presenzeEffettive * 100) / presenzeMassime);
    }
    
}
