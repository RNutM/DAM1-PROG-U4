package matrices;

import java.util.Scanner;

public class Ejercicio02 {
	/**
	 * Realizar un programa en Java que rellene una matriz de filas colocando números
	 * consecutivos en cada posición de la tabla. El usuario decide cuantas filas y
	 * columnas quiere entre 2 y 10. Una vez rellenada la tabla la tiene que mostrar en
	 * pantalla por filas (con forma de matriz).
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		int fil = 3;
		int col = 4;

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Introduce Nº de filas (2-10)");
			fil = sc.nextInt();
		} while (fil < 2 || fil > 10);

		do {
			System.out.println("Introduce nº de columnas (2-10)");
			col = sc.nextInt();
		} while (col < 2 || col > 10);

		int[][] matriz = new int[fil][col];

		for (int i = 0; i < fil; i++)
			for (int j = 0; j < col; j++) {
				matriz[i][j] = (int) ((Math.random() * 50) + 1);
			}
		for (int i = 0; i < fil; i++) {

			for (int j = 0; j < col; j++) {

				System.out.print("\t" + matriz[i][j]);
			}
			System.out.println("");
		}
		sc.close();
	}
}
