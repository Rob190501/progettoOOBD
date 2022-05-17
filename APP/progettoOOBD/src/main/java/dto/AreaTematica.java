package dto;

import java.util.LinkedList;

public class AreaTematica {
    
    private int codice;
    private String nome;
    private String descrizione;
    private LinkedList<Corso> corsiDellAreaTematica;

    public AreaTematica(int codice, String nome, String descrizione) {
        setCodice(codice);
        setNome(nome);
        setDescrizione(descrizione);
        corsiDellAreaTematica = new LinkedList<>();
    }

    

    public AreaTematica(String nome, String descrizione) {
        setNome(nome);
        setDescrizione(descrizione);
        corsiDellAreaTematica = new LinkedList<>();
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
    
    public LinkedList<Corso> getCorsiDellAreaTematica() {
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
    
    public String toString() {
        return getCodice() + " | " + getNome() + " | " + getDescrizione();
    }
    
    public void rimuoviDaAssociazioni() {
        for(Corso corso : corsiDellAreaTematica) {
            corso.getAreeTematicheDelCorso().remove(this);
        }
    }
    
    
}
