package claseAbstracta;

public class Main {
	/**
	 * Pruebas de polimorfismo y clases abstractas
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		Circulo c = new Circulo(1, 2, 5);
		Cuadrado c2 = new Cuadrado(0, 0, 3);
		System.out.println("El área del círculo es: " + c.area());
		System.out.println("El área del cuadrado es: " + c2.area());

		// Ejecuta los métodos de finalización de cualquier objeto pendiente de finalización.
		System.runFinalization();
		// Ejecuta el recolector de basura.
		System.gc(); // Garbage Collector
	}
}

/**
 * Ejecuta los métodos de finalización de cualquier objeto pendiente de finalización.
 * Llamar a este método sugiere que la máquina virtual Java se esfuerce por ejecutar
 * los métodos de finalización de los objetos que se han encontrado descartados pero
 * cuyos métodos de finalización aún no se han ejecutado. Cuando el control regresa
 * de la llamada al método, Java Virtual Machine ha hecho un gran esfuerzo para
 * completar todas las finalizaciones pendientes.
 * 
 * Ejecuta el recolector de basura. Llamar al método gc sugiere que Java
 * VirtualMachine se esfuerza por reciclar los objetos no utilizados para que la
 * memoria que ocupan actualmente esté disponible para su rápida reutilización.
 * Cuando el control regresa de la llamada al método, Java VirtualMachine ha hecho un
 * gran esfuerzo para recuperar espacio de todos los objetos descartados.
 * 
 */
