package co.edu.udistrital.controlador; // Cada uno modifique el package según como este guardado

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.io.StringBufferInputStream;
import java.text.DecimalFormat;

import javax.sql.rowset.serial.SQLInputImpl;
import javax.swing.JOptionPane;

import co.edu.udistrital.modelo.Pokemon;
import co.edu.udistrital.modelo.Fuego;
import co.edu.udistrital.modelo.Roca;
import co.edu.udistrital.modelo.Volador;
import co.edu.udistrital.modelo.Agua;
import co.edu.udistrital.modelo.Electrico;
import co.edu.udistrital.modelo.Planta;
import co.edu.udistrital.vista.PanelPrincipal;

public class Controller implements ActionListener {

	private PanelPrincipal Vista;
	private ArrayList<Pokemon> listaPokemons;
	private ArrayList<Pokemon> CopialistaPokemons; // nuevo 
	private ArrayList<Pokemon> listaCombateJugador;
	private ArrayList<Pokemon> listaCombateMaquina;
	private Fuego pokemonfuego;
	private Agua pokemonagua;
	private Electrico pokemonelectro;
	private Planta pokemonplanta;
	private Roca pokemonroca;
	private Volador pokemonvolador;
	private String nombre;
	private String tipo;
	private int numero;

	private String[] tipos = new String[6];
	private String[] numeros = new String[5];

