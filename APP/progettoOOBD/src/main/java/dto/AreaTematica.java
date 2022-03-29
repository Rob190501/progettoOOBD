package dto;

import java.util.LinkedList;

public class AreaTematica {
    
    private int codiceAreaTematica;
    private String nomeAreaTematica;
    private String descrizioneAreaTematica;
    private LinkedList<Corso> corsiDellArea;

    public AreaTematica(int codiceAreaTematica, String nomeAreaTematica, String descrizioneAreaTematica) {
        setCodiceAreaTematica(codiceAreaTematica);
        setNomeAreaTematica(nomeAreaTematica);
        setDescrizioneAreaTematica(descrizioneAreaTematica);
        corsiDellArea = new LinkedList<>();
    }

    public int getCodiceAreaTematica() {
        return codiceAreaTematica;
    }
    
    public String getNomeAreaTematica() {
        return nomeAreaTematica;
    }

    public String getDescrizioneAreaTematica() {
        return descrizioneAreaTematica;
    }
    
    public void setCodiceAreaTematica(int codiceAreaTematica) {
        this.codiceAreaTematica = codiceAreaTematica;
    }
    
    public void setNomeAreaTematica(String nomeAreaTematica) {
        this.nomeAreaTematica = nomeAreaTematica;
    }

    public void setDescrizioneAreaTematica(String descrizioneAreaTematica) {
        this.descrizioneAreaTematica = descrizioneAreaTematica;
    }
    
    public LinkedList<Corso> getCorsiDellArea() {
        return corsiDellArea;
    }
    
    public void addCorso(Corso corso) {
        corsiDellArea.add(corso);
    }
    
    public String toString() {
        return getCodiceAreaTematica() + " | " + getNomeAreaTematica() + " | " + getDescrizioneAreaTematica();
    }
    
    
}
