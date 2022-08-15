package modelo;
/**
 * Clase Planta
 *
 * Contiene información para la creación de un Pokemon tipo Planta
 */
public class Planta extends Pokemon{
	/** 
	 * Crea una instancia de la clase Planta.
	 */
	public Planta(String nombre, String tipo, double ataque, double defensa, double velocidad,double poder) {
		super(nombre, tipo, ataque, defensa, velocidad,poder);
		// TODO Auto-generated constructor stub
	}
	/** 
	 * Método que asigna las habilidades correspondientes a un pokemon tipo Planta
	 */
	@Override
	void habilidadAtaque() {
		String[] habilidades = new String[] {"Hoja afilada","Tormenta floral","Latigazo","embestida"};
		
	}

}
