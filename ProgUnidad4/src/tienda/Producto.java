package tienda;

//Esta es la clase padre(Abstracta)
public abstract class Producto {
	
	//En adelante app = aplicación o programa
	public String nombre;//Nombre de la app de cara al cliente
	public int codproduc;//Codigo de la app de cara al cliente
	public double precio;//Precio de la app de cara al cliente
	public String proveedor;//Empresa que desarrolla la app
	public int codprovee;//Código de articulo de proveedor de la app
	public int nunids;//Cantidad adquirida
	public double importe;//Importe total dependiendo de la cantidad adquirida
	
	//Constructor sin parámetros
	public Producto() {
		nombre="";
		codproduc=0;
		nunids=0;
		precio=0.0;
		proveedor="";
		codprovee=0;
		importe=0.0;
	}
	//Constructor con parámetros
	public Producto(int codproduc, String nombre, int nunids, double precio) {
		this.codproduc=codproduc;
		this.nombre=nombre;
		this.nunids=nunids;
		this.precio=precio;
		importe=nunids*precio;
	}
		
	//Getters & Setters	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodproduc() {
		return codproduc;
	}

	public void setCodproduc(int codproduc) {
		this.codproduc = codproduc;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public int getCodprovee() {
		return codprovee;
	}

	public void setCodprovee(int codprovee) {
		this.codprovee = codprovee;
	}

	public int getNunids() {
		return nunids;
	}

	public void setNunids(int nunids) {
		this.nunids = nunids;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}
}