package ejercicios_14_18_enero_2019;

public class cancion {
	/**
	 * Canción (en una emisora de radio)
	 * 
	 * @author Robert G
	 */
	private String titulo, autor, genero;
	private float duracion;

	// Constructor sin valores
	public cancion(String t, String a, String g, float d) {

		titulo = t;
		autor = a;
		genero = g;
		duracion = d;
	}

	// Método toString
	public String toString() {
		return "Canción [Título= " + titulo + ", Autor= " + autor + ",\n Género= " + genero + ", Duración= " + duracion
				+ " min.]";
	}

	// Método main
	public static void main(String[] args) {

		cancion c = new cancion("Fear of the dark", "Iron Maiden", "Metal", 7.17f);

		System.out.println(c.toString());

	}
}