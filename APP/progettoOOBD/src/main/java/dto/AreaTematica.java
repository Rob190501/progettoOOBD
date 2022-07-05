package dto;

import java.util.AbstractList;
import java.util.LinkedList;



public class AreaTematica {
    
    private int codice;
    private String nome;
    private String descrizione;
    private AbstractList<Corso> corsiDellAreaTematica;

    public AreaTematica(int codice, String nome, String descrizione) {
        this.codice = codice;
        this.nome = nome;
        this.descrizione = descrizione;
        this.corsiDellAreaTematica = new LinkedList<>();
    }

    public AreaTematica(String nome, String descrizione) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.corsiDellAreaTematica = new LinkedList<>();
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
    
    public void setCodice(int codice) {
        this.codice = codice;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    
    public AbstractList<Corso> getCorsiDellAreaTematica() {
        return corsiDellAreaTematica;
    }
    
    public void addCorso(Corso corso) {
        corsiDellAreaTematica.add(corso);
    }
    
    public void removeCorso(Corso corso) {
        corsiDellAreaTematica.remove(corso);
    }
    
    public Object[] creaRiga() {
        Object[] riga = {this, codice, nome, descrizione};
        return riga;
    }
    
    public void rimuoviDaAssociazioni() {
        for(Corso corso : corsiDellAreaTematica) {
            corso.getListaAreeTematiche().remove(this);
        }
    }
    
}
