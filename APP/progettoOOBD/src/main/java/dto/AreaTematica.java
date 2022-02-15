package dto;

public class AreaTematica {
    
    private int codiceAreaTematica;
    private String nomeAreaTematica;
    private String descrizioneAreaTematica;

    public AreaTematica(int codiceAreaTematica, String nomeAreaTematica, String descrizioneAreaTematica) {
        setCodiceAreaTematica(codiceAreaTematica);
        setNomeAreaTematica(nomeAreaTematica);
        setDescrizioneAreaTematica(descrizioneAreaTematica);
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
    
    public String toString() {
        return getCodiceAreaTematica() + " | " + getNomeAreaTematica() + " | " + getDescrizioneAreaTematica();
    }
    
}
