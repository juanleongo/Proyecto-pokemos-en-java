package co.edu.udistrital.Vista;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;


public class PanelPrincipal extends JFrame {
	
	public PanelPrincipal() {
		setTitle("Pokemon");
		setSize(800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(10,10));

		inicializarComp();
		
		setVisible(true);
	}
	
	public void inicializarComp(){
		PanelSur psur = new PanelSur();
		getContentPane().add(psur, BorderLayout.SOUTH);
		
		Panelizquierdo pizq = new Panelizquierdo();
		getContentPane().add(pizq, BorderLayout.WEST);
		
		PanelCentro pcentro = new PanelCentro();
		getContentPane().add(pcentro, BorderLayout.CENTER);
		
		Panelderecho pder = new Panelderecho();
		getContentPane().add(pder, BorderLayout.EAST);
	}

}
