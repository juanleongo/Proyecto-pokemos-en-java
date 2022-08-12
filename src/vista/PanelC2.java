package vista;

import java.awt.BorderLayout;

import javax.swing.JPanel;
/**
 * Clase PanelC2
 *
 * Contiene informaci�n para la creaci�n del Panel que estara contenido en la parte inferior del JPanel PanelCentro,que contendra 2 paneles en los cuales se mostraran los pokemon que estan combatiendo actualmente.
 */
public class PanelC2 extends JPanel{
	
	/** 
	 * M�todo constructor que crea una instancia de la clase PanelC2.
	 * <br><b>Pos</b><br>  
	 * Se han creado una instancia de la clase PanelC2.
	 * <br>                                           
	 */	
	public PanelC2() {
		setLayout(new BorderLayout());
		inicializarComp();
		setVisible(true);
	}

	/** 
	 * Este m�todo crea una instancia de las clases PanelC2_1 y PanelC2_2,que desp�es se a�aden al JPanel.
	 * <br><b>Pre</b><br> 
	 * El layout del JPanel debe ser un BoderLayout y deben existir las clases PanelC2_1,PanelC2_2.
	 * <br>
	 * <b>Pos</b><br>  
	 * Se han creado y a�adido correctamente una instancia de las clases PanelC2_1 y PanelC2_2 respectivamente.
	 * <br>
	 */
	public void inicializarComp(){
		PanelC2_1 pc2_1 = new PanelC2_1();
		add(pc2_1, BorderLayout.WEST);
		
		PanelC2_2 pc2_2 = new PanelC2_2();
		add(pc2_2, BorderLayout.EAST);
	}
}
