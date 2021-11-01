package tienda;

//Esta es una clase hija de la clase producto(padre)
public class Deporte extends Producto {
	/**
	 * Clase Deporte
	 * 
	 * @author Robert G
	 */
	// ejercicio = ejercicio físico a realizar
	public String ejercicio;// musculaciï¿½n, dieta, mantenimiento, artes marciales, etc.

	// Constructor sin parámetros
	public Deporte() {
		super();
		ejercicio = "";
	}

	// Constructor con parámetros
	public Deporte(String ejercicio, String nombre, int codproduc, double precio, int nunids) {
		super(codproduc, nombre, nunids, precio);
		setEjercicio(ejercicio);
	}

	public String getEjercicio() {
		return ejercicio;
	}

	public void setEjercicio(String ejercicio) {
		this.ejercicio = ejercicio;
	}
}