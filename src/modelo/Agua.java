package modelo;

public class Agua extends Pokemon {

	public Agua(String nombre, String tipo, double ataque, double defensa, double velocidad) {
		super(nombre, tipo, ataque, defensa, velocidad);
		
	}
	public Agua(String nombre, String tipo) {
		super(nombre, tipo);
		// TODO Auto-generated constructor stub
	}

	@Override
	void habilidadAtaque() {
		String[] habilidades = new String[] {"Burbuja","Acua jet","hidrobomba","embestida"};
		
	}

}
