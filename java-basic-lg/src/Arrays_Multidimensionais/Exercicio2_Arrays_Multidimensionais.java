package Arrays_Multidimensionais;

import java.util.Random;

public class Exercicio2_Arrays_Multidimensionais {
	
	//Gere e imprima uma matriz 10 x 10 com valores aleatórios entre 0 e 9. Após isso determine o maior número 
	//da matriz e a sua posição (linha / coluna). Indique o maior e menor valor da linha 5 e maior e menor valar 
	//da linha 7.

	public static void main(String[] args) {
		
		int[][] numerosAleatorios = new int [10][10];
		
		Random numerosRandom = new Random();
		
		for(int i=0; i<numerosAleatorios.length; i++) {
			for(int j = 0; j <numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = numerosRandom.nextInt(100);
								
			}
		}
		
		for(int i= 0; i< numerosAleatorios.length; i++) {
			for(int j =0; j<numerosAleatorios[i].length; j++ ) {
                  System.out.print(numerosAleatorios[i][j] + " ");
				
				}
			System.out.println();
		
		}
		System.out.println();
		
		
		int maiorL5 = Integer.MIN_VALUE;
		int menorL5 = Integer.MAX_VALUE;
		int linha5 = 5;
		for(int i=0; i <numerosAleatorios[linha5].length; i++) {
			if(numerosAleatorios[linha5][i]> maiorL5) {
				maiorL5 = numerosAleatorios[linha5][i];
				
			}
			if(numerosAleatorios[linha5][i] <menorL5) {
				menorL5 = numerosAleatorios[linha5][i];
				
			}	
		}
		
		System.out.println(" Maior valor da linha 5 = " + maiorL5);
		System.out.println(" Menor valor da linha 5 = " + menorL5);
		
		System.out.println();
		
		int maiorC7 = Integer.MIN_VALUE;
		int menorC7 = Integer.MAX_VALUE;
		int col7 = 7;
		for(int i=0; i <numerosAleatorios[col7].length; i++) {
			if(numerosAleatorios[i][col7]> maiorC7) {
				maiorC7 = numerosAleatorios[i][col7];
				
			}
			if(numerosAleatorios[i][col7] <menorC7) {
				menorC7 = numerosAleatorios[i][col7];
				
			}	
		}
		
		System.out.println(" Maior valor da Coluna 7 = " + maiorC7);
		System.out.println(" Menor valor da Coluna 7 = " + menorC7);
		
	}

}
