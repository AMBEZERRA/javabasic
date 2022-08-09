package Arrays_Multidimensionais;

import java.util.Scanner;

public class Exemplo_DevSuperior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     int [][] matriz1 = new int [5][5];
		
     for(int i=0; i<matriz1.length; i++) {
    	 for(int j=0; j<matriz1[i].length; j++) {
    		 matriz1[i][j]= 5;
    	 }
     }
     
     for(int i=0; i<matriz1.length; i++) {
    	 for(int j=0; j<matriz1[i].length; j++) {
    		 System.out.print(matriz1[i][j] + " ,");
     
		}

    	 System.out.println();
	}
     
     for(int i=0; i<matriz1.length; i++) {
    	 for(int j=0; j<matriz1[i].length; j++) {
    		 System.out.println( "[" + i + "]" + "[" + j + ']');
     
		}

	}
}
}
