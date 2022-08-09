package controle_Decisoes_Loops;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		/* Fa�a um programa que l� as duas notas parciais obtidas por um aluno numa disciplina 
		ao longo de um semestre, e calcule a sua m�dia. A atribui��o de conceitos obedece
		� tabela abaixo:
		  M�dia de Aproveitamento  Conceito
		  Entre 9.0 e 10.0        A
		  Entre 7.5 e 9.0         B
		  Entre 6.0 e 7.5         C
		  Entre 4.0 e 6.0         D
		  Entre 4.0 e zero        E
		O algoritmo deve mostrar na tela as notas, a m�dia, o conceito correspondente e a 
		mensagem �APROVADO� se o conceito for A, B ou C ou �REPROVADO� se o conceito for D ou E.
        */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 = scan.nextDouble();
		double media = (nota1 + nota2)/2;
		
		if(media >= 9 && media <=10) {
			System.out.println("Valor da m�dia �: = " + media);
			System.out.println("Coceito:" + 'A' );
			System.out.println("Aprovado");
			
		}else  if(media >= 7.5 && media <=9) {
			System.out.println("Valor da m�dia �: = " + media);
			System.out.println("Coceito:" + 'B' );
			System.out.println("Aprovado");
			
		} else if(media >= 6 && media <= 7.5) {
			System.out.println("Valor da m�dia �: = " + media);
			System.out.println("Coceito:" + 'C' );
			System.out.println("Aprovado");
			
		} else if(media >= 4 && media <= 6) {
			System.out.println("Valor da m�dia �: = " + media);
			System.out.println("Coceito:" + 'D' );
			System.out.println("Reprovado");
		} else  {
			System.out.println("Valor da m�dia �: = " + media);
			System.out.println("Coceito:" + 'E' );
			System.out.println("Reprovado");
		}
		
		
	}

}
