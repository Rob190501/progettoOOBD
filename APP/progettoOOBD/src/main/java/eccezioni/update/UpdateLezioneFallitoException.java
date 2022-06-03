package eccezioni.update;


public class UpdateLezioneFallitoException extends Exception {
    public UpdateLezioneFallitoException() {
        super("Errore nell'aggiornare la lezione selezionata." + System.lineSeparator() + "Controllare la consistenza del DB." + System.lineSeparator() + "La connessione sara' interrotta.");
    }
}
