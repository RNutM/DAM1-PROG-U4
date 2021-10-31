package herencias01;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Empleado extends Trabajador {
	/**
	 * Clase Empleado
	 * 
	 * @author Robert G
	 */
	double sueldo;
	double impuestos;
	final static int PAGA = 14;

	public Empleado(String nombre, double nss, double sueldo) {

		super(nombre, nss);
		this.sueldo = sueldo;
		this.impuestos = sueldo * 0.3;
	}

	public double calcularPaga() {
		
		double paga = (sueldo - impuestos / PAGA);
		
		// Redondeo a 2 decimales con BigDecimal y RoundingMode
		BigDecimal bd = new BigDecimal(paga).setScale(2, RoundingMode.HALF_UP);
		double pagaR = bd.doubleValue();
		
		return pagaR;
	}

	@Override
	public String toString() {
		return "Empleado " + super.toString();
	}

	public static void main(String[] args) {

		Empleado e = new Empleado("Juan", 125, 2500);
		//e.calcularPaga();

		System.out.println(e.toString() + "gana al mes " + e.calcularPaga());
	}
}
