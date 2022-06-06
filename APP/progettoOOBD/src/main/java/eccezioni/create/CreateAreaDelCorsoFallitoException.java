package eccezioni.create;

public class CreateAreaDelCorsoFallitoException extends Exception {

    public CreateAreaDelCorsoFallitoException(String message) {
        super(message);
    }
    
    public CreateAreaDelCorsoFallitoException() {
        super("Errore nell'associare l'area tematica al corso." + System.lineSeparator() + "Controllare la consistenza del DB." + System.lineSeparator() + "La connessione sara' interrotta.");
    }
    
}
