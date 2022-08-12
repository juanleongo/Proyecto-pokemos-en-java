package vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * Clase PanelSur
 *
 * Contiene informaci�n para la creaci�n del Panel ubicado en el sur del JFrame PanelPrincipal,que contendra los botones con las diferentes acciones que puede seleccionar el usuario.
 */
public class PanelSur extends JPanel{
	private PanelS1 ps1;
	private JButton Combatir;
	/** 
	 * Método constructor que crea una instancia de la clase PanelSur.
	 * <br><b>Pos</b><br>  
	 * Se han creado una instancia de la clase PanelSur.
	 * <br>                                           
	 */	
	public PanelSur() {
		setLayout(new GridLayout(1,2));
		inicializarComp();
		setVisible(true);
	}
	
	
	/** 
	 * Este método incializa todos los objetos que posteriormente seran agregados al JPanel.
	 * <br><b>Pre</b><br> 
	 * El layout del JPanel debe ser un GridLayout(1,2) y debe existir la clase PanelS1.
	 * <br>
	 * <b>Pos</b><br>  
	 * Se han creado y añadido una instancia de la clase PanelS1 y JButton, al JPanel correctamente.
	 * <br>
	 */	
	public void inicializarComp() {
		ps1 = new PanelS1();
		add(ps1);
		Combatir = new JButton ("Combatir");
		add(Combatir);
		Combatir.setActionCommand("Combatir");
	}


	public PanelS1 getPs1() {
		return ps1;
	}


	public void setPs1(PanelS1 ps1) {
		this.ps1 = ps1;
	}


	public JButton getCombatir() {
		return Combatir;
	}


	public void setCombatir(JButton combatir) {
		Combatir = combatir;
	}
}