	public Controller() {
		listaPokemons = new ArrayList<Pokemon>();
		listaCombateJugador = new ArrayList<Pokemon>();
		listaCombateMaquina = new ArrayList<Pokemon>();
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

	public double generador_de_numeros() {
		double x = (int) (Math.random() * ((90 - 10) + 1)) + 10;
		return x;
	}

	public boolean existePokemon(String nombre) {
		boolean resp = false;

		for (int i = 0; i < listaPokemons.size(); i++) {
			if (listaPokemons.get(i).getNombre().equals(nombre)) {
				resp = true;
			}
		}

		return resp;
	}

	public String verLista(ArrayList<Pokemon> lista) {
		String resp = "La lista tiene " + lista.size() + " personas agregadas \n---\n";

		for (int i = 0; i < lista.size(); i++) {
			resp += (i + 1) + " - " + lista.get(i).toString() + " \n";
		}

		return resp;
	}

	public void agregarPokemon(String nombre, String tipo) {
		boolean existe = existePokemon(nombre);

		if (!existe && listaPokemons.size() < 15) {
			double vel = generador_de_numeros();
			double def = generador_de_numeros();
			double atq = generador_de_numeros();
			double poder = calcular_poder(def, atq, vel);
			
			
			if (tipo.equals("Fuego")) {
				pokemonfuego = new Fuego(nombre, tipo, atq, def, vel, poder);
				listaPokemons.add(pokemonfuego);
				JOptionPane.showMessageDialog(null, "El pokemon " + nombre + " fue añadido");
			}
			if (tipo.equals("Agua")) {
				pokemonagua = new Agua(nombre, tipo, atq, def, vel, poder);
				listaPokemons.add(pokemonagua);
				JOptionPane.showMessageDialog(null, "El pokemon " + nombre + " fue añadido");
			}

			if (tipo.equals("Electrico")) {
				pokemonelectro = new Electrico(nombre, tipo, atq, def, vel, poder);
				listaPokemons.add(pokemonelectro);
				JOptionPane.showMessageDialog(null, "El pokemon " + nombre + " fue añadido");
			}
			if (tipo.equals("Volador")) {
				pokemonvolador = new Volador(nombre, tipo, atq, def, vel, poder);
				listaPokemons.add(pokemonvolador);
				JOptionPane.showMessageDialog(null, "El pokemon " + nombre + " fue añadido");
			}
			if (tipo.equals("Planta")) {
				pokemonplanta = new Planta(nombre, tipo, atq, def, vel, poder);
				listaPokemons.add(pokemonplanta);
				JOptionPane.showMessageDialog(null, "El pokemon " + nombre + " fue añadido");
			}
			if (tipo.equals("Roca")) {
				pokemonroca = new Roca(nombre, tipo, atq, def, vel, poder);
				listaPokemons.add(pokemonroca);
				JOptionPane.showMessageDialog(null, "El pokemon " + nombre + " fue añadido");
			}
			for (int i = 0; i < 15; i++) {
				if (Vista.getPizq().getPokemons()[i].getText().equals(" ")) {
					Vista.getPizq().getPokemons()[i].setText(nombre + "-" + tipo);
					return;
				}
			}
		}

		else {
			JOptionPane.showMessageDialog(null, "El pokemon no fue añadido");
		}

	}

	public Pokemon buscarPokemon(String nombre) {
		Pokemon encontrado = null;
		for (int i = 0; i < listaPokemons.size(); i++) {
			if (listaPokemons.get(i).getNombre().equals(nombre)) {
				encontrado = listaPokemons.get(i);
			}
		}
		return encontrado;
	}

	public void eliminarOriginal(boolean existe , ArrayList<Pokemon> a) {
		if (existe) {
			for (int i = 0; i < a.size(); i++) {
				if (a.get(i).getNombre().equals(nombre)) {
					for (int i1 = 0; i1 < 15; i1++) {
						if (Vista.getPizq().getPokemons()[i1].getText()
								.equals(nombre + "-" + a.get(i).getTipo())) {
							Vista.getPizq().getPokemons()[i1].setText(" ");
						}
					}
					a.remove(i);
					JOptionPane.showMessageDialog(null, "El pokemon " + nombre + " ha sido eliminado de su equipo.");
				}
			}
		} else {
			JOptionPane.showMessageDialog(null, "El pokemon " + nombre + " no existe en su equipo.");
		}

	}
	
	public void eliminarCopia(boolean existe , ArrayList<Pokemon> a) {
		if (existe) {
			for (int i = 0; i < a.size(); i++) {
				if (a.get(i).getNombre().equals(nombre)) {
					a.remove(i);
				}
			}
		}
	}

	public double calcular_poder(double def, double ataque, double vel) {
		double suma = def + ataque + vel;
		double poder = suma / 3;
		double formateo = Math.round(poder * 100) / 100d;
		return formateo;
	}

	public void inicializar_tipos() {
		this.tipos[0] = "Fuego";
		this.tipos[1] = "Agua";
		this.tipos[2] = "Volador";
		this.tipos[3] = "Electrico";
		this.tipos[4] = "Planta";
		this.tipos[5] = "Roca";
	}
	public void inicializar_numeros() {
		this.numeros[0] = "1";
		this.numeros[1] = "2";
		this.numeros[2] = "3";
		this.numeros[3] = "4";
		this.numeros[4] = "5";
	}
	
	public void limpiar_listas() {
		this.listaCombateJugador.clear();
		this.listaCombateMaquina.clear();
		this.CopialistaPokemons.clear();
	}
	
	public void limpiar_paneles() {
		for (int i = 0; i < 5;i++){				
			Vista.getPder().getPokemons()[i].setText(" ");
			Vista.getPcentro().getPanelC1().getPokemons()[i].setText(" ");
		}
		Vista.getPcentro().getPanelC2().getPc2_1().getPokemon().setText(" ");
		Vista.getPcentro().getPanelC2().getPc2_2().getPokemon().setText(" ");
	}
	

	public void seleccionarPokemonMaquina(int numero) {
		
		if (numero == 1) {
			int index = (int) (Math.random() * CopialistaPokemons.size());
			
			listaCombateMaquina.add(CopialistaPokemons.get(index));
			CopialistaPokemons.remove(index);
			Vista.getPder().getPokemons()[0].setText(listaCombateMaquina.get(0).getNombre()+"-"+listaCombateMaquina.get(0).getTipo());
		}
		if (numero == 2) {
			
			for (int i = 0; i < 2;i++) {				
				int index = (int) (Math.random() * CopialistaPokemons.size());
				listaCombateMaquina.add(CopialistaPokemons.get(index));
				CopialistaPokemons.remove(index);
				Vista.getPder().getPokemons()[i].setText(listaCombateMaquina.get(i).getNombre()+"-"+listaCombateMaquina.get(i).getTipo());
			}
		}
		if (numero == 3) {
			
			for (int i = 0; i < 3;i++) {				
				int index = (int) (Math.random() * CopialistaPokemons.size());
				listaCombateMaquina.add(CopialistaPokemons.get(index));
				CopialistaPokemons.remove(index);
				Vista.getPder().getPokemons()[i].setText(listaCombateMaquina.get(i).getNombre()+"-"+listaCombateMaquina.get(i).getTipo());
			}

		}
		if (numero == 4) {
			
			for (int i = 0; i < 4;i++) {				
				int index = (int) (Math.random() * CopialistaPokemons.size());
				listaCombateMaquina.add(CopialistaPokemons.get(index));
				CopialistaPokemons.remove(index);
				Vista.getPder().getPokemons()[i].setText(listaCombateMaquina.get(i).getNombre()+"-"+listaCombateMaquina.get(i).getTipo());
			}

		}
		if (numero == 5) {
			
			for (int i = 0; i < 5;i++) {				
				int index = (int) (Math.random() * CopialistaPokemons.size());
				listaCombateMaquina.add(CopialistaPokemons.get(index));
				CopialistaPokemons.remove(index);
				Vista.getPder().getPokemons()[i].setText(listaCombateMaquina.get(i).getNombre()+"-"+listaCombateMaquina.get(i).getTipo());
			}

		}
	}
	
	public void combatir_pokemon() {
		
			 try {
				 
				 while(listaCombateJugador.get(0)!=null && listaCombateMaquina.get(0)!=null) {
						Vista.getPcentro().getPanelC2().getPc2_1().getPokemon().setText(listaCombateJugador.get(0).getNombre()+" "+listaCombateJugador.get(0).getTipo());
						Vista.getPcentro().getPanelC2().getPc2_2().getPokemon().setText(listaCombateMaquina.get(0).getNombre()+" "+listaCombateMaquina.get(0).getTipo());					
		
						if(listaCombateJugador.get(0).getPoder()>listaCombateMaquina.get(0).getPoder()) {				
								JOptionPane.showMessageDialog(null,listaCombateJugador.get(0).getNombre()+" con un poder de "+listaCombateJugador.get(0).getPoder()+" ha ganado a "+listaCombateMaquina.get(0).getNombre()+" con un poder de "+listaCombateMaquina.get(0).getPoder(),"Ganador",JOptionPane.INFORMATION_MESSAGE); 
								listaCombateMaquina.remove(0);
								
						}else if(listaCombateJugador.get(0).getPoder()<listaCombateMaquina.get(0).getPoder()){				
								JOptionPane.showMessageDialog(null,listaCombateMaquina.get(0).getNombre()+" con un poder de "+listaCombateMaquina.get(0).getPoder()+" ha ganado a "+listaCombateJugador.get(0).getNombre()+" con un poder de "+listaCombateJugador.get(0).getPoder(),"Ganador",JOptionPane.INFORMATION_MESSAGE); 
								listaCombateJugador.remove(0);
								
						}else if(listaCombateJugador.get(0).getPoder()==listaCombateMaquina.get(0).getPoder()) {
								JOptionPane.showMessageDialog(null,listaCombateMaquina.get(0).getNombre()+" con un poder de "+listaCombateMaquina.get(0).getPoder()+" ha empatado contra "+listaCombateJugador.get(0).getNombre()+" con un poder de "+listaCombateJugador.get(0).getPoder(),"Ganador",JOptionPane.INFORMATION_MESSAGE); 
								listaCombateMaquina.remove(0);
								listaCombateJugador.remove(0);
							}		
					}
		      } catch(IndexOutOfBoundsException e) {
		    	  definir_ganador();
		    	  JOptionPane.showMessageDialog(null,"El combate ha finalizado","Resultados",JOptionPane.INFORMATION_MESSAGE); 		    	  
		      }
		}
	
	public void definir_ganador() {
		if(listaCombateMaquina.size()==0 && listaCombateJugador.size()!=0) {
			JOptionPane.showMessageDialog(null,"¡FELICITACIONES! TU HAS GANADO","Ganador",JOptionPane.INFORMATION_MESSAGE);
		}else if(listaCombateJugador.size()==0 && listaCombateMaquina.size()!=0) {
			JOptionPane.showMessageDialog(null,"COMPUTADOR TE HA GANADO","Ganador",JOptionPane.INFORMATION_MESSAGE); 
		}else if(listaCombateJugador.size()==0 && listaCombateMaquina.size()==0){
			JOptionPane.showMessageDialog(null,"¡HA HABIDO UN EMPATE!","Ganador",JOptionPane.INFORMATION_MESSAGE); 				
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		
		if (comando.equals("Agregar")) {
			nombre = JOptionPane.showInputDialog("Introduzca el nombre del pokemon");
			while(nombre.length()<8 || nombre.length()>16) {
				JOptionPane.showMessageDialog(null,"Recuerde que el nombre del pokemon debe tener entre 8 y 16 caracteres","Advertencia",JOptionPane.WARNING_MESSAGE);
				nombre = JOptionPane.showInputDialog("Introduzca el nombre del pokemon");
			}
			tipo = (String) JOptionPane.showInputDialog(null, "Selecciona un tipo", "Elegir",
					JOptionPane.QUESTION_MESSAGE, null, tipos, tipos[0]);
			agregarPokemon(nombre, tipo);
		}
		
		if (comando.equals("Info")) {
			nombre = JOptionPane.showInputDialog("Introduzca el nombre del pokemon");
			if (existePokemon(nombre)) {
				JOptionPane.showMessageDialog(null, buscarPokemon(nombre));

			} else {
				JOptionPane.showMessageDialog(null, "NO SE ENCONTRO NINGUN POKEMON");
			}

		}

		if (comando.equals("Eliminar")) {
			nombre = JOptionPane.showInputDialog("Introduzca el nombre del pokemon que desea eliminar");
			boolean existe = existePokemon(nombre);
			eliminarOriginal(existe,listaPokemons); 			
		}

		if (comando.equals("Modificar")) {
			nombre = JOptionPane.showInputDialog("Introduzca el nombre del pokemon que desea modificar");
			boolean existe = existePokemon(nombre);
			if (existe) {
				for (int i = 0; i < listaPokemons.size(); i++) {
					if (listaPokemons.get(i).getNombre().equals(nombre)) {
						for (int i1 = 0; i1 < 15; i1++) {
							if (Vista.getPizq().getPokemons()[i1].getText()
									.equals(nombre + "-" + listaPokemons.get(i).getTipo())) {
								nombre = JOptionPane.showInputDialog("Introduzca el nuevo nombre del pokemon:");
								listaPokemons.get(i).setNombre(nombre);
								Vista.getPizq().getPokemons()[i1]
										.setText(nombre + "-" + listaPokemons.get(i).getTipo());
								JOptionPane.showMessageDialog(null, "El pokemon ha sido modificado de su equipo.");
							}
						}
					}
				}
			} else {
				JOptionPane.showMessageDialog(null, "El pokemon " + nombre + " no existe en su equipo.");

			}
		}

		if (comando.equals("Combatir")) {
			
			inicializar_numeros();
			limpiar_paneles();
			CopialistaPokemons = new ArrayList<Pokemon>(listaPokemons);
			String pelea = (String) JOptionPane.showInputDialog(null, "Selecciona numero de pokemones para combatir(MAX 5)", "Elegir",
					JOptionPane.QUESTION_MESSAGE, null,numeros, numeros[0]);
			numero = Integer.parseInt(pelea);
			
			if (numero > 0 && numero <= 5) {
				if(listaPokemons.size()<(numero*2)) {
					JOptionPane.showMessageDialog(null,"Recuerde que debe tener solo puede hacer combates equitativos, es decir: 1vs1,2vs2,3vs3,4vs4,5vs5 \n Asegurese de tener la cantidad suficiente de pokemon para realizar el combate.","Advertencia",JOptionPane.WARNING_MESSAGE);	
				}else {
					if (numero == 1) {
						nombre = JOptionPane.showInputDialog("Introduzca el nombre del pokemon para combatir");
						boolean existe = existePokemon(nombre);
						if (existe) {
							listaCombateJugador.add(buscarPokemon(nombre));
							Vista.getPcentro().getPanelC1().getPokemons()[0].setText(listaCombateJugador.get(0).getNombre()+" "+listaCombateJugador.get(0).getTipo());
							eliminarCopia(existe,CopialistaPokemons);
							JOptionPane.showMessageDialog(null, "pokemon añadido a la lista de combate");
						} else {
							JOptionPane.showMessageDialog(null, "el pokemon no existe");
							}
						seleccionarPokemonMaquina(numero);
						combatir_pokemon();
						limpiar_listas();
					}
					if (numero == 2) {
						for (int i = 0; i < 2;) {
							nombre = JOptionPane.showInputDialog("Introduzca el nombre del pokemon para combatir");
							boolean existe = existePokemon(nombre);
							if (existe) {
								i++;
								listaCombateJugador.add(buscarPokemon(nombre));
								Vista.getPcentro().getPanelC1().getPokemons()[i-1].setText(listaCombateJugador.get(i-1).getNombre()+" "+listaCombateJugador.get(i-1).getTipo());
								eliminarCopia(existe,CopialistaPokemons);
								JOptionPane.showMessageDialog(null, "pokemon añadido a la lista de combate");
							} else {
								JOptionPane.showMessageDialog(null, "el pokemon no existe");
							}

						}
						seleccionarPokemonMaquina(numero);
						combatir_pokemon();
						limpiar_listas();
					}
					if (numero == 3) {
						for (int i = 0; i < 3;) {
							nombre = JOptionPane.showInputDialog("Introduzca el nombre del pokemon para combatir");
							boolean existe = existePokemon(nombre);
							if (existe) {
								i++;
								listaCombateJugador.add(buscarPokemon(nombre));
								Vista.getPcentro().getPanelC1().getPokemons()[i-1].setText(listaCombateJugador.get(i-1).getNombre()+" "+listaCombateJugador.get(i-1).getTipo());
								eliminarCopia(existe,CopialistaPokemons);
								JOptionPane.showMessageDialog(null, "pokemon añadido a la lista de combate");
							} else {
								JOptionPane.showMessageDialog(null, "el pokemon no existe");
								}
							}
						seleccionarPokemonMaquina(numero);
						combatir_pokemon();
						limpiar_listas();
						}
					if (numero == 4) {
						for (int i = 0; i < 4;) {
							nombre = JOptionPane.showInputDialog("Introduzca el nombre del pokemon para combatir");
							boolean existe = existePokemon(nombre);
							if (existe) {
								i++;
								listaCombateJugador.add(buscarPokemon(nombre));
								Vista.getPcentro().getPanelC1().getPokemons()[i-1].setText(listaCombateJugador.get(i-1).getNombre()+" "+listaCombateJugador.get(i-1).getTipo());
								eliminarCopia(existe,CopialistaPokemons);
								JOptionPane.showMessageDialog(null, "pokemon añadido a la lista de combate");
							} else {
								JOptionPane.showMessageDialog(null, "el pokemon no existe");
								}

							}
						seleccionarPokemonMaquina(numero);
						combatir_pokemon();
						limpiar_listas();
						}
					if (numero == 5) {
						for (int i = 0; i < 5;) {
							nombre = JOptionPane.showInputDialog("Introduzca el nombre del pokemon para combatir");
							boolean existe = existePokemon(nombre);
							if (existe) {
								i++;
								listaCombateJugador.add(buscarPokemon(nombre));
								Vista.getPcentro().getPanelC1().getPokemons()[i-1].setText(listaCombateJugador.get(i-1).getNombre()+" "+listaCombateJugador.get(i-1).getTipo());
								eliminarCopia(existe,CopialistaPokemons);
								JOptionPane.showMessageDialog(null, "pokemon añadido a la lista de combate");
							} else {
								JOptionPane.showMessageDialog(null, "el pokemon no existe");
								}

							}
						seleccionarPokemonMaquina(numero);
						combatir_pokemon();
						limpiar_listas();					
						}
				}
			}
		}
	}
}
