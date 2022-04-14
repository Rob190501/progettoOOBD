package eccezioni.associazioni;

public class AssociazioneCorsoAreaTematicaFallitaException extends Exception {
    
    public AssociazioneCorsoAreaTematicaFallitaException() {
        super("Errore nello stabilire le associazioni tra i Corsi e le Aree Tematiche." + System.lineSeparator() + "Controllare la consistenza del DB." + System.lineSeparator() + "La connessione sara' interrotta.");
    }
    
}
