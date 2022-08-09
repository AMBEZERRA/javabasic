package controle_Decisoes_Loops;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
 //Faça um Programa que peça 2 num e informe o mair deles
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o primeiro número:");
		int num1 = scan.nextInt();

		System.out.println("Informe o segundo número:");
		int num2 = scan.nextInt();
		
		if(num1 > num2) {
			System.out.println("Valor num1 é maior:" + num1);
		} else if (num2 > num1) {
			System.out.println("Valor num2 é maior:" + num2);
			
		} else if (num1 == num2) {
			System.out.println("Valores são iguais:" + num1);
		}
	}

}
