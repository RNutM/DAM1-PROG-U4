package herencias01;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Consultor extends Trabajador {
	/**
	 * Clase Consultor
	 * 
	 * @author Robert G
	 */
	public int horas;
	public double tarifa;

	public Consultor(String nombre, double nss, int horas, double tarifa) {
		super(nombre, nss);
		this.horas = horas;
		this.tarifa = tarifa;
	}

	public double calcularPaga() {
		double paga = (horas * tarifa);

		// Redondeo a 2 decimales con BigDecimal y RoundingMode
		BigDecimal bd = new BigDecimal(paga).setScale(2, RoundingMode.HALF_UP);
		double pagaR = bd.doubleValue();

		return pagaR;
	}

	@Override
	public String toString() {
		return "Consultor " + super.toString();
	}

	public static void main(String[] args) {

		Consultor c = new Consultor("Luis", 136, 25, 10.37);
		System.out.println(
				"El " + c.toString() + " ha ganado " + c.calcularPaga() + "€" + " en el total de horas calculadas.");
	}
}
