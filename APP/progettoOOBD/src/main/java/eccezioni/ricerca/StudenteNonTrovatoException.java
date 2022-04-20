package eccezioni.ricerca;

public class StudenteNonTrovatoException extends Exception {

    public StudenteNonTrovatoException() {
        super("Studente non trovato." + System.lineSeparator() + "Controllare la consistenza del DB." + System.lineSeparator() + "La connessione sara' interrotta.");
    }
    
}
