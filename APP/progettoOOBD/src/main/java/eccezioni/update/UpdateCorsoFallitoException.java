package eccezioni.update;

public class UpdateCorsoFallitoException extends Exception {

    public UpdateCorsoFallitoException(String message) {
        super(message);
    }
    
    public UpdateCorsoFallitoException() {
        super("Errore nell'aggiornare il corso selezionato." + System.lineSeparator() + "Controllare la consistenza del DB." + System.lineSeparator() + "La connessione sara' interrotta.");
    }
    
}
