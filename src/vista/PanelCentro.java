package vista;

import java.awt.GridLayout;

import javax.swing.JPanel;

/**
 * Clase PanelCentro
 *
 * Contiene informaci�n para la creaci�n del Panel ubicado en el centro del JFrame PanelPrincipal,que contendra varios paneles con distintas funcionalidades.
 */
public class PanelCentro extends JPanel{
	
	private PanelC1 PanelC1;
	private PanelC2 PanelC2 ;
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
		PanelC1 = new PanelC1();
		add(PanelC1);
		
		PanelC2 = new PanelC2();
		add(PanelC2);
	}

	public PanelC1 getPanelC1() {
		return PanelC1;
	}

	public void setPanelC1(PanelC1 panelC1) {
		PanelC1 = panelC1;
	}

	public PanelC2 getPanelC2() {
		return PanelC2;
	}

	public void setPanelC2(PanelC2 panelC2) {
		PanelC2 = panelC2;
	}
}