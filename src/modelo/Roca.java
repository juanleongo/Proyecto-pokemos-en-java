package modelo;

public class Roca extends Pokemon{

	public Roca(String nombre, String tipo, double ataque, double defensa, double velocidad) {
		super(nombre, tipo, ataque, defensa, velocidad);
		// TODO Auto-generated constructor stub
	}

	@Override
	void habilidadAtaque() {
		String[] habilidades = new String[] {"Lanzarroca","placaje","terremoto","embestida"};
		
	}

}
