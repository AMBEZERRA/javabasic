package controle_Decisoes_Loops;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
 //Fa�a um Programa que pe�a 2 num e informe o mair deles
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o primeiro n�mero:");
		int num1 = scan.nextInt();

		System.out.println("Informe o segundo n�mero:");
		int num2 = scan.nextInt();
		
		if(num1 > num2) {
			System.out.println("Valor num1 � maior:" + num1);
		} else if (num2 > num1) {
			System.out.println("Valor num2 � maior:" + num2);
			
		} else if (num1 == num2) {
			System.out.println("Valores s�o iguais:" + num1);
		}
	}

}
