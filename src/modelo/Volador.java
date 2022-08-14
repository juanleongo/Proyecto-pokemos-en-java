package modelo;

public class Volador extends Pokemon{

	public Volador(String nombre, String tipo, double ataque, double defensa, double velocidad,double poder) {
		super(nombre, tipo, ataque, defensa, velocidad,poder);
		// TODO Auto-generated constructor stub
	}

	@Override
	void habilidadAtaque() {
		String[] habilidades = new String[] {"Látigo de aire","ráfaga","torbellino","embestida"};
		
	}
	
}
