package testes_loiane;

import java.util.Scanner;

public class ScannerDadosTeclado {

	public static void main(String[] args) {
 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu primeiro nome, idade, quantidade de filho , altura");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		int qtdFilhos = scan.nextInt();
		double altura = scan.nextDouble();
		
		System.out.println("Dados do Usu�rio: " + " Primeiro nome= " + primeiroNome + " Idade = " + idade +
				" Quantdade de Filhos = " + qtdFilhos + " Altura = " + altura);
		
		
		/*
		System.out.println("Digite seu Nome Completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo �: " + nomeCompleto);
        
		System.out.println("Digite seu Primeiro Nome: ");
        String primeiroNome = scan.nextLine();
        System.out.println("Seu Primeiro nome �: " + primeiroNome);
        
		System.out.println("Digite Sua Idade :");
		int idade = scan.nextInt();
		System.out.println("Sua idade �:" + idade);
				
		System.out.println("Digite Sua Altura : ");
		double alturaPessoa = scan.nextDouble();
		System.out.println("Sua altura � :" + alturaPessoa);
		
		System.out.println("Dados gerais do Usu�rio" + " " + "Nome:" 
		+ primeiroNome + " " +  "Idade" + " " + idade + " " 
				+ "Altura" + " "+ alturaPessoa);
		*/
		//Perguntando e respondendo tudo de vez 
		
		
	}
	
}
