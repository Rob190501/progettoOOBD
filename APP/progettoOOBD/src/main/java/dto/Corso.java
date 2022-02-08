package dto;

public class Corso {
    
    private String nomeCorso;
    private String descrizioneCorso;
    private int tassoPresenzeMin;
    private int partecipantiMax;

    public Corso(String nomeCorso, String descrizioneCorso, int tassoPresenzeMin, int partecipantiMax) {
        setNomeCorso(nomeCorso);
        setDescrizioneCorso(descrizioneCorso);
        setTassoPresenzeMin(tassoPresenzeMin);
        setPartecipantiMax(partecipantiMax);
    }
    
    public String getNomeCorso() {
        return nomeCorso;
    }

    public String getDescrizioneCorso() {
        return descrizioneCorso;
    }

    public int getTassoPresenzeMin() {
        return tassoPresenzeMin;
    }

    public int getPartecipantiMax() {
        return partecipantiMax;
    }
    
    public void setNomeCorso(String nomeCorso) {
        this.nomeCorso = nomeCorso;
    }

    public void setDescrizioneCorso(String descrizioneCorso) {
        this.descrizioneCorso = descrizioneCorso;
    }

    public void setTassoPresenzeMin(int tassoPresenzeMin) {
        this.tassoPresenzeMin = tassoPresenzeMin;
    }

    public void setPartecipantiMax(int partecipantiMax) {
        this.partecipantiMax = partecipantiMax;
    }
    
}
