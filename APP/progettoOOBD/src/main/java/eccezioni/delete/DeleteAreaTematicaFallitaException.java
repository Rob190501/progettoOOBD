package eccezioni.delete;

public class DeleteAreaTematicaFallitaException extends Exception {
    public DeleteAreaTematicaFallitaException() {
        super("Errore nel rimuovere l'area tematica selezionata." + System.lineSeparator() + "Controllare la consistenza del DB." + System.lineSeparator() + "La connessione sara' interrotta.");
    }
}
