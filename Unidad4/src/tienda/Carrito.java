package tienda;

//Esta es una clase unica en la que invocamos clases hijas
public class Carrito {
	/**
	 * Clase Carrito
	 * 
	 * @author Robert G
	 */
	// Variables e invocaciones de clase
	String tcarrito;// ticket de carrito
	private Deporte dep;
	private Musica mus;
	private Informatica inf;

	// Constructor donde introducimos los datos de los artículos
	Carrito() {
		tcarrito = "";
		dep = new Deporte("Pesas", "Musculos", 11111, 10.0, 2);
		mus = new Musica("MP3", "Wmedia", 12345, 5.0, 3);
		inf = new Informatica("Varios", "Eclipse", 77777, 250.0, 2);
	}

	// Getters & Setters
	public Deporte getDep() {
		return dep;
	}

	public void setDep(Deporte dep) {
		this.dep = dep;
	}

	public Musica getMus() {
		return mus;
	}

	public void setMus(Musica mus) {
		this.mus = mus;
	}

	public Informatica getInf() {
		return inf;
	}

	public void setInf(Informatica inf) {
		this.inf = inf;
	}

	// Método que genera un numero aleatorio para el numero del ticket
	public void SetTCarrito() {
		int numero = (int) (Math.random() * 9999) + 1;// Número aleatorio entre 1 y 9999
		System.out.println("");
		System.out.println("Nº TICKET: " + numero);
	}

	// Método para imprimir el ticket
	public void ImprimirTicket() {
		dep.importe = dep.precio * dep.nunids;
		inf.importe = inf.precio * inf.nunids;
		mus.importe = mus.precio * mus.nunids;

		double totalsiniva = dep.importe + inf.importe + mus.importe;

		double iva = (totalsiniva * 21) / 100;

		double total = (totalsiniva + iva);

		/*
		 * El TIPO es ejercicio a realizar en Deportes lenguajes a programar en Informatica y
		 * formato de musica a reproducir en Música
		 */

		// Aqui construyo el formato del ticket, que puedo manipular sin problema
		SetTCarrito();// Mostramos el número de ticket
		System.out.println("");
		System.out.println("\tCODIGO" + "\tTIPO" + "\tNOMBRE" + "\tUNIDADES" + "  PRECIO" + "  IMPORTE");
		System.out.println("\t" + dep.codproduc + "\t" + dep.ejercicio + "\t" + dep.nombre + "  " + dep.nunids + "\t  "
				+ dep.precio + "\t " + dep.importe);
		System.out.println("\t" + inf.codproduc + "\t" + inf.lsop + "\t" + inf.nombre + "\t  " + inf.nunids + "\t  "
				+ inf.precio + "\t " + inf.importe);
		System.out.println("\t" + mus.codproduc + "\t" + mus.formato + "\t" + mus.nombre + "\t  " + mus.nunids + "\t  "
				+ mus.precio + "\t " + mus.importe);
		System.out.println("");
		System.out.println("\t\t\t\t\t TOTAL SIN IVA: " + totalsiniva + "€");
		System.out.println("\t\t\t\t\t IVA 21%: " + iva + "€");
		System.out.println("\t\t\t\t\t *********************");
		System.out.println("\t\t\t\t\t TOTAL");
		System.out.println("\t\t\t\t\t " + total + "€");
		System.out.println("\t\t\t\t\t *********************");
	}

	// Método main
	public static void main(String[] args) {

		Carrito c = new Carrito();

		c.ImprimirTicket();
	}
}