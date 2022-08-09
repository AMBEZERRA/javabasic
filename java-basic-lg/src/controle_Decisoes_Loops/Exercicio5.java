package controle_Decisoes_Loops;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nota 1: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Nota 2: ");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2)/2;
		
		if (media >= 7) {
			System.out.println("Aluno Aprovado");
		}else if (media < 7 && media >= 5) {
			System.out.println("Alunno em recuperação");
		} else {
			System.out.println("Aluno Reprovado");
		}
		
		
	}

}
