package loops_for;

import java.util.Scanner;

public class For_loops {

	public static void main(String[] args) {
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("o valor de i é: " + i );
		}
		System.out.println("----------------------------------------//----------------------------------");
		
		for (int i = 5; i > 0; i--) {
			System.out.println(" O valor de i é:" + i);
		}
		
		for (int i = 0, j = 10; i < j ; i++, j--){
			  System.out.println("i tem valor: " + i + " " + "J tem valor: " + j);
		}
		
		int cont = 0;
		for(; cont < 10 ; ) {
			System.out.println(cont);
			cont+=2;
		}
		
		int soma=0;
		for(int i =1; i < 5; soma += i++);  
			System.out.println("O valor da soma é:" + soma);
		
		
	}
}
