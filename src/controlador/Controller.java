package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.sql.rowset.serial.SQLInputImpl;
import javax.swing.JOptionPane;

import modelo.Pokemon;
import modelo.Fuego;
import vista.PanelPrincipal;

public class Controller implements ActionListener {
	
	private PanelPrincipal Vista;
	private ArrayList<Pokemon> listaPokemons;
	private Fuego pokemon;
	
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


		if(!existe) {		
			 
				pokemon = new Fuego(nombre, tipo, generador_de_numeros(),generador_de_numeros(),generador_de_numeros());
				listaPokemons.add(pokemon);
				JOptionPane.showMessageDialog(null, "El pokemon "+nombre+"fua añadido");
		}
		else {
			JOptionPane.showMessageDialog(null, "El pokemon no fue añadido");
		}

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
			JOptionPane.showMessageDialog(null,verLista());
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
		
	}

}
