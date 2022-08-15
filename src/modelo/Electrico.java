package modelo;
/**
 * Clase Electrico
 *
 * Contiene informaci�n para la creaci�n de un Pokemon tipo Electrico
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
	 * M�todo que asigna las habilidades correspondientes a un pokemon tipo Electrico
	 */
	@Override
	void habilidadAtaque() {
		String[] habilidades = new String[] {"Impactrueno","Látigo","Onda Trueno","embestida"};
		
	}

}
