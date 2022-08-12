package vista;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * Clase Panelderecho
 *
 * Contiene informaci�n para la creaci�n del Panel ubicado en el este del JFrame PanelPrincipal,donde apareceran los pokemon elegidos por la computadora para el combate.
 */
public class Panelderecho extends JPanel{
	/** 
	 * Representa los labels en los que apareceran los pokemon que ha escogido la computadora.                                        
	 */
	private JLabel [] Pokemons = new JLabel [5]; 
	
	/** 
	 * M�todo constructor que crea una instancia de la clase PanelDerecho.
	 */
	public Panelderecho() {
		setLayout(new GridLayout(5,1));
		inicializarComp();
		setVisible(true);
	}
	
	/** 
	 * Este m�todo llama al m�todo "inicializarNomPokemons" y a�ade cada posici�n del arreglo al JPanel.
	 * <br><b>Pre</b><br> 
	 * El layout del JPanel debe ser un GridLayout(5,1)
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
	 * Este m�todo inicializa cada posici�n de el arreglo de JLabels "Pokemons".
	 * <br><b>Pre</b><br> 
	 * Debe existir un arreglo de JLabel con tama�o=5 y con nombre Pokemons.
	 * <br>
	 * <b>Pos</b><br>  
	 * Cada posici�n del arreglo ha sido inicializado correctamente.
	 * <br>
	 */
	public void inicializarNomPokemons() {
		for(int i=0; i<5; i++) {
			this.Pokemons[i]=new JLabel (String.valueOf(i+1));
		}
	}
}
