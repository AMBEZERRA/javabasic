package exercicio_loops_for_while_do;

import java.util.Scanner;

public class Exercicio5_loop {

	public static void main(String[] args) {
		// Mesmo probelma que o anterior ... muda apenas as entradas de dados.
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o número de habitantes da população A");
		double populacaoA = scan.nextDouble();
		
		System.out.println("Informe o número de habitantes da população B");
		double populacaoB = scan.nextDouble();
		
		System.out.println("Informe a taxa de Crescimento de A");
		double taxaCresA = scan.nextDouble();
		
		System.out.println("Informe a taxa de Crescimento de B");
		double taxaCresB = scan.nextDouble();
		
		int cont = 0;
		
		while(populacaoA < populacaoB) {
			populacaoA += (populacaoA / 100) *taxaCresA;
			populacaoB += (populacaoB /100) *taxaCresB;
			cont++;
		}
		
		System.out.println("População A:" + populacaoA);
		System.out.println("População B:" + populacaoB);
		System.out.println("Quantidade de Anos: " + cont);
		

	}

}
