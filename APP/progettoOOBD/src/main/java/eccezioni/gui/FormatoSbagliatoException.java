package eccezioni.gui;



public class FormatoSbagliatoException extends Exception {
    
    public FormatoSbagliatoException(String campo, String formatoCorretto) {
        super("Formato del campo " + campo + " errato. Il formato corretto e' " + formatoCorretto + ".");
    }
    
}
