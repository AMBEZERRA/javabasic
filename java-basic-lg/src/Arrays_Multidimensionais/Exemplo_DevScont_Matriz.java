package Arrays_Multidimensionais;

import java.util.Scanner;

public class Exemplo_DevScont_Matriz {

	public static void main(String[] args) {
		
		// Soma da diagonal principal da Matriz quadrada.
		
		int [][] matriz1 = new int [3][3];
		
		Scanner scan = new Scanner(System.in);
		
			
		int soma =0;
		for(int i =0; i <matriz1.length; i++) {
			for(int j=0; j <matriz1.length; j++) {
			
				System.out.println("Informe os números da Matriz1");
				matriz1[i][j] = scan.nextInt();
			}
		}
		
		for(int i =0; i <matriz1.length; i++) {
			for(int j=0; j <matriz1.length; j++) {
		System.out.print(matriz1[i][j] + ",");
		
			}
			System.out.println();
		}	
		
		for(int i =0; i <matriz1.length; i++) {
			for(int j=0; j <matriz1.length; j++) {
				
			}
			soma = matriz1[0][0] +  matriz1[1][1] + matriz1[2][2]; 
			}
		System.out.println("Valor da diagonal principal e : " + soma);
		
}
}