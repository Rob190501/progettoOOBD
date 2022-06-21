package eccezioni.update;



public class UpdateFallitoException extends Exception {
    
    public UpdateFallitoException(String cosaAggiornare, String messaggioEccezione) {
        super("Errore nell'aggiornare " + cosaAggiornare + " nel DB." + System.lineSeparator()
              + "Controllare la consistenza del DB." + System.lineSeparator() + "La connessione sara' interrotta."
              + System.lineSeparator() + "Messaggio ecezione: " + System.lineSeparator() + messaggioEccezione);
    }
    
}