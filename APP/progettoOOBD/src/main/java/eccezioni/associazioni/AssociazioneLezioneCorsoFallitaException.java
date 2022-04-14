package eccezioni.associazioni;

public class AssociazioneLezioneCorsoFallitaException extends Exception {
    
    public AssociazioneLezioneCorsoFallitaException() {
        super("Errore nello stabilire le associazioni tra le Lezioni e i Corsi." + System.lineSeparator() + "Controllare la consistenza del DB." + System.lineSeparator() + "La connessione sara' interrotta.");
    }
    
}
