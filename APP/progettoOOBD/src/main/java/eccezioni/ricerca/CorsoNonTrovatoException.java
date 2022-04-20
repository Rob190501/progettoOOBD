package eccezioni.ricerca;

public class CorsoNonTrovatoException extends Exception {

    public CorsoNonTrovatoException() {
        super("Corso non trovato." + System.lineSeparator() + "Controllare la consistenza del DB." + System.lineSeparator() + "La connessione sara' interrotta.");
    }
    
}
