package poo;

public class Quadrado {
	
	int lado;
	
	
	public void valorLado() {
		System.out.println("Valor lado �: " + lado);
	}

	public void mudarValorLado(int novoValo) {
		lado = novoValo;
	}
	
	public int areaQuadrado() {
		return lado * lado;
		
	}
}
