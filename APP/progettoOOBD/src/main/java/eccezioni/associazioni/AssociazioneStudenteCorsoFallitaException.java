package eccezioni.associazioni;

public class AssociazioneStudenteCorsoFallitaException extends Exception {
    public AssociazioneStudenteCorsoFallitaException() {
        super("Errore nello stabilire le associazioni tra gli Studenti e i Corsi." + System.lineSeparator() + "Controllare la consistenza del DB." + System.lineSeparator() + "La connessione sara' interrotta.");
    }
}
