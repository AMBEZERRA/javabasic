package exercicio_loops_for_while_do;

import java.util.Scanner;

public class Exercicio1_loop {

	public static void main(String[] args) {
		// Fa�a um programa que pe�a uma nota, entre zero e dez. 
		// Mostre uma mensagem caso o valor seja inv�lido e continue pedindo
		//at� que o usu�rio informe um valor v�lido.

		Scanner scan = new Scanner(System.in);
		
		boolean notaValida = false;
		
		do {
		
		System.out.println("Informe o valor da nota: "); 
		 double nota = scan.nextDouble();
		 
			 if (nota >= 0 && nota <= 10) {
				 notaValida = true;
			 System.out.println("A nota �: " + nota);
			 } else {
				 notaValida = false;
				 System.out.println("Nota inv�lida digite novamente. " );
			 }
		} while(notaValida == false);
		
		
		 }

	}