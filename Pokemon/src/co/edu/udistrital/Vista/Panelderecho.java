package co.edu.udistrital.Vista;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panelderecho extends JPanel{

	private JLabel [] Pokemons = new JLabel [5]; 
	
	public Panelderecho() {
		setLayout(new GridLayout(5,1));
		
		inicializarComp();
		setVisible(true);
	}
	
	public void inicializarComp() {
		inicializarNomPokemons();
		for(int i=0; i<5; i++) {
			add(Pokemons[i]);
		}
	}

	//
	public void inicializarNomPokemons() {
		for(int i=0; i<5; i++) {
			this.Pokemons[i]=new JLabel (String.valueOf(i+1));
		}
	}
}
