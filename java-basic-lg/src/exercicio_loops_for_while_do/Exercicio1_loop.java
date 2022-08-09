package exercicio_loops_for_while_do;

import java.util.Scanner;

public class Exercicio1_loop {

	public static void main(String[] args) {
		// Faça um programa que peça uma nota, entre zero e dez. 
		// Mostre uma mensagem caso o valor seja inválido e continue pedindo
		//até que o usuário informe um valor válido.

		Scanner scan = new Scanner(System.in);
		
		boolean notaValida = false;
		
		do {
		
		System.out.println("Informe o valor da nota: "); 
		 double nota = scan.nextDouble();
		 
			 if (nota >= 0 && nota <= 10) {
				 notaValida = true;
			 System.out.println("A nota é: " + nota);
			 } else {
				 notaValida = false;
				 System.out.println("Nota inválida digite novamente. " );
			 }
		} while(notaValida == false);
		
		
		 }

	}