package main;

import controller.Controller;
import gui.login.LoginFrame;

public class Main {
    public static void main(String[] args){        
        Controller controller = new Controller();
        controller.setLoginFrame(new LoginFrame(controller));
        controller.getLoginFrame().setVisible(true);
    }
}
