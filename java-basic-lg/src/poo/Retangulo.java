package poo;

public class Retangulo {

	int base;
	int altura;
	
	void trocarValor(int novaBase, int novaAltura) {
		base = novaBase;
		altura = novaAltura;
	}
	
	void retornarValor() {
		System.out.println("O valor da base é: " +  base + "," +  "O valor da altura é:" + altura);
	}
	
	int calcularArea() {
		int area;
		area =  base * altura;
		return area;
	}
	
	int perimetro() {
		int area;
		int perimetro;
		area =  base * altura;
		perimetro = 2*area;
		return perimetro;
	}
}
