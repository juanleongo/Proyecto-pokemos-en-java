package modelo;
/**
 * Clase Agua
 *
 * Contiene informaci�n para la creaci�n de un Pokemon tipo Agua
 */
public class Agua extends Pokemon {
	/** 
	 * Crea una instancia de la clase Agua.
	 */
	public Agua(String nombre, String tipo, double ataque, double defensa, double velocidad, double poder) {
		super(nombre, tipo, ataque, defensa, velocidad, poder);
		
	}
	/** 
	 * Crea una instancia de la clase Agua.
	 */
	public Agua(String nombre, String tipo) {
		super(nombre, tipo);
		// TODO Auto-generated constructor stub
	}
	/** 
	 * M�todo que asigna las habilidades correspondientes a un pokemon tipo Agua
	 */
	@Override
	void habilidadAtaque() {
		String[] habilidades = new String[] {"Burbuja","Acua jet","hidrobomba","embestida"};
		
	}

}
