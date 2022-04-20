package eccezioni.elementiGui;

public class NessunaRigaSelezionataException extends Exception {
    public NessunaRigaSelezionataException(String nomeTabella) {
        super("Nessuna riga selezionata nella tabella " + nomeTabella + ". Selezionarne una per eseguire l'operazione.");
    }
}
