package modelo;

public abstract  class Pokemon {
	/** 
	 * Representa el nombre del pokemon                                       
	 */
	protected String nombre;
	/** 
	 * Representa el tipo  del pokemon                                       
	 */
	protected String tipo;
	/** 
	 * Representa el valor del ataque del pokemon                                       
	 */
	protected  double ataque;
	/** 
	 * Representa el valor de defensa del pokemon                                       
	 */
	protected  double defensa;
	/** 
	 * Representa el valor de velocidad del pokemon                                       
	 */
	protected  double velocidad;
	/** 
	 * Representa el valor del del pokemon.Es el promedio de ataque,defensa y velocidad.                                       
	 */
	protected  double poder;
	
	/** 
	 * Método abstracto que definira las habilidades del pokemon                                     
	 */
	abstract void habilidadAtaque();
	
	/** 
	 * Crea una instancia de la clase Pokemon.
	 */
	public Pokemon(String nombre, String tipo) {
		
		this.nombre = nombre;
		this.tipo = tipo;
	}

	/** 
	 * Crea una instancia de la clase Pokemon.
	 */
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
