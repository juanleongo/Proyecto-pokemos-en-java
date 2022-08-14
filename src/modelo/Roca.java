package modelo;

public class Roca extends Pokemon{

	public Roca(String nombre, String tipo, double ataque, double defensa, double velocidad,double poder) {
		super(nombre, tipo, ataque, defensa, velocidad,poder);
		// TODO Auto-generated constructor stub
	}

	@Override
	void habilidadAtaque() {
		String[] habilidades = new String[] {"Lanzarroca","placaje","terremoto","embestida"};
		
	}

}
