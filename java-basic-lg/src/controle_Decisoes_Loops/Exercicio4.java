package controle_Decisoes_Loops;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
 // Fa�a um Programa que verifique se uma letra digitada � vogal ou consoante.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a letra");
		String letra = scan.next();
		
		if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||
				letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
			System.out.println("� uma vogal");
		} else {
			System.out.println("� uma consoante");
		}
		
			
	}
}
