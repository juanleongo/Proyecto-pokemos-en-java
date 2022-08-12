package co.edu.udistrital.vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Clase Panelizquierdo
 *
 * Contiene informaci�n para la creaci�n del Panel ubicado en el oeste del JFrame PanelPrincipal,donde apareceran los pokemon a�adidos por el usuario.
 */
public class Panelizquierdo extends JPanel{

	/** 
	 * Representa los labels en los que apareceran los pokemon que ha creado el usuario.                                        
	 */	
	private JLabel [] Pokemons = new JLabel [15]; 
	
	/** 
	 * M�todo constructor que crea una instancia de la clase PanelIzquierdo. 
	 * <br><b>Pos</b><br>  
	 * Se han creado una instancia de la clase PanelIzquierdo.
	 * <br>                                          
	 */	
	public Panelizquierdo() {
		setLayout(new GridLayout(15,1));
		inicializarComp();
		setVisible(true);
	}
	
	/** 
	 * Este m�todo llama al m�todo "inicializarNomPokemons" y a�ade cada posici�n del arreglo al JPanel.
	 * <br><b>Pre</b><br> 
	 * El layout del JPanel debe ser un GridLayout(15,1)
	 * <br>
	 * <b>Pos</b><br>  
	 * Se han a�adido correctamente cada posici�n del arreglo "Pokemons" al JPanel.
	 * <br>
	 */	
	public void inicializarComp() {
		inicializarNomPokemons();
		for(int i=0; i<15; i++) {
			add(Pokemons[i]);
		}
	}

	/** 
	 * Este m�todo inicializa cada posici�n de el arreglo de JLabels "Pokemons".
	 * <br><b>Pre</b><br> 
	 * Debe existir un arreglo de JLabel [15] con nombre Pokemons.
	 * <br>
	 * <b>Pos</b><br>  
	 * Se ha inicializado correctamente cada posici�n del arreglo de JLabels "Pokemons".
	 * <br>
	 */
	public void inicializarNomPokemons() {
		for(int i=0; i<15; i++) {
			this.Pokemons[i]=new JLabel (String.valueOf(i+1));
		}
	}
	
	/** 
	 * Este m�todo devuelve el arreglo de labels "Pokemons".
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
	 * Este m�todo recibe un arreglo de Jlabel y modifica el arreglo de labels "Pokemons".
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

