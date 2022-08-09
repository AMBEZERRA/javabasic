package exercicio_loops_for_while_do;

import java.util.Scanner;

import javax.xml.parsers.ParserConfigurationException;

public class Exercicio2_loop {

	public static void main(String[] args) {
		/*2.Faça um programa que leia um nome de usuário e a sua senha,
		e não aceite a senha igual ao nome do usuário, mostrando uma mensagem 
		de erro e voltando a pedir as informações.*/

		
		boolean senhaValida = false;
		do {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o nome do Usuário: ");
		String nome = scan.next();
		
		System.out.println("Informe a Senha: ");
		String senha = scan.next();
		
		if( nome.equalsIgnoreCase(senha) ) {
			senhaValida = false;
			System.out.println("Senha Inválida, digite outra " );
		} else {
			senhaValida = true;
			System.out.println(nome);
			System.out.println(senha);
		}
		
		
		} while(senhaValida == false);
		
		}
	}