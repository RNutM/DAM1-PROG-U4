package arrays;

import java.util.Scanner;

public class Temperatura {
	/**
	 * 2. Realizar un programa que pide al usuario la temperatura de los 7 días de la
	 * semana y después muestra la temperatura media de la semana y los días en los que
	 * la temperatura ha estado por encima de la media y los días que ha estado por
	 * debajo de ella.
	 * 
	 * @author Robert G
	 */
	float[] temperatura = new float[7];
	String[] dia = { "lunes", "Martes", "miércoles", "jueves", "viernes", "sábado", "domingo" };
	float media = 0;

	// Metodo pedir temperatura
	public void pedir() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 7; i++) {

			System.out.print("Introduce la temperatura del " + dia[i] + ": ");
			temperatura[i] = sc.nextInt();
		}
		sc.close();
	}

	// Método hallar la media
	public float media() {

		float suma = 0;

		for (int i = 0; i < temperatura.length; i++) {
			suma = suma + temperatura[i];
		}
		media = suma / temperatura.length;

		return media;
	}

	// Método comprobar valor por encima o por debajo
	public void comprobar() {
		for (int i = 0; i < temperatura.length; i++) {

			if (temperatura[i] > media) {
				System.out.println(
						"La temperatura del " + dia[i] + " (" + temperatura[i] + ")" + " esta por encima de la media");
			} else {
				System.out.println(
						"La temperatura del " + dia[i] + " (" + temperatura[i] + ")" + " esta por debajo de la media");
			}
		}
	}

	public static void main(String[] args) {

		Temperatura t = new Temperatura();

		t.pedir();
		System.out.println("**********************************");
		System.out.println("La temperatura media es " + t.media());
		System.out.println("**********************************");
		t.comprobar();
		System.out.println("**********************************");
	}
}
