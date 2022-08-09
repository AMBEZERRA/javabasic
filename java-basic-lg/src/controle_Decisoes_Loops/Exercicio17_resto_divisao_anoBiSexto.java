package controle_Decisoes_Loops;

import java.util.Scanner;

public class Exercicio17_resto_divisao_anoBiSexto {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Informe o ano que deseja saber se é bissexto:");
		int ano = scan.nextInt();
        
        if((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
        	System.out.println("Ano bissexto:");
        } else {System.out.println("Ano não é bissexto");}

	}

}
