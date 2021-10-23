package clientes_vehiculos;

public class Coche extends Vehiculo {
	/**
	 * @author Robert G
	 */
	public String modelo;
	public String color;
	public int numeroPuertas;

	// Constructor sin parámetros
	public Coche() {
		super();
		modelo = "";
		color = "";
		numeroPuertas = 0;
	}

	// Constructor con parámetros
	public Coche(String matricula, String marca, String modelo, String color, Carburante ca, int numeroPuertas) {
		super();
		setMatricula(matricula);
		setMarca(marca);
		setModelo(modelo);
		setColor(color);
		setCarburante(ca);
		setNumeroPuertas(numeroPuertas);
	}

	public Coche(String matricula, String marca, Carburante carburante, Carburante ca) {
		setMatricula(matricula);
		setMarca(marca);
		setCarburante(carburante);
		setCarburante(ca);

	}

	// Getters & Setters
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	// String getTipo - Ojo si no creamos esto primero da error la clase que hereda
	public String getTipo() {
		return "coche";
	}
}
