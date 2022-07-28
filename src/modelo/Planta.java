package modelo;

public class Planta extends Pokemon{

	public Planta(String nombre, String tipo, double ataque, double defensa, double velocidad) {
		super(nombre, tipo, ataque, defensa, velocidad);
		// TODO Auto-generated constructor stub
	}

	@Override
	void habilidadAtaque() {
		String[] habilidades = new String[] {"Hoja afilada","Tormenta floral","Latigazo","embestida"};
		
	}

}
