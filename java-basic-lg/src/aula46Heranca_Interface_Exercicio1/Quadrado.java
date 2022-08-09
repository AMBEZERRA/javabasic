package aula46Heranca_Interface_Exercicio1;

public class Quadrado extends Figura2D implements DimensaoSuperficial {

	private double lado;
	private double area;
	
	
	
	
	


	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}


	public double getArea() {
		return area;
	}


	public void setArea(double area) {
		this.area = area;
	}


	@Override
	public void calcularArea() {
		area = Math.pow(2, lado);
				
	}


	@Override
	public String toString() {
		return "Quadrado [lado=" + lado + " , " + "area= " + area + "]"  + super.toString();
	}
	
	

}
