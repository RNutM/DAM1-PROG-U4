package matrices;

public class Ejercicio01 {
	/**
	 * Realizar un programa en Java que rellene una matriz de 3 x 4 por filas colocando
	 * números consecutivos en cada posición de la tabla. Una vez rellenada la tabla la
	 * tiene que mostrar en pantalla por filas (con forma de matriz).
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		int fil = 3;
		int col = 4;
		int[][] matriz = new int[fil][col];

		int cont = 1;
		for (int i = 0; i < fil; i++)
			for (int j = 0; j < col; j++) {
				matriz[i][j] = cont;
				cont++;
			}
		for (int i = 0; i < fil; i++) {

			for (int j = 0; j < col; j++) {

				System.out.print("\t" + matriz[i][j]);
			}
			System.out.println("");
		}
	}
}

//for(int i=0;i<matriz.length;i++);
//for(int j=0;j<matriz[0].length;j++);