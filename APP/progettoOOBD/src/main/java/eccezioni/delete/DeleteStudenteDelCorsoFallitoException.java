package eccezioni.delete;


public class DeleteStudenteDelCorsoFallitoException extends Exception {

    public DeleteStudenteDelCorsoFallitoException() {
        super("Errore nell'eliminazione del Corso dallo Studente selezionato." + System.lineSeparator() + "Controllare la consistenza del DB." + System.lineSeparator() + "La connessione sara' interrotta.");
    }
    
}
