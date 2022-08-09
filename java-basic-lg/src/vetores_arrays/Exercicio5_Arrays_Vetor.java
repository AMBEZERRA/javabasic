package vetores_arrays;

import java.util.Scanner;

public abstract class Exercicio5_Arrays_Vetor {

	public static void main(String[] args) {
		//Criar um vetor A com 15 elementos... E um b com o mesmo número elementos , 
		//mas que os elementos sejam os elementos de A multiplciado pela sua posição. 
		
		Scanner scan = new Scanner(System.in);
		 
		double[] vetorA = new double[15];
		double[] vetorB = new double[15];
		
		for(int i =0; i<vetorA.length; i++) {
			System.out.println("Informe os valores do Vetor A: ");
			vetorA[i] = scan.nextDouble();
		  	
		}
		
		for(int i =0; i<vetorB.length; i++) {
			vetorB[i] = vetorA[i] *i;
		  	
		}
		
		System.out.print("O vetor A é = " );
		for(int i =0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] +   " " );
		}
		
		System.out.println();
		
		System.out.print("O vetor B é = " );
		for(int i =0; i<vetorB.length; i++) {
			System.out.print(vetorB[i] +   " " );
		}
		

	}

}
