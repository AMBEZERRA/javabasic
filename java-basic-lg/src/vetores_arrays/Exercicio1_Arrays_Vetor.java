package vetores_arrays;

import java.util.Scanner;

public class Exercicio1_Arrays_Vetor {

	public static void main(String[] args) {
// Criar um vetor A com 8 lementos inteiros. E um b de mesmo tamanho e com os elementos do vetor A mutiplicado por 2.
	
		
	int[] vetorA = new int[4];
	int[] vetorB = new int[4];
	Scanner scan = new Scanner(System.in);
	
	for(int i=0; i<vetorA.length; i++) {
		System.out.println("infome os valores da posição do Vetor A: " + i);
		vetorA[i] = scan.nextInt();
		
		}
	for(int i=0; i<vetorB.length; i++) {
		vetorB[i] = vetorA[i] * 2;
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
