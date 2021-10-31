package herencias01;

public class Principal {
	/**
	 *  Clase Principal
	 *  
	 *  @author Robert G
	 */
	public static void main(String[] args) {

		Trabajador t = new Trabajador("Marta", 123);
		Empleado e = new Empleado("Juan", 456, 24000.0);
		Consultor c = new Consultor("Robert", 123, 10, 50.0);

		System.out.println(t);
		System.out.println(e);
		System.out.println(c);

		if (t.equals(e))
			System.out.println("El trabajador " + t.getNombre() + " es un empleado");
		if (t.equals(c))
			System.out.println("El trabajador " + t.getNombre() + " es un consultor");
	}
}
