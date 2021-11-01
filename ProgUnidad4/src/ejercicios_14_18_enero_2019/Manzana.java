package ejercicios_14_18_enero_2019;

public class Manzana {
	/**
	 * Manzana
	 * 
	 * @author Robert G
	 */
	private String variedad, color, pais, distribuidor;
	private double preciokg, peso;
	private int lote;

	// Constructor sin valores
	Manzana(String v, String c, String p, String d, double pk, double ps, int l) {

		variedad = v;
		color = c;
		pais = p;
		distribuidor = d;
		preciokg = pk;
		peso = ps;
		lote = l;
	}

	// Método toString
	public String toString() {
		return "Manzana [Variedad= " + variedad + ", Color=" + color + ", País=" + pais + ", Distribuidor="
				+ distribuidor + ",\n" + " Precio/kg=" + preciokg + "€, Peso=" + peso + "kg, Lote=" + lote + "]";
	}

	// Método main
	public static void main(String[] args) {

		Manzana m1 = new Manzana("Reineta", "Roja", "España", "Pepe", 1.55, 0.257, 12);
		System.out.println(m1.toString());
	}
}
