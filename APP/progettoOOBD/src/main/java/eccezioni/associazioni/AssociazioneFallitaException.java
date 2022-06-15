package eccezioni.associazioni;

public class AssociazioneFallitaException extends Exception {

    public AssociazioneFallitaException(String cosaAssociare) {
        super("Errore nell'associare " + cosaAssociare + " nella memoria del programma." + System.lineSeparator()
              + "Controllare la consistenza del DB." + System.lineSeparator() + "La connessione sara' interrotta.");
    }
    
}