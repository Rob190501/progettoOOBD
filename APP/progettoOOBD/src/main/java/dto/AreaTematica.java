package dto;

public class AreaTematica {
    
    private String areaTematica;
    private String descrizioneArea;

    public AreaTematica(String areaTematica, String descrizioneArea) {
        setAreaTematica(areaTematica);
        setDescrizioneArea(descrizioneArea);
    }

    public String getAreaTematica() {
        return areaTematica;
    }

    public String getDescrizioneArea() {
        return descrizioneArea;
    }
    
    public void setAreaTematica(String areaTematica) {
        this.areaTematica = areaTematica;
    }

    public void setDescrizioneArea(String descrizioneArea) {
        this.descrizioneArea = descrizioneArea;
    }
    
}
