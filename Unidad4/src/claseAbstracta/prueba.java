package claseAbstracta;

public class prueba {
	/**
	 * Pruebas de polimorfismo y clases abstractas
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		Circulo c = new Circulo(1, 2, 5);
		Cuadrado c2 = new Cuadrado(0, 0, 3);
		System.out.println("El area del circulo es: " + c.area());
		System.out.println("El area del cuadrado es: " + c2.area());
	}
}
