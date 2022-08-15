package modelo;
/**
 * Clase Fuego
 *
 * Contiene información para la creación de un Pokemon tipo Fuego
 */
public class Fuego extends Pokemon{
	
	
	/** 
	 * Crea una instancia de la clase Fuego.
	 */
	public Fuego(String nombre, String tipo, double ataque, double defensa, double velocidad,double poder) {
		super(nombre, tipo, ataque, defensa, velocidad,poder);
		
	}
	/** 
	 * Crea una instancia de la clase Fuego.
	 */
	public Fuego(String nombre, String tipo) {
		super(nombre, tipo);
		
	}
	/** 
	 * Método que asigna las habilidades correspondientes a un pokemon tipo Fuego
	 */
	@Override
	void habilidadAtaque() {
		 	String[] habilidades = new String[] {"Lazallamas","girofuego","bomba","embestida"};
	}

}
