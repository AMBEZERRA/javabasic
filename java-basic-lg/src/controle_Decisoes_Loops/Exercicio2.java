package controle_Decisoes_Loops;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

	//Fa�a um Programa que pe�a um valor e mostre na tela se o valor � positivo ou negativo.
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor:");
	    float num = scan.nextFloat();
	    
	   if(num < 0) {
		   System.out.println("Valor digitado � negativo:");
	   } else {
		   System.out.println("Valor digitado � positivo;");
	   }
	   
	   
	}

}
