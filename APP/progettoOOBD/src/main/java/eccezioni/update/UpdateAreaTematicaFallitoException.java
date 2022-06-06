package eccezioni.update;

public class UpdateAreaTematicaFallitoException extends Exception {

    public UpdateAreaTematicaFallitoException(String message) {
        super(message);
    }
    
    public UpdateAreaTematicaFallitoException() {
        super("Errore nell'aggiornare l'area tematica selezionata." + System.lineSeparator() + "Controllare la consistenza del DB." + System.lineSeparator() + "La connessione sara' interrotta.");
    }
    
}
