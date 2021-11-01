package clientes_vehiculos;

public abstract class Vehiculo {
	/**
	 * @author Robert G
	 */
	public String matricula;
	public String marca;
	public Carburante carburante;

	enum Carburante {
		DIESEL, GASOLINA, ELECTRICO
	};

	public Carburante ca;

	// Constructor sin parámetros
	public Vehiculo() {
		super();
		matricula = "";
		marca = "";
		ca = Carburante.DIESEL;
	}

	/*
	 * Constructor con todos los parámetros (usa los setters para darle valor a las
	 * variables de la clase)
	 */
	public Vehiculo(String matricula, String marca, Carburante ca) {
		super();
		setMatricula(matricula);
		setMarca(marca);
		setCarburante(ca);
	}

	// Getters y setters
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Carburante getCarburante() {
		return carburante;
	}

	public void setCarburante(Carburante carburante) {
		this.carburante = carburante;
	}

	public Carburante getCa() {
		return ca;
	}

	public void setCa(Carburante ca) {
		this.ca = ca;
	}

	// Un método abstracto String getTipo();
	public abstract String getTipo();

}
