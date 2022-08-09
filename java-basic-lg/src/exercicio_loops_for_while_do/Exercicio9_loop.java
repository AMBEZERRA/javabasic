package exercicio_loops_for_while_do;

import java.util.Scanner;

public class Exercicio9_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o valor da tabuada que que apresentar");
		int tab = scan.nextInt();
		
		for(int i = 0 ; i <=10 ; i++) {
			System.out.println("Tabuada de: " + i * tab);
		}
	}

}
