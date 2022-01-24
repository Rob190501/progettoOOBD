package controller;

import gui.LoginFrame;

public class Controller {

	private LoginFrame loginFrame;
	
	public Controller() {
		loginFrame = new LoginFrame(this);
	}
	
	
	
	public static void main(String[] args) {
		
		Controller c = new Controller();

	}

}
