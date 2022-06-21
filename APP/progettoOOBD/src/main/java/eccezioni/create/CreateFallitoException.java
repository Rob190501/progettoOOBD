package eccezioni.create;



public class CreateFallitoException extends Exception {
    
    public CreateFallitoException(String cosaCreare, String messaggioEccezione) {
        super("Errore nel creare " + cosaCreare + " nel DB." + System.lineSeparator()
              + "Controllare la consistenza del DB." + System.lineSeparator() + "La connessione sara' interrotta."
              + System.lineSeparator() + "Messaggio ecezione: " + System.lineSeparator() + messaggioEccezione);
    }
    
}