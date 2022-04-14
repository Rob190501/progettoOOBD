package eccezioni.associazioni;

public class AssociazioneStudenteLezioneFallitaException extends Exception {
    public AssociazioneStudenteLezioneFallitaException() {
        super("Errore nello stabilire le associazioni tra gli Studenti e le Lezioni." + System.lineSeparator() + "Controllare la consistenza del DB." + System.lineSeparator() + "La connessione sara' interrotta.");
    }
}
