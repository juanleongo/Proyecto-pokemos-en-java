package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.StringBufferInputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.sql.rowset.serial.SQLInputImpl;
import javax.swing.JOptionPane;

import modelo.Pokemon;
import modelo.Roca;
import modelo.Volador;
import modelo.Agua;
import modelo.Electrico;
import modelo.Fuego;
import modelo.Planta;
import vista.PanelPrincipal;

public class Controller implements ActionListener {
	
	private PanelPrincipal Vista;
	private ArrayList<Pokemon> listaPokemons;
	private Fuego pokemonfuego;	
	private Agua pokemonagua;
	private Electrico pokemonelectro;
	private Planta pokemonplanta;
	private Roca pokemonroca;
	private Volador pokemonvolador;
	private String nombre;
	private String tipo;
	
	private String[] tipos= new String[6];
	
	public Controller() {
		listaPokemons = new ArrayList<Pokemon>();

		Vista = new PanelPrincipal();
		asignarOyentes();
		inicializar_tipos();
	}
	public void asignarOyentes() {
		Vista.getPsur().getPs1().getAgregar().addActionListener(this);
		Vista.getPsur().getPs1().getEliminar().addActionListener(this);
		Vista.getPsur().getPs1().getInfo().addActionListener(this);
		Vista.getPsur().getPs1().getModificar().addActionListener(this);
		Vista.getPsur().getCombatir().addActionListener(this);
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
	public String verLista() {
		String resp = "La lista tiene "+listaPokemons.size() +" personas agregadas \n---\n";

		for (int i = 0; i < listaPokemons.size(); i++) {
			resp += (i+1) +" - "+listaPokemons.get(i).toString()+" \n";
		}

		return resp;
	}

	
	public void agregarPokemon(String nombre , String tipo ) {
		boolean existe = existePokemon(nombre);


		if(!existe && listaPokemons.size()<15) {
				double vel =generador_de_numeros();
				double def =generador_de_numeros();
				double atq =generador_de_numeros();				
			 	double poder = calcular_poder(def, atq,vel);
			 	
			 	if(tipo.equals("Fuego")) {
			 		pokemonfuego = new Fuego(nombre, tipo,atq ,def,vel,poder);
					listaPokemons.add(pokemonfuego);
					JOptionPane.showMessageDialog(null, "El pokemon "+nombre+" fua añadido");
			 	}
			 	if(tipo.equals("Agua")) {
			 		pokemonagua= new Agua(nombre, tipo, atq, def, vel, poder);
			 		listaPokemons.add(pokemonagua);
			 		JOptionPane.showMessageDialog(null, "El pokemon "+nombre+" fua añadido");
			 	}
			 	
				if(tipo.equals("Electrico")) {
					pokemonelectro = new Electrico(nombre, tipo, atq, def, vel, poder);
					listaPokemons.add(pokemonelectro);
			 		JOptionPane.showMessageDialog(null, "El pokemon "+nombre+" fua añadido");					
				}
				if(tipo.equals("Volador")) {
					pokemonvolador = new Volador(nombre, tipo, atq, def, vel, poder);
					listaPokemons.add(pokemonvolador);
			 		JOptionPane.showMessageDialog(null, "El pokemon "+nombre+" fua añadido");					
				}
				if(tipo.equals("Planta")) {
					pokemonplanta = new Planta(nombre, tipo, atq, def, vel, poder);
					listaPokemons.add(pokemonplanta);
			 		JOptionPane.showMessageDialog(null, "El pokemon "+nombre+" fua añadido");					
				}
				if(tipo.equals("Roca")) {
					pokemonroca = new Roca(nombre, tipo, atq, def, vel, poder);
					listaPokemons.add(pokemonroca);
			 		JOptionPane.showMessageDialog(null, "El pokemon "+nombre+" fua añadido");					
				}			
				
		}			 
		
		else {
			JOptionPane.showMessageDialog(null, "El pokemon no fue añadido");
		}

	}
	
	 public  Pokemon buscarPokemon(String nombre) {
		 Pokemon encontrado = null;
	      for (int i=0;i<listaPokemons.size();i++) {
	            if (listaPokemons.get(i).getNombre().equals(nombre)){
	            	encontrado = listaPokemons.get(i);                   
	            }
	        }
		return encontrado;
	    }
	
	public double  calcular_poder(double def, double ataque,double vel) {
		double suma = def+ataque+vel;
		double poder = suma/3;
		double formateo =  Math.round(poder * 100) / 100d;
		return formateo;
	}

	public void inicializar_tipos() {		
		this.tipos[0]="Fuego";
		this.tipos[1]="Agua";
		this.tipos[2]="Volador";
		this.tipos[3]="Electrico";
		this.tipos[4]="Planta";
		this.tipos[5]="Roca";		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		if(comando.equals("Agregar")) {
			nombre= JOptionPane.showInputDialog("Introduzca el nombre del pokemon");
			
			tipo=(String) JOptionPane.showInputDialog(null,"Selecciona un tipo", "Elegir",JOptionPane.QUESTION_MESSAGE,null,tipos , tipos[0]);
			agregarPokemon(nombre,tipo);
			
		}
		if(comando.equals("Info")) {
			nombre= JOptionPane.showInputDialog("Introduzca el nombre del pokemon");
			if(existePokemon(nombre)) {
				JOptionPane.showMessageDialog(null,buscarPokemon(nombre));
				
			}else{
				JOptionPane.showMessageDialog(null,"NO SE ENCONTRO NINGUN POKEMON");
			}
			
		}
		
		if(comando.equals("Eliminar")) {
			nombre= JOptionPane.showInputDialog("Introduzca el nombre del pokemon que desea eliminar");
			boolean existe = existePokemon(nombre);
			if(existe) {
				for (int i = 0; i < listaPokemons.size(); i++) {
					if(listaPokemons.get(i).getNombre().equals(nombre)) {
						listaPokemons.remove(i);
						JOptionPane.showMessageDialog(null, "El pokemon "+nombre+" ha sido eliminado de su equipo.");
					}
				}
			}else {
				JOptionPane.showMessageDialog(null, "El pokemon "+nombre+" no existe en su equipo.");
				
			}
		}
		
		if(comando.equals("Modificar")) {
			nombre= JOptionPane.showInputDialog("Introduzca el nombre del pokemon que desea modificar");
			boolean existe = existePokemon(nombre);
			if(existe) {
				for (int i = 0; i < listaPokemons.size(); i++) {
					if(listaPokemons.get(i).getNombre().equals(nombre)) {
						listaPokemons.get(i).setNombre(JOptionPane.showInputDialog("Introduzca el nuevo nombre del pokemon:"));
						JOptionPane.showMessageDialog(null, "El pokemon ha sido modificado de su equipo.");
					}
				}
			}else {
				JOptionPane.showMessageDialog(null, "El pokemon "+nombre+" no existe en su equipo.");
				
			}
		}		
	}
}
