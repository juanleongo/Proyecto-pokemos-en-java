package modelo;
/**
 * Clase Roca
 *
 * Contiene información para la creación de un Pokemon tipo Roca
 */
public class Roca extends Pokemon{
	/** 
	 * Crea una instancia de la clase Roca.
	 */
	public Roca(String nombre, String tipo, double ataque, double defensa, double velocidad,double poder) {
		super(nombre, tipo, ataque, defensa, velocidad,poder);
		// TODO Auto-generated constructor stub
	}
	/** 
	 * Método que asigna las habilidades correspondientes a un pokemon tipo Roca
	 */
	@Override
	void habilidadAtaque() {
		String[] habilidades = new String[] {"Lanzarroca","placaje","terremoto","embestida"};
		
	}

}
