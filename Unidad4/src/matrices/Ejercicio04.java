package matrices;

public class Ejercicio04 {
	/**
	 * (SALIDA HORIZONTAL) Realizar un programa en Java que rellene dos matrices de números
	 * enteros de 3 x 4 con números aleatorios entre 1 y 30. Después calculará la matriz
	 * suma (también de 3 x4) que será la suma elemento a elemento de las dos anteriores
	 * y por último mostrará las tres matrices -> Matriz A + Matriz B = Matriz C
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		int[][] t1 = new int[3][4];// Matriz -A
		int[][] t2 = new int[3][4];// Matriz -B
		int[][] suma = new int[3][4];// Matriz C
		int f, c;// Filas y columnas

		// rellenamos las dos tablas t1 y t2 con valores aleatorios.
		System.out.println("		MATRIZ A				MATRIZ B				MATRIZ C");
		for (f = 0; f < t1.length; f++) {
			for (c = 0; c < t1[0].length; c++) {
				t1[f][c] = (int) (Math.random() * 30 + 1);
				t2[f][c] = (int) (Math.random() * 30 + 1);
			}
		}
		
		// Hacemos la suma de las matrices
		for (f = 0; f < t1.length; f++) {
			for (c = 0; c < t1[0].length; c++) {
				suma[f][c] = t1[f][c] + t2[f][c];
			}
		}
		
		// Mostramos los resultados en pantalla
		for (f = 0; f < t1.length; f++) {
			for (c = 0; c < t1[0].length; c++) {
				System.out.print("\t" + t1[f][c]);
			}
			if (f == ((int) (t1.length / 2))) {
				System.out.print("\t+");
			} else {
				System.out.print("\t");
			}

			for (c = 0; c < t2[0].length; c++) {
				System.out.print("\t" + t2[f][c]);
			}
			if (f == ((int) (t2.length / 2))) {
				System.out.print("\t=");
			} else {
				System.out.print("\t");
			}
			for (c = 0; c < suma[0].length; c++) {
				System.out.print("\t" + suma[f][c]);
			}
			// Saltamos de linea.
			System.out.println();
		}
	}
}
