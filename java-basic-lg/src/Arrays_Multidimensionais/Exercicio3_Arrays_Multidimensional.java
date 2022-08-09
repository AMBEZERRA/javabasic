package Arrays_Multidimensionais;

import java.util.Scanner;

public class Exercicio3_Arrays_Multidimensional {

	public static void main(String[] args) {
		
		int [][] matriz1 = new int [3][3];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<matriz1.length; i++) {
			for(int j=0; j<matriz1[i].length; j++) {
				
				System.out.print("Informe os Números da Matriz1 [" + i + " ," + j + "]" );
				matriz1[i][j]= scan.nextInt();
				
				}
			}
		int qtdPares = 0;
		int qtdImpares = 0;
			 
		for(int i=0; i<matriz1.length; i++) {
			for(int j=0; j<matriz1[i].length; j++) {
				if(matriz1[i][j] %2==0) {
					qtdPares ++;
				}
				else {
					qtdImpares++;
				}
			}
		   
		}
		
		for(int i=0; i<matriz1.length; i++) {
			for(int j=0; j<matriz1[i].length; j++) {
			System.out.print(matriz1[i][j] + ",");	
			}
			System.out.println();
			}
		System.out.println("Pares:"  + qtdPares);
		System.out.println("Impares:"  + qtdImpares);

	}

}
