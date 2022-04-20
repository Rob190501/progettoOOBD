package eccezioni.ricerca;

public class AreaTematicaNonTrovataException extends Exception {

    public AreaTematicaNonTrovataException() {
        super("Area Tematica non trovata." + System.lineSeparator() + "Controllare la consistenza del DB." + System.lineSeparator() + "La connessione sara' interrotta.");
    }
    
}
