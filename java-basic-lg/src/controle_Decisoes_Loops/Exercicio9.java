package controle_Decisoes_Loops;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		// Fa�a um Programa que leia tr�s n�meros e mostre-os em ordem decrescente.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digitie numero 1: ");
		int num1 = scan.nextInt();
		
		System.out.println("Digitie numero 2: ");
		int num2 = scan.nextInt();
		
		System.out.println("Digitie numero 3: ");
		int num3 = scan.nextInt();
		
		if(num1 <= num2 && num1 <= num3 && num2 <= num3) {
			//num1 � menor
			//num3 � maior
		    //num1 < num2 < num3
			System.out.println(num3 + " - " + num2 + " - " + num1);
			
		} else if(num1 <= num2 && num1 <= num3 && num3 <= num2) {
			//num1 � menor
			//num2 � maior
		    //num1 < num3 < num2
			System.out.println(num2 + " - " + num3 + " - " + num1);
			
		} else if(num1 <= num2 && num1 <= num3 && num1 <= num3) {
			//num2 � menor
			//num3 � maior
		    //num2 < num1 < num3
			System.out.println(num3 + " - " + num1 + " - " + num2);

	    } else if(num1 <= num2 && num1 <= num3 && num3 <= num1) {
		//num2 � menor
		//num1 � maior
	    //num2 < num3 < num1
		System.out.println(num1 + " - " + num3 + " - " + num2);

        }   else if(num3 <= num2 && num3 <= num2 && num1 <= num2) {
	//num3 � menor
	//num2 � maior
    //num3 < num1 < num2
	System.out.println(num2 + " - " + num1 + " - " + num3);

        }

    }
 }
