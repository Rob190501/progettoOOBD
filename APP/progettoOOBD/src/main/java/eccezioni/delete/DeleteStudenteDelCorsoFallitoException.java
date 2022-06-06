package eccezioni.delete;


public class DeleteStudenteDelCorsoFallitoException extends Exception {

    public DeleteStudenteDelCorsoFallitoException(String message) {
        super(message);
    }
    
    public DeleteStudenteDelCorsoFallitoException() {
        super("Errore nell'eliminazione del Corso dallo Studente selezionato." + System.lineSeparator() + "Controllare la consistenza del DB." + System.lineSeparator() + "La connessione sara' interrotta.");
    }
    
}
