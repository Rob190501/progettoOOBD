package eccezioni.delete;

public class DeleteCorsoFallitoException extends Exception {

    public DeleteCorsoFallitoException(String message) {
        super(message);
    }
    
    public DeleteCorsoFallitoException() {
        super("Errore nel rimuovere il corso selezionato." + System.lineSeparator() + "Controllare la consistenza del DB." + System.lineSeparator() + "La connessione sara' interrotta.");
    }
}
