package co.edu.udistrital.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import co.edu.udistrital.modelo.Pokemon;
import co.edu.udistrital.modelo.Fuego;
import co.edu.udistrital.modelo.Roca;
import co.edu.udistrital.modelo.Volador;
import co.edu.udistrital.modelo.Agua;
import co.edu.udistrital.modelo.Electrico;
import co.edu.udistrital.modelo.Planta;
import co.edu.udistrital.vista.PanelPrincipal;

/**
 * Clase Controller
 *
 * Contiene información para el funcionamiento del programa mediante la integración de la vista y los modelos.
 */
public class Controller implements ActionListener {
	/** 
	 * Representa una instancia de la Vista que es la interfaz grafica de usuario.                                        
	 */
	private PanelPrincipal Vista;
	/** 
	 * Representa un arreglo que contiene todos los pokemon agregados por el usuario.                                       
	 */
	private ArrayList<Pokemon> listaPokemons;
	/** 
	 * Representa un arreglo copia de  listaPokemons que contiene todos los pokemon agregados por el usuario,esta con el fin de poder realizar operaciones sin alterar el arreglo original.                                       
	 */
	private ArrayList<Pokemon> CopialistaPokemons; 
	/** 
	 * Representa un arreglo  que contiene todos los pokemon agregados por el usuario para un combate.                                       
	 */
	private ArrayList<Pokemon> listaCombateJugador;
	/** 
	 * Representa un arreglo  que contiene todos los pokemon agregados por la computadora para un combate.                                       
	 */
	private ArrayList<Pokemon> listaCombateMaquina;
	/** 
	 *Representa una instancia de la clase Fuego,es decir a un pokemon tipo Fuego.                                       
	 */
	private Fuego pokemonfuego;
	/** 
	 *Representa una instancia de la clase Agua,es decir a un pokemon tipo Agua.                                       
	 */
	private Agua pokemonagua;
	/** 
	 *Representa una instancia de la clase Electrico,es decir a un pokemon tipo Electrico.                                       
	 */
	private Electrico pokemonelectro;
	/** 
	 *Representa una instancia de la clase Planta,es decir a un pokemon tipo Planta.                                       
	 */
	private Planta pokemonplanta;
	/** 
	 *Representa una instancia de la clase Roca,es decir a un pokemon tipo Roca.                                       
	 */
	private Roca pokemonroca;
	/** 
	 *Representa una instancia de la clase Volador,es decir a un pokemon tipo Volador.                                       
	 */
	private Volador pokemonvolador;
	/** 
	 *Representa el nombre que el usuario asigna a un pokemon.                                       
	 */
	private String nombre;
	/** 
	 *Representa el tipo que el usuario asigna a un pokemon.                                       
	 */
	private String tipo;
	/** 
	 *Representa una variable auxiliar para el funcionamiento de métodos.                                       
	 */
	private int numero;
	/** 
	 *Representa un arreglo que contiene los 6 tipos de pokemon en cada una de sus posiciones.                                       
	 */
	private String[] tipos = new String[6];
	/** 
	 *Representa un arreglo que contiene los números del 1 al 5.                                       
	 */
	private String[] numeros = new String[5];
	/** 
	 * Crea una instancia de la clase Controller.
	 */
	public Controller() {
		listaPokemons = new ArrayList<Pokemon>();
		listaCombateJugador = new ArrayList<Pokemon>();
		listaCombateMaquina = new ArrayList<Pokemon>();
		Vista = new PanelPrincipal();
		asignarOyentes();
		inicializar_tipos();
	}
	/** 
	 * Este método asigna los listener(oyentes) a los botones de la interfaz grafica.
	 * <br><b>Pre</b><br> 
	 * Vista es una instancia de la clase PanelPrincipal<br> 
	 * Deben existir los botones Agregar,Eliminar,Info y Modificar dentro de la clase Ps1 y el boton combatir en la clase Psur.
	 * <br>
	 * <b>Pos</b><br>  
	 * Se han asignado Oyentes a todos los botones correctamente.
	 * <br>
	 */
	public void asignarOyentes() {
		Vista.getPsur().getPs1().getAgregar().addActionListener(this);
		Vista.getPsur().getPs1().getEliminar().addActionListener(this);
		Vista.getPsur().getPs1().getInfo().addActionListener(this);
		Vista.getPsur().getPs1().getModificar().addActionListener(this);
		Vista.getPsur().getCombatir().addActionListener(this);
	}
	/** 
	 * Este método genera un número aleatorio entre 10.00 y 89.99
	 * <br>
	 * <b>Pos</b><br>  
	 * Se han generado un número entre 10.00 y 89.99  correctamente.
	 * <br>
	 * @return Devuelve un double de valor aleatorio entre 10.00 y 89.99.
	 */
	public double generador_de_numeros() {
		double x = (int) (Math.random() * ((90 - 10) + 1)) + 10;
		return x;
	}
	/** 
	 * Este método comprueba si existe un pokemon especifico dentro del arreglo listaPokemons 
	 * <br><b>Pre</b><br> 
	 * listaPokemons está inicializada (no es null).
	 * <br>
	 * <b>Pos</b><br>  
	 * Retorna un boolean que indica si el pokemon existe o no dentro del arreglo listaPokemons
	 * <br>
	 * @param nombre  Es el nombre del pokemon el cual se quiere buscar si existe dentro del arreglo. nombre != null
	 * @return Devuelve un boolean según el resultado obtenido.
	 */
	public boolean existePokemon(String nombre) {
		boolean resp = false;

		for (int i = 0; i < listaPokemons.size(); i++) {
			if (listaPokemons.get(i).getNombre().equals(nombre)) {
				resp = true;
			}
		}

		return resp;
	}
	/** 
	 * Este método crea un pokemon según los datos ingresados que posteriormente es añadido al arreglo listaPokemons 
	 * <br><b>Pre</b><br> 
	 * Debe existir la clase Pokemon<br>
	 * listaPokemons es un ArrayList de Pokemon
	 * <br>
	 * <b>Pos</b><br>  
	 * Se ha creado y añadido el pokemon al arreglo listaPokemons según los datos dados
	 * <br>
	 * @param nombre  Es el nombre del pokemon que se desea crear y agregar al arreglo listaPokemons. nombre != null
	 * @param tipo	  Es el tipo del pokemon que se desea crear y agregar al arreglo listaPokemons. tipo != null
	 */
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
					Vista.getPizq().getPokemons()[i].setText("<html>" + nombre + "<br>Tipo: "+tipo+"</html>");
					return;
				}
			}
		}

		else {
			JOptionPane.showMessageDialog(null, "El pokemon no fue añadido");
		}

	}
	/** 
	 * Este método busca un pokemon especifico dentro del arreglo listaPokemons y lo retorna
	 * <br><b>Pre</b><br> 
	 * listaPokemons está inicializada (no es null).
	 * <br>
	 * <b>Pos</b><br>  
	 * Retorna una instancia de alguna clase hija de Pokemon o null según los resultados obtenidos
	 * <br>
	 * @param nombre  Es el nombre del pokemon del cual se quiere buscar dentro del arreglo. nombre != null
	 * @return Devuelve una instancia de un pokemon según el resultado obtenido
	 */
	public Pokemon buscarPokemon(String nombre) {
		Pokemon encontrado = null;
		for (int i = 0; i < listaPokemons.size(); i++) {
			if (listaPokemons.get(i).getNombre().equals(nombre)) {
				encontrado = listaPokemons.get(i);
			}
		}
		return encontrado;
	}
	/** 
	 * Este método elimina un pokemon del arreglo de pokemons ingresado y lo notifica al usuario
	 * <br><b>Pre</b><br> 
	 * a está inicializada (no es null).
	 * <br>
	 * <b>Pos</b><br>  
	 * Se ha eliminado el pokemon correctamente del arreglo ingresado.
	 * <br>
	 * @param existe  Representa si existe el pokemon dentro del arreglo listaPokemons. existe != null
	 * @param a Representa un arreglo de la clase Pokemon. a != null
	 */
	public void eliminarOriginal(boolean existe , ArrayList<Pokemon> a) {
		if (existe) {
			for (int i = 0; i < a.size(); i++) {
				if (a.get(i).getNombre().equals(nombre)) {
					for (int i1 = 0; i1 < 15; i1++) {
						if (Vista.getPizq().getPokemons()[i1].getText().equals("<html>" + nombre + "<br>Tipo: "+a.get(i).getTipo()+"</html>")) {
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
	/** 
	 * Este método elimina un pokemon del arreglo de pokemons ingresado 
	 * <br><b>Pre</b><br> 
	 * a está inicializada (no es null).
	 * <br>
	 * <b>Pos</b><br>  
	 * Se ha eliminado el pokemon correctamente del arreglo ingresado.
	 * <br>
	 * @param existe  Representa si existe el pokemon dentro del arreglo dado. existe != null
	 * @param a Representa un arreglo de la clase Pokemon. a != null
	 */	
	public void eliminarCopia(boolean existe , ArrayList<Pokemon> a) {
		if (existe) {
			for (int i = 0; i < a.size(); i++) {
				if (a.get(i).getNombre().equals(nombre)) {
					a.remove(i);
				}
			}
		}
	}
	/** 
	 * Este método determina el valor del atributo poder de un pokemon  
	 * <br><b>Pos</b><br>  
	 * Se ha calculado el poder de un pokemon corecctamente
	 * <br>
	 * @param def  Representa el valor de defensa de un pokemon . def != null
	 * @param ataque  Representa el valor de ataque de un pokemon . ataque != null
	 * @param vel  Representa el valor de velocidad de un pokemon . vel != null
	 * @return Double que es el valor del poder de un pokemon
	 */	
	public double calcular_poder(double def, double ataque, double vel) {
		double suma = def + ataque + vel;
		double poder = suma / 3;
		double formateo = Math.round(poder * 100) / 100d;
		return formateo;
	}
	/** 
	 * Este método incializa el arreglo tipos en cada una de sus posiciones
	 * <br><b>Pre</b><br> 
	 * El arreglo String tipos debe existir.
	 * <br>
	 * <b>Pos</b><br>  
	 * Se ha inicializado correctamente el arreglo tipos
	 * <br>
	 */	
	public void inicializar_tipos() {
		this.tipos[0] = "Fuego";
		this.tipos[1] = "Agua";
		this.tipos[2] = "Volador";
		this.tipos[3] = "Electrico";
		this.tipos[4] = "Planta";
		this.tipos[5] = "Roca";
	}
	/** 
	 * Este método incializa el arreglo numeros en cada una de sus posiciones
	 * <br><b>Pre</b><br> 
	 * El arreglo int numeros debe existir.
	 * <br>
	 * <b>Pos</b><br>  
	 * Se ha inicializado correctamente el arreglo numeros
	 * <br>
	 */	
	public void inicializar_numeros() {
		this.numeros[0] = "1";
		this.numeros[1] = "2";
		this.numeros[2] = "3";
		this.numeros[3] = "4";
		this.numeros[4] = "5";
	}
	/** 
	 * Este método elimina todos los elementos de los arreglos: listaCombateJugador,listaCombateMaquina y CopialistaPokemons
	 * <br><b>Pre</b><br> 
	 * Los arreglos listaCombateJugador,listaCombateMaquina y CopialistaPokemons deben existir.
	 * <br>
	 * <b>Pos</b><br>  
	 * Se han eliminado todos los elementos de los arreglos listaCombateJugador,listaCombateMaquina y CopialistaPokemons
	 * <br>
	 */	
	public void limpiar_listas() {
		this.listaCombateJugador.clear();
		this.listaCombateMaquina.clear();
		this.CopialistaPokemons.clear();
	}
	/** 
	 * Este método fija el texto de todos los elementos de los labels contenidos en los paneles centro y derecha como " "
	 * <br><b>Pre</b><br> 
	 * Vista debe ser una instancia de la clase PanelPrincipal
	 * <br>
	 * <b>Pos</b><br>  
	 * Se han fijado todos los elementos de los labels contenidos en los paneles centro y derecha como " "
	 * <br>
	 */	
	public void limpiar_paneles() {
		for (int i = 0; i < 5;i++){				
			Vista.getPder().getPokemons()[i].setText(" ");
			Vista.getPcentro().getPanelC1().getPokemons()[i].setText(" ");
		}
		Vista.getPcentro().getPanelC2().getPc2_1().getPokemon().setText(" ");
		Vista.getPcentro().getPanelC2().getPc2_2().getPokemon().setText(" ");
	}
	
	/** 
	 * Este método selecciona aleatoriamente los pokemons a combatir por parte de la computadora y los muestra en sus paneles correspondientes dentro de la interfaz grafica.
	 * <br><b>Pre</b><br> 
	 * El arreglo CopialistaPokemons debe estar inicializado (no es null)
	 * <br>
	 * <b>Pos</b><br>  
	 * Se han determinado correctamente los pokemons a combatir por parte de la computadora y su visualización en la interfaz grafica
	 * <br>
	 * @param numero Representa la cantidad de pokemons que tiene que escoger la computadora
	 */	
	public void seleccionarPokemonMaquina(int numero) {
		
		if (numero == 1) {
			int index = (int) (Math.random() * CopialistaPokemons.size());
			
			listaCombateMaquina.add(CopialistaPokemons.get(index));
			CopialistaPokemons.remove(index);
			Vista.getPder().getPokemons()[0].setText("<html>" + listaCombateMaquina.get(0).getNombre() + "<br>Tipo: "+listaCombateMaquina.get(0).getTipo()+"</html>");
		}
		if (numero == 2) {
			
			for (int i = 0; i < 2;i++) {				
				int index = (int) (Math.random() * CopialistaPokemons.size());
				listaCombateMaquina.add(CopialistaPokemons.get(index));
				CopialistaPokemons.remove(index);
				Vista.getPder().getPokemons()[i].setText("<html>" + listaCombateMaquina.get(i).getNombre() + "<br>Tipo: "+listaCombateMaquina.get(i).getTipo()+"</html>");
				}
		}
		if (numero == 3) {
			
			for (int i = 0; i < 3;i++) {				
				int index = (int) (Math.random() * CopialistaPokemons.size());
				listaCombateMaquina.add(CopialistaPokemons.get(index));
				CopialistaPokemons.remove(index);
				Vista.getPder().getPokemons()[i].setText("<html>" + listaCombateMaquina.get(i).getNombre() + "<br>Tipo: "+listaCombateMaquina.get(i).getTipo()+"</html>");
				}

		}
		if (numero == 4) {
			
			for (int i = 0; i < 4;i++) {				
				int index = (int) (Math.random() * CopialistaPokemons.size());
				listaCombateMaquina.add(CopialistaPokemons.get(index));
				CopialistaPokemons.remove(index);
				Vista.getPder().getPokemons()[i].setText("<html>" + listaCombateMaquina.get(i).getNombre() + "<br>Tipo: "+listaCombateMaquina.get(i).getTipo()+"</html>");
				}

		}
		if (numero == 5) {
			
			for (int i = 0; i < 5;i++) {				
				int index = (int) (Math.random() * CopialistaPokemons.size());
				listaCombateMaquina.add(CopialistaPokemons.get(index));
				CopialistaPokemons.remove(index);
				Vista.getPder().getPokemons()[i].setText("<html>" + listaCombateMaquina.get(i).getNombre() + "<br>Tipo: "+listaCombateMaquina.get(i).getTipo()+"</html>");
				}
		}
	}
	/** 
	 * Este método se encarga de realizar la funcionalidad de combate entre los pokemon del usuario y la computadora
	 * <br><b>Pre</b><br> 
	 * El arreglo listaCombateJugador debe estar inicializado (no es null)<br>
	 * El arreglo listaCombateMaquina debe estar inicializado (no es null)<br>
	 * Vista debe ser una instancia de la clase PanelPrincipal (no es null)
	 * <br>
	 * <b>Pos</b><br>  
	 * Se han enfretado todos los pokemon del usuario y la computadora.Además de informar al usuario el resultado del combate.
	 * <br>
	 * @throws Genera IndexOutOfBoundsException cuando se intenta acceder al indice 0 de el arreglo listaCombateJugador/listaCombateMaquina cuando estan vacios, es decir: listaCombateJugador/listaCombateMaquina == null
	 */	
	public void combatir_pokemon() {
		
			 try {
				 
				 while(listaCombateJugador.get(0)!=null && listaCombateMaquina.get(0)!=null) {
					 
						Vista.getPcentro().getPanelC2().getPc2_1().getPokemon().setText("<html>" + listaCombateJugador.get(0).getNombre() + "<br>Tipo: "+listaCombateJugador.get(0).getTipo()+"</html>");
						Vista.getPcentro().getPanelC2().getPc2_2().getPokemon().setText("<html>" + listaCombateMaquina.get(0).getNombre() + "<br>Tipo: "+listaCombateMaquina.get(0).getTipo()+"</html>");					
						JOptionPane.showMessageDialog(null,listaCombateJugador.get(0).getNombre()+" VS "+listaCombateMaquina.get(0).getNombre(), "Vs",JOptionPane.INFORMATION_MESSAGE); 
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
	/** 
	 * Este método se encarga de determinar el resultado entre el combate de los pokemons del usuario y la computadora
	 * <br>
	 * <b>Pos</b><br>  
	 * Se han determinado el resultado del combate exitosamente.
	 */	
	public void definir_ganador() {
		if(listaCombateMaquina.size()==0 && listaCombateJugador.size()!=0) {
			JOptionPane.showMessageDialog(null,"¡FELICITACIONES! TU HAS GANADO","Ganador",JOptionPane.INFORMATION_MESSAGE);
		}else if(listaCombateJugador.size()==0 && listaCombateMaquina.size()!=0) {
			JOptionPane.showMessageDialog(null,"COMPUTADOR TE HA GANADO","Ganador",JOptionPane.INFORMATION_MESSAGE); 
		}else if(listaCombateJugador.size()==0 && listaCombateMaquina.size()==0){
			JOptionPane.showMessageDialog(null,"¡HA HABIDO UN EMPATE!","Ganador",JOptionPane.INFORMATION_MESSAGE); 				
		}
	}
	/** 
	 * Este método se encarga de realizar la funcionalidades de los botones al ser oprimidos.
	 * <b>Pos</b><br>  
	 * Se han realizado todas las acciones de los botones (Agregar,Eliminar,Buscar,Modificar y Combatir) correctamente
	 */	
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
							if (Vista.getPizq().getPokemons()[i1].getText().equals("<html>" + nombre + "<br>Tipo: "+listaPokemons.get(i).getTipo()+"</html>" )) {
								nombre = JOptionPane.showInputDialog("Introduzca el nuevo nombre del pokemon:");
								listaPokemons.get(i).setNombre(nombre);
								Vista.getPizq().getPokemons()[i1].setText("<html>" + nombre + "<br>Tipo: "+listaPokemons.get(i).getTipo()+"</html>");
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
							Vista.getPcentro().getPanelC1().getPokemons()[0].setText("<html>" + listaCombateJugador.get(0).getNombre() + "<br>Tipo: "+listaCombateJugador.get(0).getTipo()+"</html>");
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
								Vista.getPcentro().getPanelC1().getPokemons()[i-1].setText("<html>" + listaCombateJugador.get(i-1).getNombre() + "<br>Tipo: "+listaCombateJugador.get(i-1).getTipo()+"</html>");
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
								Vista.getPcentro().getPanelC1().getPokemons()[i-1].setText("<html>" + listaCombateJugador.get(i-1).getNombre() + "<br>Tipo: "+listaCombateJugador.get(i-1).getTipo()+"</html>");
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
								Vista.getPcentro().getPanelC1().getPokemons()[i-1].setText("<html>" + listaCombateJugador.get(i-1).getNombre() + "<br>Tipo: "+listaCombateJugador.get(i-1).getTipo()+"</html>");
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
								Vista.getPcentro().getPanelC1().getPokemons()[i-1].setText("<html>" + listaCombateJugador.get(i-1).getNombre() + "<br>Tipo: "+listaCombateJugador.get(i-1).getTipo()+"</html>");
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