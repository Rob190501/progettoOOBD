package eccezioni.create;

public class CreateCorsoFallitoException extends Exception {
    public CreateCorsoFallitoException() {
        super("Errore nella creazione del corso." + System.lineSeparator() + "Controllare la consistenza del DB." + System.lineSeparator() + "La connessione sara' interrotta.");
    }
}
