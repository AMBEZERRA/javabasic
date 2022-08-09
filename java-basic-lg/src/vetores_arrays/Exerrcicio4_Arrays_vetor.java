package vetores_arrays;

import java.util.Scanner;

public class Exerrcicio4_Arrays_vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		 
		double[] vetorA = new double[15];
		double[] vetorB = new double[15];
		
		for(int i =0; i<vetorA.length; i++) {
			System.out.println("Informe os valores do Vetor A: ");
			vetorA[i] = scan.nextDouble();
		  	
		}
		
		for(int i =0; i<vetorB.length; i++) {
			vetorB[i] = Math.sqrt(vetorA[i]);
		  	
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
