package eccezioni.delete;

public class DeleteStudenteFallitoException extends Exception {

    public DeleteStudenteFallitoException(String message) {
        super(message);
    }
    
    public DeleteStudenteFallitoException() {
        super("Errore nel disiscrivere lo Studente selezionato." + System.lineSeparator() + "Controllare la consistenza del DB." + System.lineSeparator() + "La connessione sara' interrotta.");
    }
    
}
