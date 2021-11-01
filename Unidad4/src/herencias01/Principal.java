package herencias01;

public class Principal {
	/**
	 * Clase Principal
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		Trabajador t1 = new Trabajador("José", 123);
		Trabajador t2 = new Trabajador("Robert", 123);
		Empleado e = new Empleado("José", 123, 24000.0); // si cambio el nss el resultado será consultor
		Consultor c = new Consultor("Robert", 123, 10, 50.0);// si cambio el nss el resultado será empleado

		System.out.println(t1+" "+t2);
		System.out.println(e);
		System.out.println(c);

		if (t1.equals(e))
			System.out.println("El trabajador " + t1.getNombre() + " es un empleado");
		else
			System.out.println("El trabajador " + t1.getNombre() + " es un consultor");

		if (t2.equals(c))
			System.out.println("El trabajador " + t2.getNombre() + " es un consultor");
		else
			System.out.println("El trabajador " + t2.getNombre() + " es un empleado");
	}
}
