package vetores_arrays;

import java.util.Scanner;

public class Exercicio_Arrays_Vetor {

	public static void main(String[] args) {
		// Crie um vetor A com 5 elementos inteiros. E um vetor B com os mesmos elementos do veto A.

		
		/*int[] vetA = new int[5];
		vetA[0]= 1;
		vetA[1]= 2;
		vetA[2]= 3;
		vetA[3]= 4;
		vetA[4]= 5;
		
		int[] vetB = new int[5];
		vetB = vetA;
		for(int i = 0; i<vetA.length; i++)
		System.out.println("imprimindo os elementos do Vetor A: " + (i+1) + " É: " + vetA[i]);
		
		for(int i = 0; i<vetB.length; i++)
			System.out.println("imprimindo os elementos do Vetor B: " + (i+1) +  " É " + vetB[i]);
		//System.out.println("Vetor B: "  + vetB[0]);*/
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetA = new int[5];
		int[] vetB = new int[5];

		for(int i=0; i <vetA.length; i++) {
			System.out.println("Entre com os valores da posição: " + i);
			vetA[i] = scan.nextInt();
						
			}
		for(int i=0; i <vetB.length; i++) {
			vetB[i] = vetA[i];
						
			}
		
		System.out.print("Vetor A = ");
		for(int i=0; i <vetA.length; i++) {
			System.out.print(vetA[i] + " ");
		}
	
		System.out.print("Vetor B = ");
		for(int i=0; i <vetB.length; i++) {
			System.out.print(vetB[i] + " ");
		}
	}

}
