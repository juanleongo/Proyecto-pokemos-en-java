package modelo;
/**
 * Clase Volador
 *
 * Contiene información para la creación de un Pokemon tipo Volador
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
	 * Método que asigna las habilidades correspondientes a un pokemon tipo Volador
	 */
	@Override
	void habilidadAtaque() {
		String[] habilidades = new String[] {"LÃ¡tigo de aire","rÃ¡faga","torbellino","embestida"};
		
	}
	
}
