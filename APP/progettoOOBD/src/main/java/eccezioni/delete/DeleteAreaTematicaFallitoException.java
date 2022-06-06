package eccezioni.delete;

public class DeleteAreaTematicaFallitoException extends Exception {

    public DeleteAreaTematicaFallitoException(String message) {
        super(message);
    }
    
    public DeleteAreaTematicaFallitoException() {
        super("Errore nel rimuovere l'area tematica selezionata." + System.lineSeparator() + "Controllare la consistenza del DB." + System.lineSeparator() + "La connessione sara' interrotta.");
    }
}
