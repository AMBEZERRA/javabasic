package controle_Decisoes_Loops;

import java.util.Scanner;

public class Exercicio19_switch_case {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe num1");
		int num1 = scan.nextInt();
		
		System.out.println("Informe num2");
		int num2 = scan.nextInt();
		
		System.out.println("Qual operação deseja realizar?  1 - Multiplciação , 2 - Divisão , 3 - Soma ,  4  Subtração:");
		int  operacao = scan.nextInt();
		
		switch(operacao) {
		case 1: System.out.println("Multiplicação: " + (num1*num2));
		     if((num1 * num2) %2 == 0 ) {
		    	 System.out.println("Numero é par");
		     } else {
		    	 System.out.println("Número é impar");
		     }
		     
		     if(num1 * num2 >= 0) {
		    	 System.out.println("Número Positivo");
		     } else {
		    	 System.out.println("Número Negativo");
		     }
		
			break;
		
		case 2: System.out.println("Divisão: " + (num1 /num2));
	     if((num1 / num2) %2 == 0 ) {
	    	 System.out.println("Numero é par");
	     } else {
	    	 System.out.println("Número é impar");
	     }
	     
	     if(num1 / num2 >= 0) {
	    	 System.out.println("Número Positivo");
	     } else {
	    	 System.out.println("Número Negativo");
	     }
		  
		break;
		case 3: System.out.println("Soma: " + (num1 + num2));
		if((num1 + num2) %2 == 0 ) {
	    	 System.out.println("Numero é par");
	     } else {
	    	 System.out.println("Número é impar");
	     }
	     
	     if(num1 + num2 >= 0) {
	    	 System.out.println("Número Positivo");
	     } else {
	    	 System.out.println("Número Negativo");
	     }
		break;
		case 4: System.out.println("Subtração: " + (num1 - num2));
		if((num1 - num2) %2 == 0 ) {
	    	 System.out.println("Numero é par");
	     } else {
	    	 System.out.println("Número é impar");
	     }
	     
	     if(num1 - num2 >= 0) {
	    	 System.out.println("Número Positivo");
	     } else {
	    	 System.out.println("Número Negativo");
	     }
		break;
		default: System.out.println("Operação Inexixtente");
		
		
		}
		
		
	}

}
