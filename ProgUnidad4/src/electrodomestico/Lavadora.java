package electrodomestico;

//Añadimos extends y el nombre de la clase para heredar sus variables
public class Lavadora extends Electrodomestico {
	/**
	 * Clase Hija
	 * 
	 * @author Robert G
	 */
	// Por defecto, la carga es de 5 kg. Usa una constante para ello.
	private static final double CARGA_DEF = 5.0;

	// Variable carga, esta es de esta clase
	private double carga;

	// Un constructor por defecto.
	public Lavadora() {
		super();
		setCarga(CARGA_DEF);
	}

	// Un constructor con el precio y peso. El resto por defecto.
	public Lavadora(double preciobase, double peso) {
		super(preciobase, peso);
		setCarga(CARGA_DEF);
	}

	// Un constructor con la carga y el resto de atributos heredados.
	public Lavadora(double preciobase, double peso, consumo ce, colores cl, double carga) {
		super(preciobase, peso, ce, cl);
		setCarga(carga);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Electrodomestico.Electrodomestico#precioFinal()
	 */
	@SuppressWarnings("unused")
	@Override
	protected double precioFinal() {
		double precioFinal = super.precioFinal();
		/*
		 * precioFinal(): si tiene una carga mayor de 30 kg, aumentara el precio 50 €, sino
		 * es así no se incrementara el precio.
		 */
		if (this.carga > 30) {
			precioFinal += 50;
		}
		return super.precioFinal();
	}

	// Getters y Setters
	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		// Condición con if para carga menor o igual a 0
		if (carga <= 0) {
			throw new IllegalArgumentException();
		}
		this.carga = carga;
	}

	@Override
	public String toString() {
		return super.toString().replace("Electrodomestico", "Lavadora") + " carga=" + carga;
	}
}
