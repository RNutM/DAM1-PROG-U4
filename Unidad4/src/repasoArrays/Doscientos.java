package repasoArrays;

import java.util.Scanner;

public class Doscientos {
	/**
	 * Crea una clase llamada Doscientos.java con un array de enteros con 200 elementos
	 * (aleatorios entre 1 y 25) como atributo de la clase. Método para imprimir por
	 * pantalla las 200 posiciones y el número aleatorio que hay en cada una. El mayor,
	 * la suma, la media, los pares, cuantas veces se repite un número al final.
	 * 
	 * @author Robert G
	 */
	private int numeros[];

	// Constructor
	Doscientos() {

		numeros = new int[200];

		for (int i = 0; i < numeros.length; i++) {

			numeros[i] = (int) (Math.random() * 25) + 1;
		}
	}

	// Método Imprimir mayor
	public void imprimir() {

		int aux = 0;

		for (int i = 0; i < numeros.length; i++) {

			System.out.println("El número en posición " + i + " es el " + numeros[i]);

			if (numeros[i] > aux)

				aux = numeros[i];
		}
		System.out.println("El número mayor es " + aux);
	}

	// Metodo sumar elementos
	public int suma() {

		int suma = 0;

		for (int i = 0; i < numeros.length; i++) {
			suma = suma + numeros[i];
		}
		return suma;
	}

	// Metodo media
	public int media() {

		int suma = 0;
		int media = 0;

		for (int i = 0; i < numeros.length; i++) {

			suma = suma + numeros[i];
		}
		media = suma / numeros.length;

		return media;
	}

	// Metodo circular
	public void circular() {
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("El número mayor es " + i);

			if (i == (numeros.length - 1))
				i = 0;
		}
	}

	// Metodo pares
	public void pares() {
		for (int i = 0; i < numeros.length; i++) {

			if (numeros[i] % 2 == 0) {

				System.out.println("El 1er número par es: " + numeros[i]
						+ ", lo puedes comprobar si quieres mirando en la posición 0");
				break;// Para que pare de hacer bucle con el primer número par
			}
		}
	}

	// Metodo comprobar cuantas veces se repite un número
	public void comprobar() {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int cont = 0;

		do {
			System.out.println("Introduce un número entre 1 y 25:");
			n = sc.nextInt();
		} while (n < 1 || n > 25);

		for (int i = 0; i < numeros.length; i++) {

			if (n == numeros[i]) {

				System.out.println("Sale en la posición " + i);
				cont++;
			}
		}

		System.out.println("El numero " + n + " se repite " + cont + " veces");

		sc.close();
	}

	public static void main(String[] args) {

		Doscientos p = new Doscientos();

		p.imprimir();
		System.out.println("La suma es " + p.suma());
		System.out.println("La media es " + p.media());
		p.pares();
		p.comprobar();
	}
}

/*
 * public int posicion(int n) { if(n<0) n=n+numeros.length; return
 * (numeros[n%numeros.length]);
 * 
 * }
 */
