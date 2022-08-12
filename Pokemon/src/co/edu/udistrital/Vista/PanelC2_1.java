package co.edu.udistrital.vista;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Clase PanelC2_1
 *
 * Contiene informaci�n para la creaci�n del Panel que estara contenido en la parte  izquierda del JPanel PanelC2,que contendra el pokemon elegido por el usuario para combatir.
 */
public class PanelC2_1 extends JPanel{
	/** 
	 * Representa el label en el que aparecera el pokemon que ha escogido el usuario.                                        
	 */
	private JLabel Pokemon = new JLabel(); 
	
	/** 
	 * M�todo constructor que crea una instancia de la clase PanelC2_1.
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
	 * Este m�todo inicializa el JLabel "Pokemon" y lo a�ade al JPanel.
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

	/** 
	 * Este m�todo devuelve el label "Pokemon".
	 * <br><b>Pre</b><br> 
	 * Debe existir un JLabel con nombre Pokemon.
	 * <br>
	 * <br><b>Pos</b><br>  
	 * Se ha retornado el label correctamente.
	 * <br>
	 */
	public JLabel getPokemon() {
		return Pokemon;
	}

	/** 
	 * Este m�todo recibe un Jlabel y modifica el label "Pokemon".
	 * <br><b>Pre</b><br> 
	 * Debe existir un arreglo de JLabel con nombre Pokemon.
	 * <br>
	 * <br><b>Pos</b><br>  
	 * Se ha modificado el label correctamente.
	 * <br>
	 */	
	public void setPokemon(JLabel pokemon) {
		Pokemon = pokemon;
	}
	
	
}
