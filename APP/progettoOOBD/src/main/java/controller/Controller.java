package controller;

import gui.HomeFrameOperatore;
import gui.HomeFrameStudente;
import gui.LoginFrame;



public class Controller {
    
    private LoginFrame loginFrame;
    private HomeFrameOperatore homeFrameOperatore;
    private HomeFrameStudente homeFrameStudente;
    
    public Controller(){
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
