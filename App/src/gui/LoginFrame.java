package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.Controller;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Color;
import javax.swing.JButton;

public class LoginFrame extends JFrame {

	private Controller controller;
	
	private JPanel pannelloPrincipale;
	
	public LoginFrame(Controller controller) {
		this.controller = controller;
		
		inizializzaComponenti();
		
		//gestoreEventi();
		
		setVisible(true);
	}

	
	private void inizializzaComponenti() {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		
		pannelloPrincipale = new JPanel();
		pannelloPrincipale.setBackground(Color.WHITE);
		pannelloPrincipale.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pannelloPrincipale);
		pannelloPrincipale.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(153, 163, 85, 21);
		pannelloPrincipale.add(btnNewButton);
	}
}
