package clientes_vehiculos;

import clientes_vehiculos.Vehiculo.Carburante;

public class Prueba {
	/**
	 * Pruebas de polimorfismo y clases abstractas
	 * 
	 * @author Robert G
	 */
	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		Carburante ca = null;

		Coche c1 = new Coche("5264-HBN", "Wolkswagen", "PASSAT", "Negro", ca.DIESEL, 4);
		Moto m1 = new Moto("7854-JTG", "Kawasaki", ca.GASOLINA, 650);

		Vehiculo[] v = new Vehiculo[6];
		v[0] = c1;
		v[1] = m1;

		NIF nif = new NIF("11111111H");
		Cliente c = new Cliente(nif, "Robert", "Gutiérrez", "C/ El barco, 7 ", 3000, v);

		System.out.println("Tiene " + c1.getTipo() + " que funciona con " + v[0].getCa());
		System.out.println("También tiene " + m1.getTipo() + " que funciona con " + v[1].getCarburante());
		System.out.println("La marca del " + c1.getTipo() + " es un " + v[0].getMarca() + " " + c1.getModelo()
				+ " de color " + c1.getColor() + " y tiene " + c1.getNumeroPuertas() + " puertas");
		System.out.println(
				"La marca de la " + m1.getTipo() + " es " + v[1].getMarca() + " y tiene " + m1.getCilindrada() + "cc");

		System.out.println("La matricula del " + c1.getTipo() + " es " + c1.getMatricula());
		System.out.println("La matricula de la " + m1.getTipo() + " es " + m1.getMatricula());

		System.out.println("El dueño es: " + c.getNombre() + " " + c.getApellidos());
	}
}
