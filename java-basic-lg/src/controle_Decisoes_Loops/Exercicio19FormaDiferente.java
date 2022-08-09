package controle_Decisoes_Loops;

import java.util.Scanner;

public class Exercicio19FormaDiferente {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe num1");
		int num1 = scan.nextInt();
		
		System.out.println("Informe num2");
		int num2 = scan.nextInt();
		
		System.out.println("Qual operação deseja realizar?  1 - Multiplciação , 2 - Divisão , 3 - Soma ,  4  Subtração:");
		String operacao = scan.next();

		double resultado = 0;
		boolean valida = true;
		
		switch (operacao){
		 case "+": resultado = num1 + num2; break;
		 case "-": resultado = num1 - num2; break;
		 case "*": resultado = num1 * num2; break;
		 case "/": resultado = num1 / num2; break;
		default: 
			System.out.println("Operação Inválida");
			valida = false;
		
		
		if(valida) {
			if(resultado >= 0) {
				System.out.println("Resultado positivo" + resultado);
			} else {
				System.out.println("Resultado negativo" + resultado);
			}
			
			if(resultado %2 ==0) {
				System.out.println("resultado Par" );
			} else {
				System.out.println("Resultado Impar");
			}
		}
		
		
		
		}
	}

}
