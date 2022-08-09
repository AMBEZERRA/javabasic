package vetores_arrays;

import java.util.Scanner;

public class Exercicio7_Arrays_Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[10];

		for(int i=0; i < vetorA.length; i ++) {
			System.out.println("Informe o valor dos elementos de A : ");
			vetorA[i] = scan.nextInt();
		}
		
		for(int i=0; i < vetorB.length; i ++) {
			System.out.println("Informe o valor dos elementos de B : ");
			vetorB[i] = scan.nextInt();
		}
		
		for(int i=0; i < vetorC.length; i ++) {
			vetorC[i] = vetorA[i] -vetorB[i];
		}
		
		System.out.print("Os elementos de A são : ");
		for(int i=0; i < vetorA.length; i ++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Os elementos de B são : ");
		for(int i=0; i < vetorB.length; i ++) {
			System.out.print(vetorB[i] + " ");
		}
		
		System.out.println();
		System.out.print("Os elementos de C são : ");
		for(int i=0; i < vetorC.length; i ++) {
			System.out.print(vetorC[i] + " ");
		}

	}

}
