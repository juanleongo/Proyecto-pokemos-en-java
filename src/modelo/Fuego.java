package modelo;

public class Fuego extends Pokemon{
	
	

	public Fuego(String nombre, String tipo, double ataque, double defensa, double velocidad,double poder) {
		super(nombre, tipo, ataque, defensa, velocidad,poder);
		
	}

	public Fuego(String nombre, String tipo) {
		super(nombre, tipo);
		
	}

	@Override
	void habilidadAtaque() {
		 	String[] habilidades = new String[] {"Lazallamas","girofuego","bomba","embestida"};
	}

}
