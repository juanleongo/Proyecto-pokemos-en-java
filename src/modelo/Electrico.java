package modelo;
/**
 * Clase Electrico
 *
 * Contiene información para la creación de un Pokemon tipo Electrico
 */
public class Electrico  extends Pokemon{
	/** 
	 * Crea una instancia de la clase Electrico.
	 */
	public Electrico(String nombre, String tipo, double ataque, double defensa, double velocidad,double poder) {
		super(nombre, tipo, ataque, defensa, velocidad, poder);
		// TODO Auto-generated constructor stub
	}
	/** 
	 * Método que asigna las habilidades correspondientes a un pokemon tipo Electrico
	 */
	@Override
	void habilidadAtaque() {
		String[] habilidades = new String[] {"Impactrueno","LÃ¡tigo","Onda Trueno","embestida"};
		
	}

}
