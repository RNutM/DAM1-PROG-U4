package ejercicios_14_18_enero_2019;

public class Poligono {
	/**
	 * Polígono
	 * 
	 * @author Robert G
	 */
	//Variables privadas llamando a la clase Punto_pla
	private Punto_pla a;
	private Punto_pla b;
	private Punto_pla c;
	private Punto_pla d;
	
	/*Constructor llamando al método inicializar de la clase
	Punto_pla para pedir parámetros al usuario*/
	public Poligono() {
		a=new Punto_pla();
		a.inicializar();
		b=new Punto_pla();
		b.inicializar();
		c=new Punto_pla();
		c.inicializar();
		d=new Punto_pla();
		d.inicializar();
	}
	//Constructor
	public Poligono(Punto_pla a, Punto_pla b, Punto_pla c, Punto_pla d) {
			
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	
	//Método toString para mostrar el formato de salida
	public String toString() {
		return("Estos son los 4 puntos del poligono:("+a+","+b+","+c+","+d+")");
	}
	//Método main	
	public static void main(String[] args) {
			
		Poligono n=new Poligono();
		
		System.out.println(n.toString());
	}
}