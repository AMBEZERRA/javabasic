package exercicio_loops_for_while_do;

public class Exercicio4_loop {

	public static void main(String[] args) {
		/*4.Supondo que a popula��o de um pa�s A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3%
		e que a popula��o de B seja 200000 habitantes com uma taxa de crescimento de 1.5%.
		Fa�a um programa que calcule e escreva o n�mero de anos necess�rios para que a popula��o do pa�s
		A ultrapasse ou iguale a popula��o do pa�s B, mantidas as taxas de crescimento.*/

		int populacaoA = 80000;
		int populacaoB = 200000;
		int cont = 0;
		
		while(populacaoA < populacaoB) {
			populacaoA += (populacaoA * 3) /100;
			populacaoB += (populacaoB * 1.5) /100 ;
			cont++;
		}
		
		System.out.println("Popula��o A:" + populacaoA);
		System.out.println("Popula��o B:" + populacaoB);
		System.out.println("Quantidade de Anos: " + cont);
		
	}

}
