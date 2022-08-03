package co.edu.udistrital.Vista;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class PanelCentro extends JPanel{

	public PanelCentro() {
		setLayout(new GridLayout(2,1));		
		inicializarComp();
		setVisible(true);
	}
	
	public void inicializarComp() {
		PanelC1 PanelC1 = new PanelC1();
		add(PanelC1);
		
		PanelC2 PanelC2 = new PanelC2();
		add(PanelC2);
	}
	
}
