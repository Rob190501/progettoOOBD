package eccezioni.retrieve;



public class RetrieveFallitoException extends Exception {
    
    public RetrieveFallitoException(String cosaRecuperare, String messaggioEccezione) {
        super("Errore nel recuperare " + cosaRecuperare + " dal DB." + System.lineSeparator()
              + "Controllare la consistenza del DB." + System.lineSeparator() + "La connessione sara' interrotta."
              + System.lineSeparator() + "Messaggio ecezione: " + System.lineSeparator() + messaggioEccezione);
    }
    
}