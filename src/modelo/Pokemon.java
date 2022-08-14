package modelo;

public abstract  class Pokemon {
	
	protected String nombre;
	protected String tipo;
	protected  double ataque;
	protected  double defensa;
	protected  double velocidad;
	protected  double poder;
	

	abstract void habilidadAtaque();
	

	public Pokemon(String nombre, String tipo) {
		
		this.nombre = nombre;
		this.tipo = tipo;
	}


	public Pokemon(String nombre, String tipo, double ataque, double defensa, double velocidad,double poder) {
	
		this.nombre = nombre;
		this.tipo = tipo;
		this.ataque = ataque;
		this.defensa = defensa;
		this.velocidad = velocidad;
		this.poder = poder;
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


	public double getAtaque() {
		return ataque;
	}


	public void setAtaque(double ataque) {
		this.ataque = ataque;
	}


	public double getDefensa() {
		return defensa;
	}


	public void setDefensa(double defensa) {
		this.defensa = defensa;
	}


	public double getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}


	public double getPoder() {
		return poder;
	}


	public void setPoder(double poder) {
		this.poder = poder;
	}


	@Override
	public String toString() {
		return "Pokemon [nombre=" + nombre + ", tipo=" + tipo + ", ataque=" + ataque + ", defensa=" + defensa
				+ ", velocidad=" + velocidad + ", poder=" + poder + "]";
	}


	
}
