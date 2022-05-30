package eccezioni.elementiGui;

public class FormatoSbagliatoException extends Exception {
    public FormatoSbagliatoException(String campo, String formato) {
        super("Formato del campo " + campo + " errato. Il formato corretto e' " + formato + ".");
    }
}
