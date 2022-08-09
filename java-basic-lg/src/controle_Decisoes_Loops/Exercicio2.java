package controle_Decisoes_Loops;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

	//Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor:");
	    float num = scan.nextFloat();
	    
	   if(num < 0) {
		   System.out.println("Valor digitado é negativo:");
	   } else {
		   System.out.println("Valor digitado é positivo;");
	   }
	   
	   
	}

}
