package eccezioni.ricerca;


public class LezioneNonTrovataException extends Exception {

    public LezioneNonTrovataException() {
        super("Lezione non trovata." + System.lineSeparator() + "Controllare la consistenza del DB." + System.lineSeparator() + "La connessione sara' interrotta.");
    }
    
}
