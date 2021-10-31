package herencias01;

public class Trabajador {
	/**
	 * Clase Trabajador
	 * 
	 * @author Robert G
	 */
	protected String nombre;
	protected String puesto;
	protected String direccion;
	protected int telefono;
	protected String fecha_nacimiento;
	protected String fecha_contratacion;
	protected double nss;

	public Trabajador(String nombre, double nss) {
		this.nombre = nombre;
		this.nss = nss;
		this.puesto = "";
		this.direccion = "";
		this.telefono = 0;
		this.fecha_nacimiento = "";
		this.fecha_contratacion = "";
	}

	@Override
	public boolean equals(Object obj) {

		Trabajador other = (Trabajador) obj;
		if (Double.doubleToLongBits(nss) != Double.doubleToLongBits(other.nss))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getFecha_contratacion() {
		return fecha_contratacion;
	}

	public void setFecha_contratacion(String fecha_contratacion) {
		this.fecha_contratacion = fecha_contratacion;
	}

	public double getNss() {
		return nss;
	}

	public void setNss(double nss) {
		this.nss = nss;
	}

	@Override
	public String toString() {
		return (this.nombre + "(nss " + this.nss + ")");
	}

	public static void main(String[] args) {

		Trabajador t1 = new Trabajador("Marta", 123);
		Trabajador t2 = new Trabajador("Marta", 123);

		System.out.println("El nº de SS de " + t1.getNombre() + " es: " + t1.getNss());

		if (t1.equals(t2))
			System.out.println(t1.getNombre() + " y " + t2.getNombre() + " son el mismo trabajador");
		else
			System.out.println(t1.getNombre() + " y " + t2.getNombre() + " son trabajadores diferentes");
	}
}
