package eccezioni.update;

import eccezioni.delete.*;

public class UpdateStudenteFallitoException extends Exception {
    public UpdateStudenteFallitoException() {
        super("Errore nell'aggiornare lo Studente selezionato." + System.lineSeparator() + "Controllare la consistenza del DB." + System.lineSeparator() + "La connessione sara' interrotta.");
    }
}
