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
	
	private JButton Agregar;
	private JButton Eliminar;
	private JButton Info;
	private JButton Modificar;
	/** 
	 * Método constructor que crea una instancia de la clase PanelS1.    
	 * <br><b>Pos</b><br>  
	 * Se han creado una instancia de la clase PanelS1.
	 * <br>                                     
	 */	
	public PanelS1() {
		setLayout(new GridLayout(2,2));

		 Agregar = new JButton ("Agregar");
		 Eliminar = new JButton ("Eliminar");
		 Info = new JButton ("Info. Pokemón");
		 Modificar = new JButton("Modificar");
	
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
	
	public JButton getAgregar() {
		return Agregar;
	}
	public void setAgregar(JButton agregar) {
		Agregar = agregar;
	}
	public JButton getEliminar() {
		return Eliminar;
	}
	public void setEliminar(JButton eliminar) {
		Eliminar = eliminar;
	}
	public JButton getInfo() {
		return Info;
	}
	public void setInfo(JButton info) {
		Info = info;
	}
	public JButton getModificar() {
		return Modificar;
	}
	public void setModificar(JButton modificar) {
		Modificar = modificar;
	}	
}