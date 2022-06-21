package eccezioni.delete;



public class DeleteFallitoException extends Exception {
    
    public DeleteFallitoException(String cosaEliminare, String messaggioEccezione) {
        super("Errore nell'eliminare " + cosaEliminare + " dal DB." + System.lineSeparator()
              + "Controllare la consistenza del DB." + System.lineSeparator() + "La connessione sara' interrotta."
              + System.lineSeparator() + "Messaggio ecezione: " + System.lineSeparator() + messaggioEccezione);
    }
    
}