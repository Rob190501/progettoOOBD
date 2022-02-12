package controller;

import connessione.ConnessioneDB;
import dao.implementazione.postgresql.AreaTematicaDAOImplementazione;
import dto.AreaTematica;
import gui.HomeFrameOperatore;
import gui.HomeFrameStudente;
import gui.LoginFrame;
import java.sql.Connection;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controller {
    
    private Connection connection = null;
    private LoginFrame loginFrame;
    private HomeFrameOperatore homeFrameOperatore;
    private HomeFrameStudente homeFrameStudente;
    
    private LinkedList<AreaTematica> listaAreeTematiche;
    private AreaTematicaDAOImplementazione areaTematicaDAO;
    
    public Controller(){
        loginFrame = new LoginFrame(this);
    }
    
    public void chiudiConnessione() {
        if(connection != null){
            try {
                connection.close();
            }
            catch(Exception e) {
                System.out.println("Impossibile chiudere la connessione");
            }
        }
    }
    
    public boolean effettuaConnessioneDB(String userName, String password, String ip, String porta, String db) {        
        chiudiConnessione();
        try {
            connection = ConnessioneDB.getIstanza(userName, password, ip, porta, db).getConnection();
            System.out.println("Connessione riuscita");
            avviaDAO();
            return true;
        }
        catch(Exception e) {
            System.out.println("Connessione fallita");
            return false;
        }
    }
    
    public void avviaDAO() {
        try {
            areaTematicaDAO = new AreaTematicaDAOImplementazione(this, connection);
            
            listaAreeTematiche = areaTematicaDAO.retrieveAllAreaTematica();
            
            for(AreaTematica lista : listaAreeTematiche) {
                System.out.println(lista.toString());
            }
        }
        catch (Exception ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public void terminaEsecuzione() {
        chiudiConnessione();
        System.exit(0);
    }
    
    public void accessoOperatore(){
        loginFrame.setVisible(false);
        homeFrameOperatore = new HomeFrameOperatore(this);
    }
    
    public static void main(String[] args){
        
        Controller c = new Controller();
        
    }
}
