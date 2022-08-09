 package controle_Decisoes_Loops;

import java.util.Scanner;

public class Controle_If_Else {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o valor do Produto:");
		int valor = scan.nextInt();
		if(valor <= 10) {
			System.out.println("Produto Barato");
		} else if (valor > 10 && valor < 15){
			System.out.println("Pedir desconto no Produto");
		} else if (valor >= 15 && valor <= 17) {
			System.out.println("Pesquisar mais o valor do Produto");
		}  else if (valor > 17) {
			System.out.println("Valor acima da média do mercado, não efetue a compra do Produto");
		}

		// bdarto <=10 
		// 10 < valor < 15 pedir desconto
		// 15 <= valor 17 - pesquisar mais 
		// >= 17 muito caro
	}

}
