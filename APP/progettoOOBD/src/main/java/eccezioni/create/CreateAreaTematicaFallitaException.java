package eccezioni.create;

public class CreateAreaTematicaFallitaException extends Exception {
    public CreateAreaTematicaFallitaException() {
        super("Errore nella creazione dell'area tematica." + System.lineSeparator() + "Controllare la consistenza del DB." + System.lineSeparator() + "La connessione sara' interrotta.");
    }
}
