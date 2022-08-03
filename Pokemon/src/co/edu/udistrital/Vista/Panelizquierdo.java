package co.edu.udistrital.Vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panelizquierdo extends JPanel{
	
	private JLabel [] Pokemons = new JLabel [15]; 
	
	public Panelizquierdo() {
		setLayout(new GridLayout(15,1));
		
		inicializarComp();
		setVisible(true);
	}
	
	public void inicializarComp() {
		inicializarNomPokemons();
		for(int i=0; i<15; i++) {
			add(Pokemons[i]);
		}
	}

	//
	public void inicializarNomPokemons() {
		for(int i=0; i<15; i++) {
			this.Pokemons[i]=new JLabel (String.valueOf(i+1));
		}
	}
	
	
}

