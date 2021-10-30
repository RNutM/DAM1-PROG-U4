package electrodomestico;

public class Electrodomestico {
	/**
	 * Clase Padre
	 * 
	 * @author Robert G
	 */
	// Variables constantes, no pueden cambiar
	public static final int PRECIODEFECTO = 100;
	public static final double PESODEFECTO = 5;

	public double preciobase = 100;
	private double peso = 5;

	public enum consumo {
		A, B, C, D, E, F
	};

	public enum colores {
		blanco, negro, rojo, azul, gris
	};

	public consumo ce;
	public colores cl;

	// Constructor por defecto
	public Electrodomestico() {
		this.preciobase = 100;
		this.peso = 5;
		this.ce = consumo.F;
		this.cl = colores.blanco;
	}

	// Un constructor con el precio y peso. El resto por defecto.
	public Electrodomestico(double preciobase, double peso) {
		this.ce = consumo.F;
		this.cl = colores.blanco;
		this.preciobase = preciobase;
		this.peso = peso;
	}

	// Un constructor con todos los atributos.
	public Electrodomestico(double preciobase, double peso, consumo ce, colores cl) {
		this.ce = ce;
		this.cl = cl;
		this.preciobase = preciobase;
		this.peso = peso;
	}

	// Método comprobar consumo
	protected void comprobarConsumoEnergetico(consumo ce) {
		this.ce = ce;
	}

	// Método comprobar color
	protected void comprobarColor(colores cl) {

		this.cl = cl;
	}

	// Método comprobar precio: según el consumo energético, aumentara su precio, y según
	// su tamaño, también.
	protected double precioFinal() {
		switch (ce) {
		case A:
			preciobase = 100;
			break;
		case B:
			preciobase = 80;
			break;
		case C:
			preciobase = 60;
			break;
		case D:
			preciobase = 50;
			break;
		case E:
			preciobase = 30;
			break;
		case F:
			preciobase = 10;
			break;
		}

		if (peso <= 0 && peso > 20) {
			preciobase += 10;
		}
		if (peso >= 20 && peso > 50) {
			preciobase += 50;
		}
		if (peso >= 50 && peso > 80) {
			preciobase += 80;
		}
		if (peso >= 80) {
			preciobase += 100;
		}
		return preciobase;
	}

	// Método para evitar el error al introducir el precio
	public void setPrecioBase(double precioBase) {
		if (precioBase < 0) {
			throw new IllegalArgumentException("El precio tiene que ser positivo");
		}
		this.preciobase = precioBase;
	}

	// Método para evitar el error al introducir el peso
	public void setPeso(double peso) {
		if (peso <= 0) {
			throw new IllegalArgumentException("El peso tiene que ser superior a cero");
		}
		this.peso = peso;
	}

	// Getters & Setters
	public double getPreciobase() {
		return preciobase;
	}

	public void setPreciobase(double preciobase) {
		this.preciobase = preciobase;
	}

	public consumo getCe() {
		return ce;
	}

	public void setCe(consumo ce) {
		this.ce = ce;
	}

	public colores getCl() {
		return cl;
	}

	public void setCl(colores cl) {
		this.cl = cl;
	}

	public static int getPreciodefecto() {
		return PRECIODEFECTO;
	}

	public static double getPesodefecto() {
		return PESODEFECTO;
	}

	public double getPeso() {
		return peso;
	}

	// Método toString para construir el formato de salida en consola
	public String toString() {
		return "Electrodomestico [preciobase=" + preciobase + ", peso=" + peso + ", ce=" + ce + ", cl=" + cl + "]";
	}
}
