package claseAbstracta;

public class Circulo extends Figura implements Figura1 {
	private double radio;

	public Circulo(double x, double y, double radio) {
		super(x, y);
		this.radio = radio;
	}

	public double area() {
		return Math.PI * (Math.pow(radio, 2));
	}

	public double area1() {
		return 0.0;
	}
}
