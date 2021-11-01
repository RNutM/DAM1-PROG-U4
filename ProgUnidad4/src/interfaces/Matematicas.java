package interfaces;

import java.util.Arrays;

public class Matematicas implements MathArray {
	/**
	 * Clase Matemáticas
	 * 
	 * @author Robert G
	 */
	public static final double GAMMA = 0.57721566490153286;
	public static final double RAID_2 = 1.414213562373095;

	public int factorial(int n) {
		int fact = 1;
		for (int i = n; i > 0; i--) {
			fact *= i;
		}
		return fact;
	}

	public int random(int n1, int n2) {
		double aleatorio = Math.random();
		aleatorio *= Math.abs(n2 - n1);
		aleatorio += (double) n1;
		return (int) aleatorio;
	}

	@Override
	public int min1(int[] array) {
		Arrays.sort(array);
		return array[0];
	}

	@Override
	public int max1(int[] array) {
		Arrays.sort(array);
		return array[array.length - 1];
	}

	@Override
	public int sum1(int[] array) {
		int suma = 0;
		for (int i = 0; i < array.length; i++)
			suma += array[i];
		return suma;
	}

	public static void main(String[] args) {

		int[] array = { 5, 3, 3, 9, 7, 22 };
		Matematicas m = new Matematicas();
		System.out.println("El menor elemento es: " + m.min1(array));
		System.out.println("El mayor elemento es: " + m.max1(array));
		System.out.println("La suma de elementos es: " + m.sum1(array));
		System.out.println("Un aleatorio entre 10 y 20 es: " + m.random(10, 20));
		System.out.println("El factorial es: " + m.factorial(6));
	}
}
