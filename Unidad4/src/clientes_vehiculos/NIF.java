package clientes_vehiculos;

public class NIF {
	/**
	 * Clase dedicada a comprobar nif y hallar su letra
	 * 
	 * @author Robert G
	 */
	public static final int DIMENSION_MAX = 9;
	public static final int DIVISOR = 23;
	public static String letras[] = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S",
			"Q", "V", "H", "L", "C", "K", "E" };
	public String nif;

	// Constructor al que se le pasa como parámetro el número del NIF
	public NIF(String nif) {
		setNif(nif);
	}

	// Método esCorrecto(String nif) que devuelve true si es correcto (longitud+letra) y
	// false si no
	public boolean esCorrecto(String nif) {
		boolean correcto = true;

		if (nif.length() == 9) {
			for (int i = 0; i < 8; i++) {
				if (Character.isLetter(nif.charAt(i))) {
					correcto = false;
				} else {
					if (Character.isLetter(nif.charAt(8))) {
						if (correcto) {
							correcto = true;
						}
					} else {
						correcto = false;
					}
				}
			}
		} else {
			correcto = false;
		}
		int numeronif = Integer.parseInt(nif.substring(0, 8));

		System.out.println("El numero es: " + numeronif);
		/*
		 * System.out.println("La letra del nif es: "+nif.charAt(8));
		 * System.out.println("La letra del array es: "+(letras[numeronif%23]).charAt(0));
		 */
		if (nif.charAt(8) == (letras[numeronif % 23]).charAt(0)) {
			System.out.println("La letra es correcta y es la : " + nif.charAt(8));
		}
		return correcto;
	}

	/*
	 * Método que comprueba mediante el método anterior si el DNI es correcto o no. Si no
	 * lo es se lanza una excepción: throw new IllegalArgumentException("NIF no válido");
	 */
	public void setNif(String nif) {

		if (esCorrecto(nif)) {
			this.nif = nif;
			System.out.println("El NIF introducido es correcto");
		} else {
			throw new IllegalArgumentException("El NIF introducido no es correcto");
		}
	}

	// Método para obtener la letra correcta de un DNI
	public static String obtenerletra(int numero) {
		int resto = numero % 23;
		System.out.println("La letra del dni es: " + letras[resto]);

		return letras[resto];
	}
}