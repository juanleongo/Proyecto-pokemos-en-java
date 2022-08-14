package modelo;

public class Planta extends Pokemon{

	public Planta(String nombre, String tipo, double ataque, double defensa, double velocidad,double poder) {
		super(nombre, tipo, ataque, defensa, velocidad,poder);
		// TODO Auto-generated constructor stub
	}

	@Override
	void habilidadAtaque() {
		String[] habilidades = new String[] {"Hoja afilada","Tormenta floral","Latigazo","embestida"};
		
	}

}
