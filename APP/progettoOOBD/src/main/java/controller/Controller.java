package controller;

import gui.HomeFrameOperatori;
import gui.HomeFrameStudenti;
import gui.LoginFrame;



public class Controller {
    public Controller(){
        
    }
    
    public static void main(String[] args){
        
        Controller c = new Controller();
        
        HomeFrameStudenti hfs = new HomeFrameStudenti(c);
        LoginFrame lf = new LoginFrame(c);
        HomeFrameOperatori hfo = new HomeFrameOperatori(c);
        
    }
}
