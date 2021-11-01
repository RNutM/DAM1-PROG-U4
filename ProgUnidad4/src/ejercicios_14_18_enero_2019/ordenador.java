package ejercicios_14_18_enero_2019;

public class ordenador {
	/**
	 * Ordenador (en una tienda de informática)
	 * 
	 * @author Robert G
	 */
	// Caracteristicas de un ordenador solo torre y monitor
	private String sistema;
	private float pantalla;
	private String fuente;
	private String placabase;
	private String procesador;
	private String RAM;
	private int almacenamiento;
	private String grafica;
	private float precio;

	// Constructor sin valores
	public ordenador(String s, float pa, String f, String pl, String pr, String r, int a, String g, float p) {

		sistema = s;
		pantalla = pa;
		fuente = f;
		placabase = pl;
		procesador = pr;
		RAM = r;
		almacenamiento = a;
		grafica = g;
		precio = p;
	}

	// Método toString
	public String toString() {
		return "Ordenador+Monitor [Sistema operativo= " + sistema + ", Monitor= " + pantalla + "'"
				+ ",\n Fuente de alimentación= " + fuente + "," + "\n Placa base= " + placabase + ", Procesador= "
				+ procesador + ",\n RAM= " + RAM + "," + "\n Almacenamiento= " + almacenamiento
				+ "Gb, Tarjeta gráfica= " + grafica + ",\n Precio= " + precio + "€]";
	}

	// Método main
	public static void main(String[] args) {

		ordenador o = new ordenador("Windows 10 - 64Bit", 27, "Corsair HX1200i 1200W 80 Plus Platinum Modular",
				"Gigabyte Z390 Gaming SLI", "Intel Core i7-9700K 3.6Ghz",
				"Corsair Vengeance RGB DDR4 3600 PC4-28800 16GB 2x8GB CL18", 1000,
				"Asus Dual GeForce RTX 2080Ti 11GB OC GDDR6", 6000.00f);

		System.out.println(o.toString());
	}
}