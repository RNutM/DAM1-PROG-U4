package ejercicios_14_18_enero_2019;

public class libro_biblioteca {
	/**
	 * Libro (en una biblioteca)
	 * 
	 * @author Robert G
	 */
	private String titulo;
	private String autor;
	private int edicion;
	private int npaginas;
	private String editorial;
	private String ISBN;
	private String estanteria;
	private boolean prestado;

	// Constructor sin valores
	public libro_biblioteca(String t, String a, int edic, int n, String edit, String I, String e, boolean p) {

		titulo = t;
		autor = a;
		edicion = edic;
		npaginas = n;
		editorial = edit;
		ISBN = I;
		estanteria = e;
		prestado = p;
	}

	// Método toString
	public String toString() {
		return "Libro - Biblioteca Nacional [Titulo= " + titulo + ",\n Autor= " + autor + ", Edición= " + edicion
				+ ", Nº Páginas= " + npaginas + ",\n Editorial= " + editorial + ", ISBN= " + ISBN + ", Estantería= "
				+ estanteria + ", Prestado=" + prestado + "]";
	}

	// Método main
	public static void main(String[] args) {

		libro_biblioteca l1 = new libro_biblioteca("La casa de Bernarda Alba", "Federico García Lorca", 2005, 288,
				"Catedra", "9788437622453", "144D", true);

		System.out.print(l1.toString());
	}
}