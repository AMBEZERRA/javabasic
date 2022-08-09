package controle_Decisoes_Loops;

import java.util.Scanner;

public class Exercicio10 {
	//Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. 
	//Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite M-matutino ou V-vespertino ou N-noturno:");
		String turno = scan.next();
		
		if (turno.equalsIgnoreCase("m")) {
			System.out.println("Bom Dia!");
		} else if (turno.equalsIgnoreCase("v")) {
			System.out.println("Boa Tarde!");
		}else if(turno.equalsIgnoreCase("n")) {
			System.out.println("Boa Noite!");
		} else {
			System.out.println("Valor Inválido!");
		}
		
	}

}
