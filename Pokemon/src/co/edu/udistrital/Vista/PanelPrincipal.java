package co.edu.udistrital.vista;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

/**
 * Clase PanelPrincipal
 *
 * Contiene información para la creación del JFrame que muestra toda la interfaz grafica(botones,labels,etc) que el usuario puedo ver/interactuar.
 */
public class PanelPrincipal extends JFrame {
	private PanelSur psur;
	private Panelizquierdo pizq;
	private PanelCentro pcentro;
	private Panelderecho pder;
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
		psur = new PanelSur();
		getContentPane().add(psur, BorderLayout.SOUTH);
		
		pizq = new Panelizquierdo();
		getContentPane().add(pizq, BorderLayout.WEST);
		
		pcentro = new PanelCentro();
		getContentPane().add(pcentro, BorderLayout.CENTER);
		
		pder = new Panelderecho();
		getContentPane().add(pder, BorderLayout.EAST);
	}

	public PanelSur getPsur() {
		return psur;
	}

	public void setPsur(PanelSur psur) {
		this.psur = psur;
	}

	public Panelizquierdo getPizq() {
		return pizq;
	}

	public void setPizq(Panelizquierdo pizq) {
		this.pizq = pizq;
	}

	public PanelCentro getPcentro() {
		return pcentro;
	}

	public void setPcentro(PanelCentro pcentro) {
		this.pcentro = pcentro;
	}

	public Panelderecho getPder() {
		return pder;
	}

	public void setPder(Panelderecho pder) {
		this.pder = pder;
	}
}
