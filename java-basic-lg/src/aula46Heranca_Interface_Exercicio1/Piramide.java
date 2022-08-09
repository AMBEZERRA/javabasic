package aula46Heranca_Interface_Exercicio1;

public class Piramide extends Figura3D implements DimensaoVolume{

	private double aB;
	private double h;
	private double area;
	
	
	
	
	public double getaB() {
		return aB;
	}




	public void setaB(double aB) {
		this.aB = aB;
	}




	public double getH() {
		return h;
	}




	public void setH(double h) {
		this.h = h;
	}




	public double getArea() {
		return area;
	}




	public void setArea(double area) {
		this.area = area;
	}




	@Override
	public void calcularVolume() {
		area = (getaB() * getH()) /3;
		
	}




	@Override
	public String toString() {
		return "Piramide [aB=" + aB + ", h=" + h + ", area=" + area + ", " + super.toString() +  "]";
	}
	
	

}
