package modelo;

public abstract  class Pokemon {
	
	protected String nombre;
	protected String tipo;
	protected  double ataque;
	protected  double defensa;
	protected  double velocidad;
	

	abstract void habilidadAtaque();
	

	public Pokemon(String nombre, String tipo) {
		
		this.nombre = nombre;
		this.tipo = tipo;
	}


	public Pokemon(String nombre, String tipo, double ataque, double defensa, double velocidad) {
	
		this.nombre = nombre;
		this.tipo = tipo;
		this.ataque = ataque;
		this.defensa = defensa;
		this.velocidad = velocidad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	@Override
	public String toString() {
		return "Pokemon [nombre=" + nombre + ", tipo=" + tipo + ", ataque=" + ataque + ", defensa=" + defensa
				+ ", velocidad=" + velocidad + "]";
	}
	
}
