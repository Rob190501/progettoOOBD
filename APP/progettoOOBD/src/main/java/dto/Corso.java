package dto;

import java.util.AbstractList;
import java.util.LinkedList;
import java.util.NoSuchElementException;



public class Corso {
    
    private int codice;
    private String nome;
    private String descrizione;
    private int tassoPresenzeMinime;
    private int numeroMassimoIscritti;
    private AbstractList<Studente> listaStudenti;
    private AbstractList<Lezione> listaLezioni;
    private AbstractList<AreaTematica> listaAreeTematiche;

    public Corso(int codice, String nome, String descrizione, int tassoPresenzeMin, int numeroMassimoIscritti) {
        this.codice = codice;
        this.nome = nome;
        this.descrizione = descrizione;
        this.tassoPresenzeMinime = tassoPresenzeMin;
        this.numeroMassimoIscritti = numeroMassimoIscritti;
        this.listaStudenti = new LinkedList<>();
        this.listaLezioni = new LinkedList<>();
        this.listaAreeTematiche = new LinkedList<>();
    }
    
    public Corso(String nome, String descrizione, int tassoPresenzeMin, int numeroMassimoIscritti) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.tassoPresenzeMinime = tassoPresenzeMin;
        this.numeroMassimoIscritti = numeroMassimoIscritti;
        listaStudenti = new LinkedList<>();
        listaLezioni = new LinkedList<>();
        listaAreeTematiche = new LinkedList<>();
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
    
    public AbstractList<Studente> getListaStudenti() {
        return listaStudenti;
    }
    
    public AbstractList<Lezione> getListaLezioni() {
        return listaLezioni;
    }
    
    public AbstractList<AreaTematica> getListaAreeTematiche() {
        return listaAreeTematiche;
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
        listaStudenti.add(studente);
    }
    
    public void removeStudente(Studente studente) {
        listaStudenti.remove(studente);
    }
    
    public void addLezione(Lezione lezione) {
        listaLezioni.add(lezione);
    }
    
    public void removeLezione(Lezione lezione) {
        listaLezioni.remove(lezione);
    }
    
    public void addAreaTematica(AreaTematica areaTematica) {
        listaAreeTematiche.add(areaTematica);
    }
    
    public void removeAreaTematica(AreaTematica areaTematica) {
        listaAreeTematiche.remove(areaTematica);
    }
    
    public Object[] creaRiga() {
        Object[] riga = {this, codice, nome, descrizione, tassoPresenzeMinime, numeroMassimoIscritti};
        return riga;
    }
    
    public boolean eFrequentabile(Studente studente) {
        return (!listaStudenti.contains(studente) && listaStudenti.size() < numeroMassimoIscritti);
    }
    
    public void rimuoviDaAssociazioni() {
        for(Studente studente : listaStudenti) {
            studente.getListaLezioni().removeAll(listaLezioni);
            studente.removeCorso(this);
        }
        
        for(AreaTematica areaTematica : listaAreeTematiche) {
            areaTematica.removeCorso(this);
        }
    }
    
    public int getNumeroLezioni() {
        return listaLezioni.size();
    }
    
    public int getNumeroPresenzeMinimo() {
        try {
            int min = ((Lezione) ((LinkedList) listaLezioni).getFirst()).getNumeroPresenti();
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
    
    public int getNumeroIscritti() {
        return listaStudenti.size();
    }
    
    public int getNumeroPresenzeMassimo() {
        try {
            int max = ((Lezione) ((LinkedList) listaLezioni).getFirst()).getNumeroPresenti();;
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
        try {
            int presenzeEffettive = 0;
            for(Lezione lezione : listaLezioni) {
                presenzeEffettive += lezione.getNumeroPresenti();
            }
            int numeroLezioni = listaLezioni.size();
            int numeroIscritti = listaStudenti.size();

            int presenzeMassime = numeroIscritti * numeroLezioni;

            return (float) ((presenzeEffettive * 100) / presenzeMassime);
        }
        catch(ArithmeticException e) {
            return 0;
        }
    }
    
    public boolean ricerca(String parolaChiave) {
        if(nome.contains(parolaChiave) || descrizione.contains(parolaChiave)) {
            return true;
        }
        
        for(AreaTematica areaTematica : listaAreeTematiche) {
            if(areaTematica.getNome().contains(parolaChiave) || areaTematica.getDescrizione().contains(parolaChiave)) {
                return true;
            }
        }
        
        for(Lezione lezione : listaLezioni) {
            if(lezione.getTitolo().contains(parolaChiave) || lezione.getDescrizione().contains(parolaChiave) ||
                lezione.getDataInizio().toString().contains(parolaChiave) ) {
                return true;
            }
        }
        
        return false;
    }
    
}
