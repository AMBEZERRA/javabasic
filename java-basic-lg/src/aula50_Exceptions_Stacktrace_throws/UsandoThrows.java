package aula50_Exceptions_Stacktrace_throws;

import java.util.Scanner;

public class UsandoThrows {

	public static void main(String[] args) {
		
		System.out.println("Entre com um némero decimal");
		try {
			double num = leNumero();
			System.out.println("Você digitou" + num);
		} catch (Exception e) {
			System.out.println("Entrada Invalida");
			e.printStackTrace();
		}
	}
               // o uso do throws Exception faz vc tratar o erro quando ele ta sendo executado
	       // metodo tem que ser static pra o main poder vê
	public static double leNumero()throws Exception { 
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		return num;
	}
}
