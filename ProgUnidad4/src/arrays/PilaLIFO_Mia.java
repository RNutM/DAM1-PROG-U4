package arrays;

import javax.swing.JOptionPane;

public class PilaLIFO_Mia {
	/**
	 * Haciendo una clase como la de Stack y sus métodos para apilar/desapilar elementos,
	 * ver si esta llena o vacía y poder imprimir su contenido.
	 * 
	 * @author Robert G
	 */
	private int numElementos;
	private int elementos[];
	private int indice;

	public PilaLIFO_Mia(int numElementos) {
		this.numElementos = numElementos;
		indice = -1;
		elementos = new int[numElementos];
	}

	public boolean vacia() {
		return indice == -1;
	}

	public boolean llena() {
		return indice == numElementos - 1;
	}

	public void apilar(int elemento) {
		indice++;
		try {
			elementos[indice] = elemento;
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "La pila se encuentra llena");
			indice--;
		}
	}

	public int desapilar() {
		int elemento = elementos[indice];
		indice--;
		return elemento;
	}

	public int numElementos() {
		return indice + 1;
	}

	public void imprimir() {
		System.out.println("\n");
		for (int i = 0; i <= indice; i++)
			System.out.print(elementos[i] + "/");
		System.out.println("");
	}

	public static void main(String[] args) {

		PilaLIFO_Mia p2 = new PilaLIFO_Mia(5); // Pongo un tope de 5 elementos
		/**
		 * Lleno toda la pila con un bucle for y si por ejemplo cambio el 5 por un 6 debe
		 * saltar el mensaje de que la pila esta llena
		 */
		for (int i = 1; i <= 5; i++) {
			p2.apilar(i);
		}

		p2.imprimir();// Muestro la pila

		System.out.println("Hay " + p2.numElementos() + " elementos en la pila.");
		if (p2.llena())
			System.out.println("La pila tiene " + p2.numElementos() + " elementos");
		if (!p2.llena())
			System.out.println("La pila está vacía.");

		// Vacía solo 3 elementos de la pila
		p2.desapilar();
		p2.desapilar();
		p2.desapilar();

		// Muestro los que han quedado y compruebo que al desapilar empieza por el final
		p2.imprimir();

		System.out.println("Hay " + p2.numElementos() + " elementos en la pila.");
		if (p2.vacia())
			System.out.println("La pila está vacía.");
		if (!p2.vacia())
			System.out.println("La pila tiene " + p2.numElementos() + " elementos");

		// Vacio los que quedan
		p2.desapilar();
		p2.desapilar();

		// Vuelvo a insertar números ahora de forma manual sin for
		p2.apilar(11);
		p2.apilar(22);
		p2.apilar(33);
		p2.apilar(44);
		p2.apilar(55);

		p2.imprimir();// Muestro la pila
	}
}