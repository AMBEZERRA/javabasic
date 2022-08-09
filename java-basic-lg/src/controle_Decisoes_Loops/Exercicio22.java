package controle_Decisoes_Loops;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		// Frutaria 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a qtd (kg) de morango:");
		double qtdMorango = scan.nextDouble();
		
		System.out.println("Informe a qtd (kg) de Maçãs:");
		double qtdMacas = scan.nextDouble();
		
		double precoKgMorango =0;
		
		if(qtdMorango <=5) {
			precoKgMorango = 2.5;
		} else {
			precoKgMorango = 2.20;
		}
		
		double precoKgMacas=0;
		if (qtdMacas <=5) {
			precoKgMacas = 1.80;
		} else {
			precoKgMacas = 1.50;
		}
		
		double precoTotalMorango = qtdMorango * precoKgMorango;
		double precoTotalMacas = qtdMacas * precoKgMacas;
		
		
		double precoParcial = precoTotalMacas + precoTotalMorango;
		double precoTotal = precoParcial;
		if((qtdMorango + qtdMacas > 8) || precoParcial > 25) {
	       precoTotal = precoParcial - ((precoParcial/100)*10);		
		}
		
		System.out.println("Preco total:" + precoTotal);

	}

}
