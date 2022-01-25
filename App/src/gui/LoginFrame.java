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
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {

	private Controller controller;
	
	private JPanel panelPrincipale;
	private JPanel panelBottoni;
	
	public LoginFrame(Controller controller) {
		this.controller = controller;
		
		inizializzaComponenti();
		
		//gestoreEventi();
		
		setVisible(true);
	}

	
	private void inizializzaComponenti() {
		
		impostaFrame();
		
		impostaPanelPrincipale();
		
		impostaPanelBottoni();
		
		impostaLayoutPanelPrincipale();
		
	}
	
	private void impostaFrame() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setMinimumSize(new Dimension(450, 300));
		setLocationRelativeTo(null);
	}
	
	private void impostaPanelPrincipale() {
		panelPrincipale = new JPanel();
		panelPrincipale.setBackground(Color.LIGHT_GRAY);
		panelPrincipale.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelPrincipale);
	}
	
	private void impostaPanelBottoni() {
		panelBottoni = new JPanel();
		panelBottoni.setBackground(Color.LIGHT_GRAY);
		panelBottoni.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnAccedi = new JButton("  Accedi  ");
		btnAccedi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelBottoni.add(btnAccedi);
		
		JButton btnRegistrati = new JButton("Registrati");
		btnRegistrati.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelBottoni.add(btnRegistrati);
	}
	
	private void impostaLayoutPanelPrincipale() {
		GroupLayout gl_panelPrincipale = new GroupLayout(panelPrincipale);
		gl_panelPrincipale.setHorizontalGroup(
			gl_panelPrincipale.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelPrincipale.createSequentialGroup()
					.addGap(33)
					.addComponent(panelBottoni, GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
					.addGap(28))
		);
		gl_panelPrincipale.setVerticalGroup(
			gl_panelPrincipale.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelPrincipale.createSequentialGroup()
					.addContainerGap(225, Short.MAX_VALUE)
					.addComponent(panelBottoni, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panelPrincipale.setLayout(gl_panelPrincipale);
	}
}
