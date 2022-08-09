package poo;

public class QuadradoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Quadrado quadrado = new Quadrado();
		quadrado.lado = 2;
		
		quadrado.mudarValorLado(3);
		quadrado.valorLado();
		quadrado.areaQuadrado();
		System.out.println(quadrado.areaQuadrado());

	}

}
