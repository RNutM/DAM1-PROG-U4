package herencias02;

public class Prueba extends Empleado{

	public static void main(String[] args) {

		Empleado e=new Empleado("Roberto","Gutiérrez","11111111H",46,true,1000);
		
		e.clasificacion();
		e.ImprimirDatosEmpleado();
		e.AumentarSalario(20);
		
		Programador p=new Programador("Roberto","Gutiérrez","11111111H",46,true,1000,2000,"java");
		
		p.clasificacion();
		p.ImprimirProgramador();
		p.AumentarSalario(30);
	}
}
