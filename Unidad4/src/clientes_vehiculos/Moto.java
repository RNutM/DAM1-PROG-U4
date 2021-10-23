package clientes_vehiculos;

public class Moto extends Vehiculo {
	/**
	 * @author Robert G
	 */
	public double cilindrada;

	// Constructor sin parámetros
	public Moto() {
		super();
		cilindrada = 0;
	}

	// Constructor con parámetros
	public Moto(String matricula, String marca, Carburante carburante, double cilindrada) {
		super();
		setMatricula(matricula);
		setMarca(marca);
		setCarburante(carburante);
		setCilindrada(cilindrada);
	}

	// Getters & Setters
	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	// String getTipo - Ojo si no creamos esto primero da error la clase que hereda
	public String getTipo() {
		return "moto";
	}
}
