package aula35_poo_Construtores_Recursividade;

import java.util.Scanner;

import aula34_construtor_metodo_variavel_static.Fatorial;

public class RecursividadeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int num;
		do {
			System.out.println("Entre com o n�mero Fatorial ");
			num = scan.nextInt();
			
			if(num<0) {
				System.out.println("N�meo inv�lido, entre com o n�mero positivo ");
			}
		} while (num<0);
		System.out.println(Recursividade.fatorial(num));

	}

}
