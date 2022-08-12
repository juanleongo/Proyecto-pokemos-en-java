package co.edu.udistrital.Vista;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Clase PanelC2_2
 *
 * Contiene información para la creación del Panel que estara contenido en la parte derecha del JPanel PanelC2,que contendra el pokemon elegido por la computadora para combatir.
 */
public class PanelC2_2 extends JPanel{
	
	/** 
	 * Representa el label en el que aparecera el pokemon que ha escogido la computadora.                                        
	 */
	private JLabel Pokemon = new JLabel(); 
	
	/** 
	 * Método constructor que crea una instancia de la clase PanelC2_2.
	 * <br><b>Pos</b><br>
	 * Se han creado una instancia de la clase PanelC2_2.
	 * <br>                                           
	 */	
	public PanelC2_2() {
		setLayout(new GridLayout(1,1));
		inicializarComp();
		setVisible(true);
	}

	/** 
	 * Este método inicializa el JLabel "Pokemon" y lo añade al JPanel.
	 * <br><b>Pre</b><br> 
	 * El layout del JPanel debe ser un GridLayout(1,1)
	 * <br>
	 * <b>Pos</b><br>  
	 * El objeto instanciado ha sigo agregado al JPanel correctamente.
	 * <br>
	 */
	public void inicializarComp() {
		Pokemon.setText("2");
		add(Pokemon);
	}
	
	/** 
	 * Este método devuelve el label "Pokemon".
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
	 * Este método recibe un Jlabel y modifica el label "Pokemon".
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
