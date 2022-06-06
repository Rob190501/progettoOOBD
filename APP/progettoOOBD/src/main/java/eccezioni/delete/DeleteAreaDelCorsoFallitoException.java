package eccezioni.delete;


public class DeleteAreaDelCorsoFallitoException extends Exception {

    public DeleteAreaDelCorsoFallitoException() {
        super("Errore nell'eliminazione del Corso dall'area tematica." + System.lineSeparator() + "Controllare la consistenza del DB." + System.lineSeparator() + "La connessione sara' interrotta.");
    }
    
}
