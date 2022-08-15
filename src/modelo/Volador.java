package modelo;
/**
 * Clase Volador
 *
 * Contiene informaci�n para la creaci�n de un Pokemon tipo Volador
 */
public class Volador extends Pokemon{
	/** 
	 * Crea una instancia de la clase Volador.
	 */
	public Volador(String nombre, String tipo, double ataque, double defensa, double velocidad,double poder) {
		super(nombre, tipo, ataque, defensa, velocidad,poder);
		// TODO Auto-generated constructor stub
	}
	/** 
	 * M�todo que asigna las habilidades correspondientes a un pokemon tipo Volador
	 */
	@Override
	void habilidadAtaque() {
		String[] habilidades = new String[] {"Látigo de aire","ráfaga","torbellino","embestida"};
		
	}
	
}
