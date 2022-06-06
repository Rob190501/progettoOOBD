package eccezioni.delete;

public class DeleteLezioneFallitoException extends Exception {

    public DeleteLezioneFallitoException(String message) {
        super(message);
    }
    
    public DeleteLezioneFallitoException() {
        super("Errore nell'eliminare la lezione selezionata." + System.lineSeparator() + "Controllare la consistenza del DB." + System.lineSeparator() + "La connessione sara' interrotta.");
    }
    
}
