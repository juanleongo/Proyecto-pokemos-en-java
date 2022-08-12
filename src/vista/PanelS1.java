package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Clase PanelS1
 *
 * Contiene informaci�n para la creaci�n del JPanel contenido en el JPanel "PanelSur",que contendra cuatro botones de acciones que puede relizar el usuario.
 */
public class PanelS1 extends JPanel{
	
	/** 
	 * M�todo constructor que crea una instancia de la clase PanelS1.    
	 * <br><b>Pos</b><br>  
	 * Se han creado una instancia de la clase PanelS1.
	 * <br>                                     
	 */	
	public PanelS1() {
		setLayout(new GridLayout(2,2));

		JButton Agregar = new JButton ("Agregar");
		JButton Eliminar = new JButton ("Eliminar");
		JButton Info = new JButton ("Info. Pokem�n");
		JButton Modificar = new JButton("Modificar");
	
		Agregar.setActionCommand("Agregar");
		Eliminar.setActionCommand("Eliminar");
		Info.setActionCommand("Info");
		Modificar.setActionCommand("Modificar");
		
		add(Agregar);
		add(Eliminar);
		add(Info);
		add(Modificar);
		setVisible(true);
	}
}
