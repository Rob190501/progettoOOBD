package eccezioni.create;

public class CreatePresenzaFallitoException extends Exception {

    public CreatePresenzaFallitoException(String message) {
        super(message);
    }

    public CreatePresenzaFallitoException() {
        super("Errore nel registrare la presenza." + System.lineSeparator() + "Controllare la consistenza del DB." + System.lineSeparator() + "La connessione sara' interrotta.");
    }
    
}
