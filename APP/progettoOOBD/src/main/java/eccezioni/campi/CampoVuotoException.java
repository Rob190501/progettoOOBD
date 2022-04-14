package eccezioni.campi;

public class CampoVuotoException extends Exception {
    public CampoVuotoException() {
        super("Impossibile lasciare i campi vuoti.");
    }
}
