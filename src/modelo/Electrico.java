package modelo;

public class Electrico  extends Pokemon{

	public Electrico(String nombre, String tipo, double ataque, double defensa, double velocidad,double poder) {
		super(nombre, tipo, ataque, defensa, velocidad, poder);
		// TODO Auto-generated constructor stub
	}

	@Override
	void habilidadAtaque() {
		String[] habilidades = new String[] {"Impactrueno","Látigo","Onda Trueno","embestida"};
		
	}

}
