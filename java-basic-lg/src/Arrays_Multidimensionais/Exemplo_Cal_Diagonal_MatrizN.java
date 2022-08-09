package Arrays_Multidimensionais;

import java.util.Scanner;

public class Exemplo_Cal_Diagonal_MatrizN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Soma da diagonal principal da Matriz quadrada.
		
				System.out.println("Informe a odem da Matriz:");
				
				Scanner scan = new Scanner(System.in);
				int  n = scan.nextInt(); 
				double [][] mat = new double [n][n];
				
				System.out.println("Informe os números da Matriz1");	
				for(int i =0; i <n; i++) {
					for(int j=0; j <n; j++) {
						mat[i][j] = scan.nextDouble();
					}
				}
				
				for(int i =0; i <n; i++) {
					for(int j=0; j <n; j++) {
				System.out.print(mat[i][j] + ",");
				
					}
					System.out.println();
				}	
				
				/*double soma = 0.0;
				for(int i =0; i <n; i++) {
					for(int j=0; j <n; j++) {
						if(i==j) {
							soma = soma + mat[i][j];
						}
											
						}
					}  */
				// outra forma mais rápida
				double soma = 0.0;
				for(int i =0; i <n; i++) {
					soma = soma + mat[i][i];
					}
					

				System.out.println("A soma da diagonal é: " + soma);
	}

}
