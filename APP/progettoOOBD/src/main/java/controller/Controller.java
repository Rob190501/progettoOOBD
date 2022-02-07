package controller;

import connessione.ConnessioneDB;
import gui.HomeFrameOperatore;
import gui.HomeFrameStudente;
import gui.LoginFrame;
import java.sql.Connection;



public class Controller {
    
    private Connection connection;
    private LoginFrame loginFrame;
    private HomeFrameOperatore homeFrameOperatore;
    private HomeFrameStudente homeFrameStudente;
    
    public Controller(){
        try {
            connection = ConnessioneDB.getIstanza().getConnection();
            System.out.println("Connessione riuscita");
            connection.close();
        }
        catch(Exception e) {
            e.printStackTrace();
            //System.out.println("Connessione fallita");
        }
        
        loginFrame = new LoginFrame(this);
    }
    
    public void accessoOperatore(){
        loginFrame.setVisible(false);
        homeFrameOperatore = new HomeFrameOperatore(this);
    }
    
    public static void main(String[] args){
        
        Controller c = new Controller();
        
        //hfs = new HomeFrameStudenti(c);
        
    }
}
