package loops_while_dowhile;

import java.util.Scanner;

public class While_aula_loiane {

	public static void main(String[] args) {
		// while 
		
		
		int i = 0;  // count ou cont
		int max = 10;
		
		System.out.println("Contando até:" + max);

		while(i < max) {
		 
			System.out.println("Valor de i: " + i);
			 i++;  // i = i + 1; ou i += 1;
		}
		
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o valor de a:");
		int a = scan.nextInt();
		
		System.out.println("Informe o valor de b:");
		int b = scan.nextInt();
		
		while(a + b == 4) {
			System.out.println(a);
			System.out.println(b);
			System.out.println(a+b);
			break;
			
		}
		System.out.println("A soma das variáveis não é 4");*/
	}

}
