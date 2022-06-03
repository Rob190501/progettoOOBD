package eccezioni.associazioni;

public class AssociazioneLezioneCorsoFallitaException extends Exception {

    public AssociazioneLezioneCorsoFallitaException() {
        super("Errore nell'associare le lezioni ai corsi." + System.lineSeparator() + "Controllare la consistenza del DB." + System.lineSeparator() + "La connessione sara' interrotta.");
    }
    
}
