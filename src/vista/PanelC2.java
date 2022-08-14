package co.edu.udistrital.vista;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;
/**
 * Clase PanelC2
 *
 * Contiene información para la creación del Panel que estara contenido en la parte inferior del JPanel PanelCentro,que contendra 2 paneles en los cuales se mostraran los pokemon que estan combatiendo actualmente.
 */
public class PanelC2 extends JPanel{
	
	private PanelC2_1 pc2_1;
	private PanelC2_2 pc2_2;
	/** 
	 * Método constructor que crea una instancia de la clase PanelC2.
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
	 * Este método crea una instancia de las clases PanelC2_1 y PanelC2_2,que despúes se añaden al JPanel.
	 * <br><b>Pre</b><br> 
	 * El layout del JPanel debe ser un BoderLayout y deben existir las clases PanelC2_1,PanelC2_2.
	 * <br>
	 * <b>Pos</b><br>  
	 * Se han creado y añadido correctamente una instancia de las clases PanelC2_1 y PanelC2_2 respectivamente.
	 * <br>
	 */
	public void inicializarComp(){
		pc2_1 = new PanelC2_1();
		add(pc2_1, BorderLayout.WEST);
		pc2_1.setPreferredSize(new Dimension(250, 600));
		pc2_2 = new PanelC2_2();
		pc2_2.setPreferredSize(new Dimension(250, 600));
		add(pc2_2, BorderLayout.EAST);
	}

	public PanelC2_1 getPc2_1() {
		return pc2_1;
	}

	public void setPc2_1(PanelC2_1 pc2_1) {
		this.pc2_1 = pc2_1;
	}

	public PanelC2_2 getPc2_2() {
		return pc2_2;
	}

	public void setPc2_2(PanelC2_2 pc2_2) {
		this.pc2_2 = pc2_2;
	}
}
