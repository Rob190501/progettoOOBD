package eccezioni.update;

public class UpdateStudenteFallitoException extends Exception {

    public UpdateStudenteFallitoException(String message) {
        super(message);
    }
    
    public UpdateStudenteFallitoException() {
        super("Errore nell'aggiornare lo Studente selezionato." + System.lineSeparator() + "Controllare la consistenza del DB." + System.lineSeparator() + "La connessione sara' interrotta.");
    }
    
}
