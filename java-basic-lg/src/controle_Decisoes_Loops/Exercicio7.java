package controle_Decisoes_Loops;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
	
		//Fa�a um Programa que leia tr�s n�meros e mostre o maior e o menor deles.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digitie numero 1: ");
		int numero1 = scan.nextInt();
		
		System.out.println("Digitie numero 2: ");
		int numero2 = scan.nextInt();
		
		System.out.println("Digitie numero 3: ");
		int numero3 = scan.nextInt();
		
		if(numero1 >= numero2 && numero1 >=numero3) {
			System.out.println("Escreva numero1:" + numero1);
		} else if (numero2 >= numero1 && numero2 >= numero3) {
			System.out.println("Escarva numero2:" + numero2);
		}else {
			System.out.println("Escreva numero3:" + numero3);
		}
		
		if(numero1 <= numero2 && numero1 <= numero3) {
			System.out.println("Escreva numero1:" + numero1);
		} else if (numero2 <= numero1 && numero2 <= numero3) {
			System.out.println("Escarva numero2:" + numero2);
		}else {
			System.out.println("Escreva numero3:" + numero3);
		}
		
		
       
	}

}
