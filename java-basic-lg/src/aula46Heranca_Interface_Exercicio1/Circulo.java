package aula46Heranca_Interface_Exercicio1;

public class Circulo extends Figura2D implements DimensaoSuperficial {

	public final double PI = 3.14;
	private double raio;
	private double area;
	
	
	public double getArea() {
		return area;
	}



	public void setArea(double area) {
		this.area = area;
	}



	public double getRaio() {
		return raio;
	}



	public void setRaio(double raio) {
		this.raio = raio;
	}



	public double getPI() {
		return PI;
	}



	@Override
	public void calcularArea() {
		
		//area = (getRaio() * getRaio())*(PI); ou
		area = (Math.pow(raio, 2)) *PI;
		
	}



	@Override
	public String toString() {
		return "Circulo [PI=" + PI + ", raio=" + raio + ", area=" + area + " , " + super.toString()  + "]";
	}
	
	

}
