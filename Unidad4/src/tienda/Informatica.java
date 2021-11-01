package tienda;

//Esta es una clase hija de la clase producto(padre)
public class Informatica extends Producto {
	/**
	 * Clase Informatica
	 * 
	 * @author Robert G
	 */
	// lsop = lenguajes soportados por la app para programar
	public String lsop;

	// Constructor sin parámetros
	public Informatica() {
		super();
		lsop = "";
	}

	// Constructor con parámetros
	public Informatica(String lsop, String nombre, int codproduc, double precio, int nunids) {
		super(codproduc, nombre, nunids, precio);
		setLsop(lsop);
	}

	public String getLsop() {
		return lsop;
	}

	public void setLsop(String lsop) {
		this.lsop = lsop;
	}
}