package co.edu.udistrital.Vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelSur extends JPanel{
	
	
	public PanelSur() {
		setLayout(new GridLayout(1,2));
		
		inicializarComp();
		setVisible(true);
	}
	
	public void inicializarComp() {
		PanelS1 ps1 = new PanelS1();
		add(ps1);
		
		JButton Combatir = new JButton ("Combatir");
		add(Combatir);
		
		Combatir.setActionCommand("Combatir");
	}
	


	
}
