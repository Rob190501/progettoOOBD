package eccezioni.elementiGui;

public class CampoVuotoException extends Exception {
    public CampoVuotoException() {
        super("Impossibile lasciare i campi vuoti.");
    }
}
