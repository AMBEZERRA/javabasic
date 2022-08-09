package aula46Heranca_Interface_Exercicio1;

public class Cubo extends Figura3D implements DimensaoVolume{

	private double volume;
	private double a;
	
	
	
	
	public double getVolume() {
		return volume;
	}


	public void setVolume(double volume) {
		this.volume = volume;
	}


	public double getA() {
		return a;
	}


	public void setA(double a) {
		this.a = a;
	}


	@Override
	public void calcularVolume() {
		volume = a *a *a;
		
	}


	@Override
	public String toString() {
		return "Cubo [volume=" + volume + ", a=" + a + "]" + " , " + super.toString();
	}

	
}
