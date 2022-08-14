package vista;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Clase PanelC1
 *
 * Contiene información para la creación del Panel que estara contenido en la parte superior del JPanel PanelCentro,que contendra los pokemon elegidos por el usuario para combatir.
 */
public class PanelC1 extends JPanel{
	/** 
	 * Representa los labels en los que apareceran los pokemon que ha escogido el usuario.                                        
	 */
	private JLabel [] Pokemons = new JLabel [5]; 
	/** 
	 * Método constructor que crea una instancia de la clase PanelC1.
	 * <br><b>Pos</b><br>  
	 * Se han creado una instancia de la clase PanelC1.
	 * <br>                                           
	 */	
	public PanelC1() {
		setLayout(new GridLayout(1,5));
		inicializarComp(); 	
		setVisible(true);
	}
	
	/** 
	 * Este método llama al método "inicializarNomPokemons" y añade cada posición del arreglo al JPanel.
	 * <br><b>Pre</b><br> 
	 * El layout del JPanel debe ser un GridLayout(1,5)
	 * <br>
	 * <b>Pos</b><br> 
	 * Los objetos instanciados han sigo agregados al JPanel correctamente.
	 * <br>
	 */
	public void inicializarComp() {
		inicializarNomPokemons();
		for(int i=0; i<5; i++) {
			add(Pokemons[i]);
		}
	}
	
	/** 
	 * Este método inicializa cada posición de el arreglo de JLabels "Pokemons".
	 * <br><b>Pre</b><br> 
	 * Debe existir un arreglo de JLabel con tamaño=5 y con nombre Pokemons.
	 * <br>
	 * <br><b>Pos</b><br>  
	 * Cada posición del arreglo ha sido inicializado correctamente.
	 * <br>
	 */
	public void inicializarNomPokemons() {
		for(int i=0; i<5; i++) {
			this.Pokemons[i]=new JLabel (" ");
		}
	}
	
	/** 
	 * Este método devuelve el arreglo de labels "Pokemons".
	 * <br><b>Pre</b><br> 
	 * Debe existir un arreglo de JLabel con nombre Pokemons.
	 * <br>
	 * <br><b>Pos</b><br>  
	 * Se ha retornado el arreglo de labels correctamente.
	 * <br>
	 */
	public JLabel[] getPokemons() {
		return Pokemons;
	}

	/** 
	 * Este método recibe un arreglo de Jlabel y modifica el arreglo de labels "Pokemons".
	 * <br><b>Pre</b><br> 
	 * Debe existir un arreglo de JLabel con nombre Pokemons.
	 * <br>
	 * <br><b>Pos</b><br>  
	 * Se ha modificado el arreglo de labels correctamente.
	 * <br>
	 */	
	public void setPokemons(JLabel[] pokemons) {
		Pokemons = pokemons;
	}	
	
	
}
