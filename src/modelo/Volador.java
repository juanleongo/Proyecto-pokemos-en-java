package modelo;

public class Volador extends Pokemon{

	public Volador(String nombre, String tipo, double ataque, double defensa, double velocidad) {
		super(nombre, tipo, ataque, defensa, velocidad);
		// TODO Auto-generated constructor stub
	}

	@Override
	void habilidadAtaque() {
		String[] habilidades = new String[] {"Látigo de aire","ráfaga","torbellino","embestida"};
		
	}
	
}
