package co.edu.udistrital.Vista;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

/**
 * Clase PanelPrincipal
 *
 * Contiene información para la creación del JFrame que muestra toda la interfaz grafica(botones,labels,etc) que el usuario puedo ver/interactuar.
 */
public class PanelPrincipal extends JFrame {
	
	/** 
	 * Método constructor que crea una instancia de la clase PanelPrincipal.
	 * <br><b>Pos</b><br>  
	 * Se han creado una instancia de la clase PanelPrincipal.
	 * <br>                                           
	 */	
	public PanelPrincipal() {
		setTitle("Pokemon");
		setSize(800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());
		inicializarComp();
		setVisible(true);
	}
	
	/** 
	 * Este método crea una instancia de las clases PanelSur,Panelizquierdo,PanelCentro y Panelderecho que despúes se añaden al JPanel.
	 * <br><b>Pre</b><br> 
	 * El layout del JFrame debe ser un BorderLayout y deben existir las clases PanelSur,Panelizquierdo,PanelCentro y Panelderecho.
	 * <br>
	 * <b>Pos</b><br>  
	 * Se han creado y añadido correctamente una instancia de las clases PanelSur,Panelizquierdo,PanelCentro y Panelderecho respectivamente.
	 * <br>
	 */
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
