package poo;

public class RetanguloTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Retangulo retangulo = new Retangulo();
		retangulo.altura = 5;
		retangulo.base = 6;
		
		
		retangulo.trocarValor(4, 5);
		retangulo.retornarValor();
		retangulo.calcularArea();
		retangulo.perimetro();
       System.out.println(" O valor da área é: "  + retangulo.calcularArea());
       System.out.println(" O valor da área é: "  + retangulo.perimetro());
	}

}
