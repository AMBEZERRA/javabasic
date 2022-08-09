package controle_Decisoes_Loops;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		// Faça um Programa que leia três números e mostre-os em ordem decrescente.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digitie numero 1: ");
		int num1 = scan.nextInt();
		
		System.out.println("Digitie numero 2: ");
		int num2 = scan.nextInt();
		
		System.out.println("Digitie numero 3: ");
		int num3 = scan.nextInt();
		
		if(num1 <= num2 && num1 <= num3 && num2 <= num3) {
			//num1 é menor
			//num3 é maior
		    //num1 < num2 < num3
			System.out.println(num3 + " - " + num2 + " - " + num1);
			
		} else if(num1 <= num2 && num1 <= num3 && num3 <= num2) {
			//num1 é menor
			//num2 é maior
		    //num1 < num3 < num2
			System.out.println(num2 + " - " + num3 + " - " + num1);
			
		} else if(num1 <= num2 && num1 <= num3 && num1 <= num3) {
			//num2 é menor
			//num3 é maior
		    //num2 < num1 < num3
			System.out.println(num3 + " - " + num1 + " - " + num2);

	    } else if(num1 <= num2 && num1 <= num3 && num3 <= num1) {
		//num2 é menor
		//num1 é maior
	    //num2 < num3 < num1
		System.out.println(num1 + " - " + num3 + " - " + num2);

        }   else if(num3 <= num2 && num3 <= num2 && num1 <= num2) {
	//num3 é menor
	//num2 é maior
    //num3 < num1 < num2
	System.out.println(num2 + " - " + num1 + " - " + num3);

        }

    }
 }
