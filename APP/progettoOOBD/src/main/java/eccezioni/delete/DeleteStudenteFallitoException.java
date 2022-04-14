package eccezioni.delete;

public class DeleteStudenteFallitoException extends Exception {
    public DeleteStudenteFallitoException() {
        super("Errore nell'eliminazione dello Studente selezionato." + System.lineSeparator() + "Controllare la consistenza del DB." + System.lineSeparator() + "La connessione sara' interrotta.");
    }
}
