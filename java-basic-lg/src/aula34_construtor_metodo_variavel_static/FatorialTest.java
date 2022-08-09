package aula34_construtor_metodo_variavel_static;

import java.util.Scanner;

public class FatorialTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int num;
		do {
			System.out.println("Entre com o número Fatorial ");
			num = scan.nextInt();
			
			if(num<0) {
				System.out.println("Númeo inválido, entre com o número positivo ");
			}
		} while (num<0);
		System.out.println(Fatorial.fatorial(num));

	}

}
