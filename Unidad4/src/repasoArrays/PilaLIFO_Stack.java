package repasoArrays;

import java.util.Stack;

public class PilaLIFO_Stack {
	/**
	 * Probando con la clase Stack y sus métodos push para insertar elementos y pop para
	 * vaciar elementos
	 * 
	 */
	public PilaLIFO_Stack() {
	}

	public static void main(String[] args) {

		// La clase Stack representa a una estructura de datos que sea una pila.
		Stack<String> pila = new Stack<String>();

		// El método push inserta elementos en la pila
		for (int x = 1; x <= 10; x++)
			pila.push(Integer.toString(x));

		// El método empty comprueba si no quedan elementos en la pila. Es decir, si está
		// vacía.
		while (!pila.empty())
			System.out.println(pila.pop());
		// El método pop desapila un elemento a la pila, retirándolo de la misma.
	}
}
