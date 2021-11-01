package matrices;

public class Ejercicio05 {
	/**
	 * Muestre por pantalla una simulación de un tablero de ajedrez. Las casillas
	 * blancas las representaremos con el carácter B y las negras con el carácter N.
	 * Utilice arrays de dos dimensiones.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		int fil = 8;
		int col = 8;

		String[][] ajedrez = new String[fil][col];

		for (int i = 0; i < fil; i++)
			for (int j = 0; j < col; j++) {
				if (i % 2 == 0) {
					ajedrez[i][j] = "B";
					j++;
					if (ajedrez[i][j] == null) {
						ajedrez[i][j] = "N";
					}
				} else {
					ajedrez[i][j] = "N";
					j++;
					if (ajedrez[i][j] == null) {
						ajedrez[i][j] = "B";
					}
				}
			}
		for (int i = 0; i < fil; i++) {

			for (int j = 0; j < col; j++) {

				System.out.print(" " + ajedrez[i][j]);
			}
			System.out.println("");
		}
	}
}
