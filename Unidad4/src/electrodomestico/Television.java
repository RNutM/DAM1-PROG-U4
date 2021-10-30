package electrodomestico;

//Añadimos extends y el nombre de la clase para heredar sus variables
public class Television extends Electrodomestico {
	/**
	 * Clase Hija
	 * 
	 * @author Robert G
	 */
	// Por defecto, la resolución será de 20 pulgadas y el sintonizador será false.
	private static final double PULGADAS_DEF = 20.0;
	private static final boolean TDT_DEF = false;

	private double pulgadas;
	private boolean tdt;

	// Un constructor por defecto.
	public Television() {
		super();
		setPulgadas(PULGADAS_DEF);
		setTdt(TDT_DEF);
	}

	// Un constructor con el precio y peso. El resto por defecto.
	public Television(double preciobase, double peso) {
		super(preciobase, peso);
		setPulgadas(PULGADAS_DEF);
		setTdt(TDT_DEF);
	}

	// Un constructor con la resolución(pulgadas), sintonizador TDT y el resto de
	// atributos heredados.
	public Television(double preciobase, double peso, consumo ce, colores cl, double pulgadas, boolean tdt) {
		super(preciobase, peso, ce, cl);
		setPulgadas(PULGADAS_DEF);
		setTdt(TDT_DEF);
	}

	@Override
	protected double precioFinal() {
		double precioFinal = super.precioFinal();
		/*
		 * precioFinal(): si tiene una resolución mayor de 40 pulgadas, se incrementara el
		 * precio un 30% y si tiene un sintonizador TDT incorporado, aumentara 50 €.
		 */
		if (pulgadas > 40) {
			precioFinal = precioFinal * 1.30;
		}
		if (tdt) {
			precioFinal = precioFinal + 50;
		}
		return super.precioFinal();
	}

	// Getters & Setters - Método get de resolución(pulgadas) y sintonizador TDT.
	public double getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(double pulgadas) {
		// Si las pulgadas son negativas o 0
		if (pulgadas <= 0) {
			throw new IllegalArgumentException();
		}

		this.pulgadas = pulgadas;
	}

	public boolean isTdt() {
		return tdt;
	}

	public void setTdt(boolean tdt) {
		this.tdt = tdt;
	}

	@Override
	public String toString() {
		return super.toString().replace("Electrodomestico", "Television") + "" + " pulgadas=" + pulgadas + ", tdt="
				+ tdt;
	}

}
