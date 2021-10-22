package ejercicios_14_18_enero_2019;

public class smartphone {
	/**
	 * Un teléfono móvil (en una tienda de telefonía)
	 * 
	 * @author Robert G
	 */
	private String sistema;
	private float pantalla;
	private float peso;
	private String procesador;
	private int RAM;
	private int almacenamiento;
	private int bateria;
	private String camara;
	private float precio;

	//Constructor sin valores
	public smartphone(String s, float pa, float pe, String pro, int r, int a, int b, String c, float pre) {
		sistema=s;
		pantalla=pa;
		peso=pe;
		procesador=pro;
		RAM=r;
		almacenamiento=a;
		bateria=b;
		camara=c;
		precio=pre;
	}
	//Getters & Setters, veo que no son necesarios para mostrar por consola el restultado
	
	//Método toString
	public String toString() {
		return "Smartphone [Sistema= "+sistema+", Pantalla= "+pantalla+"'"+", Peso= "+peso+"g"+",\n"+
				 " Procesador= "+procesador+", RAM= "+RAM+"Gb, Almacenamiento= "+almacenamiento+"Gb"+",\n"
						+ " Batería= "+bateria+"mAh, Camara= "+camara+","
						+ " Precio= "+precio+"€]";
	}
	//Método main
	public static void main(String[] args) {

		smartphone s=new smartphone("Android 9 Pie", 6.5f, 139, "Snapdragon 845 GPU Adreno 630",
				6, 128, 3900, "Triple camara 20Mpx",899);
		
		System.out.println(s.toString());
	}
}