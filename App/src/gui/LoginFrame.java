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
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class LoginFrame extends JFrame {

	private Controller controller;
	
	private JPanel panelPrincipale;
	private JPanel panelSecondario;
	
	public LoginFrame(Controller controller) {
		this.controller = controller;
		
		inizializzaComponenti();
		
		//gestoreEventi();
		
		setVisible(true);
	}

	
	private void inizializzaComponenti() {
		
		impostaFrame();
		
		impostaPanelPrincipale();
		
		impostaPanelSecondario();
		
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
		setLocationRelativeTo(null);
	}
	
	private void impostaPanelPrincipale() {
		panelPrincipale = new JPanel();
		panelPrincipale.setBackground(Color.LIGHT_GRAY);
		panelPrincipale.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelPrincipale);
	}
	
	private void impostaPanelSecondario() {
		panelSecondario = new JPanel();
		panelSecondario.setBackground(Color.WHITE);
		
		JButton btnProva = new JButton("New button");
		btnProva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		panelSecondario.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panelSecondario.add(btnProva);
	}
	
	private void impostaLayoutPanelPrincipale() {
		GroupLayout gl_panelPrincipale = new GroupLayout(panelPrincipale);
		gl_panelPrincipale.setHorizontalGroup(
			gl_panelPrincipale.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelPrincipale.createSequentialGroup()
					.addGap(33)
					.addComponent(panelSecondario, GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
					.addGap(28))
		);
		gl_panelPrincipale.setVerticalGroup(
			gl_panelPrincipale.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panelPrincipale.createSequentialGroup()
					.addGap(188)
					.addComponent(panelSecondario, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(41))
		);
		panelPrincipale.setLayout(gl_panelPrincipale);
	}
}
