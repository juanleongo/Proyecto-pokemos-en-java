package co.edu.udistrital.Vista;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Clase PanelC2_1
 *
 * Contiene información para la creación del Panel que estara contenido en la parte  izquierda del JPanel PanelC2,que contendra el pokemon elegido por el usuario para combatir.
 */
public class PanelC2_1 extends JPanel{
	/** 
	 * Representa el label en el que aparecera el pokemon que ha escogido el usuario.                                        
	 */
	private JLabel Pokemon = new JLabel(); 
	
	/** 
	 * Método constructor que crea una instancia de la clase PanelC2_1.
	 * <br><b>Pos</b> <br> 
	 * Se han creado una instancia de la clase PanelC2_1.
	 * <br>                                           
	 */
	public PanelC2_1() {
		setLayout(new GridLayout(1,1));
		inicializarComp();
		setVisible(true);
	}
	
	
	/** 
	 * Este método inicializa el JLabel "Pokemon" y lo añade al JPanel.
	 * <br><b>Pre</b><br> 
	 * El layout del JPanel debe ser un GridLayout(1,1)
	 * <br>
	 * <b>Pos</b> <br> 
	 * El objeto instanciado ha sigo agregado al JPanel correctamente.
	 * <br>
	 */
	public void inicializarComp() {
		Pokemon.setText("1");
		add(Pokemon);
	}
}
