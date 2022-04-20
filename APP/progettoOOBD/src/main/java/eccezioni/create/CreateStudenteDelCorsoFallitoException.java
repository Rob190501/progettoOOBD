package eccezioni.create;

public class CreateStudenteDelCorsoFallitoException extends Exception {

    public CreateStudenteDelCorsoFallitoException() {
        super("Errore nell'iscrivere lo Studente al Corso selezionato." + System.lineSeparator() + "Controllare la consistenza del DB." + System.lineSeparator() + "La connessione sara' interrotta.");
    }
    
}
