package eccezioni.create;

public class CreateAreaTematicaFallitoException extends Exception {

    public CreateAreaTematicaFallitoException(String message) {
        super(message);
    }
    
    public CreateAreaTematicaFallitoException() {
        super("Errore nella creazione dell'area tematica." + System.lineSeparator() + "Controllare la consistenza del DB." + System.lineSeparator() + "La connessione sara' interrotta.");
    }
}
