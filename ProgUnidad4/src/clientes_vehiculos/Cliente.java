package clientes_vehiculos;

public class Cliente {
	/**
	 * Pruebas de polimorfismo y clases abstractas
	 * 
	 * @author Robert G
	 */
	private NIF nif;
	private String nombre;
	private String apellidos;
	private String direccion;
	private double saldo;
	private Vehiculo v[];

	// Constructor sin parametros
	public Cliente() {

	}

	// Constructor con todos los parámetros(usa los setters para darle valor a las
	// variables de la clase)
	public Cliente(NIF nif, String nombre, String apellidos, String direccion, double saldo, Vehiculo[] mv) {
		this.setNif(nif);
		this.setNombre(nombre);
		this.setApellidos(apellidos);
		this.setDireccion(direccion);
		this.setSaldo(saldo);
		this.setV(mv);
	}

	public void setVehiculos(Vehiculo[] mv) {
		this.v = new Vehiculo[5];
		this.v = mv;
	}

	public Vehiculo[] getVehiculo() {
		return this.v;
	}

	// Getters & Setters
	public NIF getNif() {
		return nif;
	}

	public void setNif(NIF nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Vehiculo[] getV() {
		return v;
	}

	public void setV(Vehiculo[] v) {
		this.v = v;
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		NIF nif = new NIF("11111111H");
		Cliente c = new Cliente();

		c.setNombre("Robert");
		c.setDireccion("C/ El barco, 7");
		System.out.println("El nif tiene como nombre " + c.getNombre() + " y vive en " + c.getDireccion());
	}
}
