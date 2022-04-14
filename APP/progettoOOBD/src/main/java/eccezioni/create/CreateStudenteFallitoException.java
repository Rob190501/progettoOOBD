package eccezioni.create;

public class CreateStudenteFallitoException extends Exception {
    public CreateStudenteFallitoException() {
        super("Errore nella creazione dello Studente" + System.lineSeparator() + "Controllare la consistenza del DB." + System.lineSeparator() + "La connessione sara' interrotta.");
    }
}
