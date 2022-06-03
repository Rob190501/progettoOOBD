package eccezioni.update;

import eccezioni.delete.*;

public class UpdateCorsoFallitoException extends Exception {
    public UpdateCorsoFallitoException() {
        super("Errore nell'aggiornare il corso selezionato." + System.lineSeparator() + "Controllare la consistenza del DB." + System.lineSeparator() + "La connessione sara' interrotta.");
    }
}
