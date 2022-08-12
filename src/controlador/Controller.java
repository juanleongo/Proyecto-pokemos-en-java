package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.Pokemon;
import modelo.Fuego;
import vista.PanelPrincipal;

public class Controller implements ActionListener {
	
	private PanelPrincipal ventanaPrincipal;
	private ArrayList<Pokemon> listaPokemons;
	private Fuego pokemon;
	
	public Controller() {
		listaPokemons = new ArrayList<Pokemon>();

		ventanaPrincipal = new PanelPrincipal();
		//asignarOyentes();
	}
	
	public double generador_de_numeros(){
		 double x = (int)(Math.random()*((90-10)+1))+10;
		    return x;
	}
	
	public boolean existePokemon(String nombre) {
		boolean resp = false;

		for (int i = 0; i < listaPokemons.size(); i++) {
			if(listaPokemons.get(i).getNombre().equals(nombre)) {
				resp = true;
			}
		}

		return resp;
	}

	
	public void agregarPokemon(String nombre , String tipo ) {
		boolean existe = existePokemon(nombre);


		if(!existe) {		
			 
				pokemon = new Fuego(nombre, tipo, generador_de_numeros(),generador_de_numeros(),generador_de_numeros());
				listaPokemons.add(pokemon);
				JOptionPane.showMessageDialog(null, "El pokemon "+nombre+"fua añadido");
		}
		else {
			JOptionPane.showMessageDialog(null, "El pokemon no fue añadido");
		}

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		if(comando.equals("Agregar")) {
			JOptionPane.showMessageDialog(null, "El pokemon no fue añadido"); 
			
		}
		
	}

}
