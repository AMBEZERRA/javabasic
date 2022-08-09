package controle_Decisoes_Loops;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Infore o numero");
		float num = scan.nextFloat();
		System.out.println("Informe o auxiliar");
		float aux = scan.nextFloat();
		
		if(num % 2 == 0) {
			System.out.println("Número é par");
		} else {
			System.out.println("Número é impar");
		}
		
				
	}

}
