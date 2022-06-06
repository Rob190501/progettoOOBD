package eccezioni.create;

public class CreateLezioneFallitoException extends Exception {

    public CreateLezioneFallitoException(String message) {
        super(message);
    }
    
    public CreateLezioneFallitoException() {
        super("Errore nella creazione della Lezione" + System.lineSeparator() + "Controllare la consistenza del DB." + System.lineSeparator() + "La connessione sara' interrotta.");
    }
}
