package extras;

import java.util.Scanner;

public class Racional {
	/**
	 * Crea una clase en Java donde el usuario introduzca el numerador y el denominador
	 * para realizar operaciones con fracciones y además simplifique los resultados.
	 * 
	 * @author Robert G
	 */
	private int num; // numerador
	private int den; // denominador

	// Método simplificar fracciones
	public void simplifica() {

		int limite;
		if (this.num > this.den)
			limite = this.num;
		else
			limite = this.den;

		int i = (int) limite / 2;

		// System.out.println("i vale "+i);
		while (i > 0) {

			if (this.num % i == 0 && this.den % i == 0) {
				this.num = this.num / i;
				this.den = this.den / i;
			}
			i--;
		}
	}

	public Racional() {
		this.num = 1;
		this.den = 1;
	}

	public Racional(int num, int den) {
		this.num = num;
		if (den != 0)
			this.den = den;
		else
			System.out.println(">>>ERROR El número no es correcto");
	}

	public String toString() {
		return (num + "/" + den);
	}

	public void imprimir() {
		System.out.println("El número es: " + this.toString());
	}

	public void impri_prod() {
		System.out.println("El producto de las fracciones es: " + this.toString());
	}

	public void impri_div() {
		System.out.println("El cociente de las fracciones es: " + this.toString());
	}

	public void impri_sum() {
		System.out.println("La suma de las fracciones es: " + this.toString());
	}

	public void impri_res() {
		System.out.println("La resta de las fracciones es: " + this.toString());
	}

	// Método para multiplicar fracciones
	public Racional producto(Racional a) {

		int n = this.num * a.num;
		int d = this.den * a.den;

		Racional r = new Racional(n, d);
		r.simplifica();
		return r;
	}

	// Método para dividir fracciones
	public Racional division(Racional a) {

		int n = this.num * a.den;
		int d = this.den * a.num;

		Racional r = new Racional(n, d);
		r.simplifica();
		return r;
	}

	// Método para sumar fracciones
	public Racional sumar(Racional a) {
		int n, d;
		if (this.den == a.den) {
			n = this.num + a.num;
			d = a.den;

		} else {
			n = this.num * a.den + this.den * a.num;
			d = this.den * a.den;
		}

		Racional r = new Racional(n, d);
		r.simplifica();
		return r;
	}

	// Método para restar fracciones
	public Racional restar(Racional a) {
		int n, d;
		if (this.den == a.den) {
			n = this.num - a.num;
			d = a.den;

		} else {
			n = this.num * a.den - this.den * a.num;
			d = this.den * a.den;
		}

		Racional r = new Racional(n, d);
		r.simplifica();
		return r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce primer numerador: ");
		int n = sc.nextInt();
		System.out.println("Introduce primer denominador: ");
		int d = sc.nextInt();

		Racional r1 = new Racional(n, d);
		r1.imprimir();

		System.out.println("Introduce segundo numerador: ");
		n = sc.nextInt();
		System.out.println("Introduce segundo denominador: ");
		d = sc.nextInt();

		sc.close();

		Racional r2 = new Racional(n, d);
		r2.imprimir();

		// Racional r1=new Racional(1,3);
		// r1.imprimir();
		// Racional r2=new Racional(1,5);
		// r2.imprimir();
		Racional r3 = (r1.producto(r2));
		r3.impri_prod();
		Racional r4 = (r1.division(r2));
		r4.impri_div();
		Racional r5 = (r1.sumar(r2));
		r5.impri_sum();
		Racional r6 = (r1.restar(r2));
		r6.impri_res();
	}
}
