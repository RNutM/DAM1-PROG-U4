package herencias02;

public class Empleado {

	private String nombre = "";
	private String apellidos = "";
	private String DNI = "";
	private int edad = 0;
	private boolean casado = false;
	private double salario = 0.0;

	public Empleado() {
	}

	public Empleado(String nombre, String apellidos, String DNI, int edad, boolean casado, double salario) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.DNI = DNI;
		this.edad = edad;
		this.casado = casado;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void clasificacion() {
		if (edad <= 21) {
			System.out.println("Principiante");
		} else if (edad >= 22 && edad <= 35) {
			System.out.println("Intermedio");
		} else if (edad > 35) {
			System.out.println("Senior");
		}
	}

	public void ImprimirDatosEmpleado() {
		System.out.println("Datos Empleado: \n " + this.nombre + " " + this.apellidos + " " + this.DNI + " " + this.edad
				+ " " + this.casado + " " + this.salario);
	}

	public void AumentarSalario(double porcentaje) {
		this.salario = this.salario + ((this.salario) * porcentaje / 100);
		System.out.println("Aumento de salario: " + this.salario);
	}
}
