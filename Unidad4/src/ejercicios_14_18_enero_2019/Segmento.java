package ejercicios_14_18_enero_2019;

public class Segmento {
	/**
	 * Un segmento de recta
	 * 
	 * @author Robert G
	 */
	public int x, y;

	// Constructor
	Segmento() {
		x = 0;
		y = 0;
	}

	// Constructor
	Segmento(int x1, int y1) {
		x = x1;
		y = y1;
	}

	// Método toString
	public String toString() {
		return ("(" + x + "," + y + ")");
	}

	// Método para hallar la distancia sin redondear entre dos puntos
	public static double distancia1(Segmento A, Segmento B) {

		double d = Math.sqrt(Math.pow((B.x - A.x), 2) + Math.pow((B.y - A.y), 2));
		return d;
	}

	// Método para hallar la distancia redondeada entre dos puntos
	public static double distancia2(Segmento A, Segmento B) {

		double e = Math.round(Math.sqrt(Math.pow((B.x - A.x), 2) + Math.pow((B.y - A.y), 2)));
		return e;
	}

	// Método main
	public static void main(String[] args) {

		Segmento A = new Segmento(5, 6);
		Segmento B = new Segmento(7, 8);

		double d = distancia1(A, B);
		double e = distancia2(A, B);
		System.out.println("*****************************************************************");
		System.out.println("La distancia sin redondear entre A y B es: " + d);
		System.out.println("*****************************************************************");
		System.out.println("La distancia redondeada entre A y B es: " + e);
		System.out.println("*****************************************************************");
		System.out.println("La ecuación de la recta que pasa por A y B es: " + "(x-" + A.x + ")/" + (B.x - A.x)
				+ " = (y-" + A.y + ")/" + (B.y - A.y));
		System.out.println("*****************************************************************");
	}
}