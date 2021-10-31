package herencias02;

public class Programador extends Empleado {

	private int lineasDeCodigoPorHora;
	private String lenguajeDominante;

	public Programador() {
		super();
		lineasDeCodigoPorHora = 0;
		lenguajeDominante = "";
	}

	public Programador(String nombre, String apellidos, String DNI, int edad, boolean casado, double salario,
			int lineasDeCodigoPorHora, String lenguajeDominante) {
		super(nombre, apellidos, DNI, edad, casado, salario);
		this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
		this.lenguajeDominante = lenguajeDominante;
	}

	public void ImprimirProgramador() {
		super.ImprimirDatosEmpleado();
		System.out.println("Lineas de codigo/hora " + this.lineasDeCodigoPorHora + "\nLenguaje Dominante: "
				+ this.lenguajeDominante);
	}
}
