package exercicio_loops_for_while_do;

import java.util.Scanner;

import javax.xml.parsers.ParserConfigurationException;

public class Exercicio2_loop {

	public static void main(String[] args) {
		/*2.Fa�a um programa que leia um nome de usu�rio e a sua senha,
		e n�o aceite a senha igual ao nome do usu�rio, mostrando uma mensagem 
		de erro e voltando a pedir as informa��es.*/

		
		boolean senhaValida = false;
		do {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o nome do Usu�rio: ");
		String nome = scan.next();
		
		System.out.println("Informe a Senha: ");
		String senha = scan.next();
		
		if( nome.equalsIgnoreCase(senha) ) {
			senhaValida = false;
			System.out.println("Senha Inv�lida, digite outra " );
		} else {
			senhaValida = true;
			System.out.println(nome);
			System.out.println(senha);
		}
		
		
		} while(senhaValida == false);
		
		}
	}