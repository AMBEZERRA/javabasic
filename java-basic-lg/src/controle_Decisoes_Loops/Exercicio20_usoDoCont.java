package controle_Decisoes_Loops;

import java.util.Scanner;

public class Exercicio20_usoDoCont {

	public static void main(String[] args) {
		//  5 perguntas e calssifique as respostas como inocente , suspeito ou assassino 
		// Vamos usar um contador (preste aten��o � muito importante)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Telefonou Para a V�tma?");
		String resp1 = scan.next();
		
		System.out.println("Esteve no local do Crime?");
		String resp2 = scan.next();
		
		System.out.println("Mora perto da v�tma?");
		String resp3 = scan.next();
		
		System.out.println("Devia para a Vitma?");
		String resp4 = scan.next();
		
		System.out.println("J� trabalhou com V�tma?");
		String resp5 = scan.next();
		
		int cont =0;
		
		if(resp1.equalsIgnoreCase("sim")){
		cont++;
		}
		
		if(resp2.equalsIgnoreCase("sim")){
			cont++;
			}
		if(resp3.equalsIgnoreCase("sim")){
			cont++;
			}
		if(resp4.equalsIgnoreCase("sim")){
			cont++;
			}
				
		if(resp5.equalsIgnoreCase("sim")){
			cont++;
			}
				
		else if (cont == 0) {
			System.out.println("Pessoa � Inocente");
		}
		
		else if (cont == 2) {
			System.out.println("Pessoa � suspeita");
		}
		else if (cont == 3 || cont == 4 ) {
			System.out.println("Pessoa � C�mplice");
		}
		
		 else if (cont == 5) {
			System.out.println("Pessoa � a Assassina");
		}
		
		 }
	}


