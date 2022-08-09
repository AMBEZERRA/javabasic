package aula46Heranca_Interface_Exercicio1;

public class Triangulo extends Figura2D implements DimensaoSuperficial{

	private double base;
	private double altura;
	private double area; 
	
	
	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double getArea() {
		return area;
	}


	public void setArea(double area) {
		this.area = area;
	}


	@Override
	public void calcularArea() {
		area = (getAltura() * getBase()) /2; 
		
	}
	
	
	@Override
	public String toString() {
		
		return super.toString() + " , " + "Altura = " +  altura + " , " + "base = " +  base + " , " + "Calculo da área = " +  area;
	}
	

}
