package dto;

public class AreaTematica {
    
    private String nomeAreaTematica;
    private String descrizioneArea;

    public AreaTematica(String nomeAreaTematica, String descrizioneArea) {
        setNomeAreaTematica(nomeAreaTematica);
        setDescrizioneArea(descrizioneArea);
    }

    public String getNomeAreaTematica() {
        return nomeAreaTematica;
    }

    public String getDescrizioneArea() {
        return descrizioneArea;
    }
    
    public void setNomeAreaTematica(String nomeAreaTematica) {
        this.nomeAreaTematica = nomeAreaTematica;
    }

    public void setDescrizioneArea(String descrizioneArea) {
        this.descrizioneArea = descrizioneArea;
    }
    
    public String toString() {
        return getNomeAreaTematica() + ": " + getDescrizioneArea();
    }
    
}
