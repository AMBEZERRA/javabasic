package controle_Decisoes_Loops;

import java.util.Scanner;

public class Exercicio19_switch_case {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe num1");
		int num1 = scan.nextInt();
		
		System.out.println("Informe num2");
		int num2 = scan.nextInt();
		
		System.out.println("Qual opera��o deseja realizar?  1 - Multiplcia��o , 2 - Divis�o , 3 - Soma ,  4  Subtra��o:");
		int  operacao = scan.nextInt();
		
		switch(operacao) {
		case 1: System.out.println("Multiplica��o: " + (num1*num2));
		     if((num1 * num2) %2 == 0 ) {
		    	 System.out.println("Numero � par");
		     } else {
		    	 System.out.println("N�mero � impar");
		     }
		     
		     if(num1 * num2 >= 0) {
		    	 System.out.println("N�mero Positivo");
		     } else {
		    	 System.out.println("N�mero Negativo");
		     }
		
			break;
		
		case 2: System.out.println("Divis�o: " + (num1 /num2));
	     if((num1 / num2) %2 == 0 ) {
	    	 System.out.println("Numero � par");
	     } else {
	    	 System.out.println("N�mero � impar");
	     }
	     
	     if(num1 / num2 >= 0) {
	    	 System.out.println("N�mero Positivo");
	     } else {
	    	 System.out.println("N�mero Negativo");
	     }
		  
		break;
		case 3: System.out.println("Soma: " + (num1 + num2));
		if((num1 + num2) %2 == 0 ) {
	    	 System.out.println("Numero � par");
	     } else {
	    	 System.out.println("N�mero � impar");
	     }
	     
	     if(num1 + num2 >= 0) {
	    	 System.out.println("N�mero Positivo");
	     } else {
	    	 System.out.println("N�mero Negativo");
	     }
		break;
		case 4: System.out.println("Subtra��o: " + (num1 - num2));
		if((num1 - num2) %2 == 0 ) {
	    	 System.out.println("Numero � par");
	     } else {
	    	 System.out.println("N�mero � impar");
	     }
	     
	     if(num1 - num2 >= 0) {
	    	 System.out.println("N�mero Positivo");
	     } else {
	    	 System.out.println("N�mero Negativo");
	     }
		break;
		default: System.out.println("Opera��o Inexixtente");
		
		
		}
		
		
	}

}
