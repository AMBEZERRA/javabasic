package exercicio_loops_for_while_do;

import java.util.Scanner;

public class Exercicio6_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*for(int i = 0; i<=20 ; i++) {
			//System.out.println(i);
			 
			  for(int i = 0; i<=20 ; i++) {
			System.out.print(i + ",");
		}
			 
		//} */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o número 1");
		int num1 = scan.nextInt();
		
		System.out.println("Informe o número 2");
		int num2 = scan.nextInt();
		System.out.println("Informe o número 3");
		int num3 = scan.nextInt();
		System.out.println("Informe o número 4");
		int num4 = scan.nextInt();
		System.out.println("Informe o número 5");
		int num5 = scan.nextInt();
		
		if(num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5 ) {
			System.out.println(num1);
		} else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5 ) {
			System.out.println(num2);
			}else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5 ) {
				System.out.println(num3);
				}else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5 ) {
					System.out.println(num4);
					}else  {
						System.out.println(num5);
		
	}

}
	}
