package exercicio_loops_for_while_do;

public class Exercicio4_loop {

	public static void main(String[] args) {
		/*4.Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3%
		e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%.
		Faça um programa que calcule e escreva o número de anos necessários para que a população do país
		A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.*/

		int populacaoA = 80000;
		int populacaoB = 200000;
		int cont = 0;
		
		while(populacaoA < populacaoB) {
			populacaoA += (populacaoA * 3) /100;
			populacaoB += (populacaoB * 1.5) /100 ;
			cont++;
		}
		
		System.out.println("População A:" + populacaoA);
		System.out.println("População B:" + populacaoB);
		System.out.println("Quantidade de Anos: " + cont);
		
	}

}
