package co.edu.udistrital.Vista;

import java.awt.GridLayout;

import javax.swing.JPanel;

/**
 * Clase PanelCentro
 *
 * Contiene información para la creación del Panel ubicado en el centro del JFrame PanelPrincipal,que contendra varios paneles con distintas funcionalidades.
 */
public class PanelCentro extends JPanel{
	
	/** 
	 * Método constructor que crea una instancia de la clase PanelCentro.
	 * <br><b>Pos</b><br>  
	 * Se han creado una instancia de la clase PanelCentro.
	 * <br>                                           
	 */	
	public PanelCentro() {
		setLayout(new GridLayout(2,1));		
		inicializarComp();
		setVisible(true);
	}

	/** 
	 * Este método crea una instancia de las clases PanelC1 y PanelC2,que despúes se añaden al JPanel.
	 * <br><b>Pre</b><br> 
	 * El layout del JPanel debe ser un GridLayout(2,1) y deben existir las clases PanelC1,PanelC2.
	 * <br>
	 * <b>Pos</b><br>  
	 * Se han creado y añadido correctamente una instancia de las clases PanelC1 y PanelC2 respectivamente.
	 * <br>
	 */
	public void inicializarComp() {
		PanelC1 PanelC1 = new PanelC1();
		add(PanelC1);
		
		PanelC2 PanelC2 = new PanelC2();
		add(PanelC2);
	}
	
}