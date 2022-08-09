package aula46Heranca_Interface_Exercicio1;

public class Cilindro extends Figura3D implements DimensaoVolume{

	public final double PI = 3.14;
	private double r;
	private double h;
	private double volume;
	
	
	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getPI() {
		return PI;
	}

	@Override
	public void calcularVolume() {
		volume = PI * Math.pow(r, 2)  * h;
		
	}

	@Override
	public String toString() {
		return "Cilindro [PI=" + PI + ", r=" + r + ", h=" + h + ", volume=" + volume + "]" + " ," + super.toString();
	}
	

	
}
