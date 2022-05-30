package eccezioni.delete;

public class DeleteLezioneFallitoException extends Exception {
    public DeleteLezioneFallitoException() {
        super("Errore nell'eliminare la lezione selezionata." + System.lineSeparator() + "Controllare la consistenza del DB." + System.lineSeparator() + "La connessione sara' interrotta.");
    }
}
