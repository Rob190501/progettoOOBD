
package dto;

public class Lezione {
    
    private String nomeLezione;
    private String descrizioneLezione;
    private String durataLezione;
    private String dataInizio;
    private String oraInizio;
    private Corso corsoDellaLezione;

    public Lezione(String nomeLezione, String descrizioneLezione, String durataLezione, String dataInizio, String oraInizio, Corso corsoDellaLezione) {
        setNomeLezione(nomeLezione);
        setDescrizioneLezione(descrizioneLezione);
        setDurataLezione(durataLezione);
        setDataInizio(dataInizio);
        setOraInizio(oraInizio);
        setCorsoDellaLezione(corsoDellaLezione);
    }
    
    public String getNomeLezione() {
        return nomeLezione;
    }

    public String getDescrizioneLezione() {
        return descrizioneLezione;
    }

    public String getDurataLezione() {
        return durataLezione;
    }

    public String getDataInizio() {
        return dataInizio;
    }

    public String getOraInizio() {
        return oraInizio;
    }

    public Corso getCorsoDellaLezione() {
        return corsoDellaLezione;
    }

    public void setNomeLezione(String nomeLezione) {
        this.nomeLezione = nomeLezione;
    }

    public void setDescrizioneLezione(String descrizioneLezione) {
        this.descrizioneLezione = descrizioneLezione;
    }

    public void setDurataLezione(String durataLezione) {
        this.durataLezione = durataLezione;
    }

    public void setDataInizio(String dataInizio) {
        this.dataInizio = dataInizio;
    }

    public void setOraInizio(String oraInizio) {
        this.oraInizio = oraInizio;
    }

    public void setCorsoDellaLezione(Corso corsoDellaLezione) {
        this.corsoDellaLezione = corsoDellaLezione;
    }
    
    
    
}
