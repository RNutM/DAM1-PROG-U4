package ejercicios_14_18_enero_2019;

import java.util.Scanner;

public class Punto_esp {
	/**
	 * Punto en el espacio con lo que lleva 3 coordenadas
	 * 
	 * @author Robert G
	 */
	private int x, y, z;

	// Constructor
	public Punto_esp() {
		x = 0;
		y = 0;
		z = 0;
	}

	// Constructor
	public Punto_esp(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	// Método para pedir parámetros al usuario
	public void inicializar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce coordenada 1");
		x = sc.nextInt();
		System.out.println("Introduce coordenada 2");
		y = sc.nextInt();
		System.out.println("Introduce coordenada 3");
		z = sc.nextInt();
		sc.close();
	}

	// Método toString para el formato de salida
	public String toString() {
		return ("(" + x + "," + y + "," + z + ")");
	}

	// Método main
	public static void main(String[] args) {

		Punto_esp p1 = new Punto_esp();
		Punto_esp p2 = new Punto_esp(1, 2, 3);

		p1.inicializar();

		System.out.println("El punto 1 introducido por el usuario es: " + p1);
		System.out.println("El punto 2 con los valores en el main es: " + p2);
	}
}