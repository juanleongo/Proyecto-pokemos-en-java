package vista;

import java.awt.GridLayout;

import javax.swing.JPanel;

/**
 * Clase PanelCentro
 *
 * Contiene informaci�n para la creaci�n del Panel ubicado en el centro del JFrame PanelPrincipal,que contendra varios paneles con distintas funcionalidades.
 */
public class PanelCentro extends JPanel{
	
	/** 
	 * M�todo constructor que crea una instancia de la clase PanelCentro.
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
	 * Este m�todo crea una instancia de las clases PanelC1 y PanelC2,que desp�es se a�aden al JPanel.
	 * <br><b>Pre</b><br> 
	 * El layout del JPanel debe ser un GridLayout(2,1) y deben existir las clases PanelC1,PanelC2.
	 * <br>
	 * <b>Pos</b><br>  
	 * Se han creado y a�adido correctamente una instancia de las clases PanelC1 y PanelC2 respectivamente.
	 * <br>
	 */
	public void inicializarComp() {
		PanelC1 PanelC1 = new PanelC1();
		add(PanelC1);
		
		PanelC2 PanelC2 = new PanelC2();
		add(PanelC2);
	}
	
}