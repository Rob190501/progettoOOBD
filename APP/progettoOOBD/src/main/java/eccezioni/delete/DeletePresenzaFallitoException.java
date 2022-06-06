package eccezioni.delete;


public class DeletePresenzaFallitoException extends Exception {

    public DeletePresenzaFallitoException(String message) {
        super(message);
    }
    
    public DeletePresenzaFallitoException() {
        super("Errore nell'eliminazione delle presenze dello studente." + System.lineSeparator() + "Controllare la consistenza del DB." + System.lineSeparator() + "La connessione sara' interrotta.");
    }
    
}
