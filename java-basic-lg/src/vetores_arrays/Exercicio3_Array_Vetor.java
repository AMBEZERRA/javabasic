package vetores_arrays;

import java.util.Scanner;

public class Exercicio3_Array_Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vetorA = new int[15];
		int[] vetorB = new int[15];
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("infome os valores da posição do Vetor A: " + i);
			vetorA[i] = scan.nextInt();
			
			}
		for(int i=0; i<vetorB.length; i++) {
			vetorB[i] = vetorA[i] * vetorA[i];
			}
		System.out.print("Vetor A = ");
		for(int i=0; i<vetorA.length;i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.print("Valor B = ");
		for(int i=0; i<vetorB.length;i++) {
			System.out.print(vetorB[i] + " ");
		}
		
	}

}
