package aula36_exercicio_poo_relacionamento;

import java.util.Scanner;

public class AgendaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o nome da Agenda");
		String nome = scan.nextLine();
		
		Agenda agenda = new Agenda();
		agenda.setNome(nome);
		
		Contato [] contato = new Contato[3];
		for(int i = 0 ; i <3 ; i++) {
			System.out.println("Entre com as informações do  Contato" + (i+1));
			Contato c = new Contato();
					
			
			System.out.println("Informe o nome do Contato ");
			 nome = scan.nextLine();
			c.setNome(nome);
			
			System.out.println("Informe o Telefone do Contato ");
			String telefone = scan.nextLine();
			c.setTelefone(telefone);
			
			System.out.println("Informe o E-mail do Contato ");
			String email = scan.nextLine();
			c.setEmail(email);
			
			contato[i] = c;
			agenda.setContato(contato);
					 
		}
		/*Contato contato = new Contato();
		System.out.println("Informe o nome do contato");
		contato.setNome(scan.next());
		System.out.println("Informe o Telefone do contato");
		contato.setTelefone(scan.next());
		System.out.println("Informe o e-mail do contato");
		contato.setEmail(scan.next());
		
		Contato contato1 = new Contato();
		System.out.println("Informe o nome do contato1");
		contato1.setNome(scan.next());
		System.out.println("Informe o Telefone do contato1");
		contato1.setTelefone(scan.next());
		System.out.println("Informe o e-mail do contato1");
		contato1.setEmail(scan.next());
		
		Contato contato2 = new Contato();
		System.out.println("Informe o nome do contato2");
		contato2.setNome(scan.next());
		System.out.println("Informe o Telefone do contato2");
		contato2.setTelefone(scan.next());
		System.out.println("Informe o e-mail do contato2");
		contato2.setEmail(scan.next());
		*/
		/*Contato[] contat = new Contato[3];
		contat[0] = contato;
		contat[1] = contato1;
		contat[2] = contato2;
		
		agenda.setContato(contat);
		*/
		if(agenda !=null & contato != null) {
		System.out.println(agenda.getNome());
		
		for(Contato t : contato) {
			System.out.println(t.getNome());
			System.out.println(t.getTelefone());
			System.out.println(t.getEmail());
			
			System.out.println();
		}
		
		
		System.out.println(agenda.obterInfo());
		}
		
		
		/* Ou asssim  assim foi o meu bem melho
			System.out.println(contato.getNome());
			System.out.println(contato.getTelefone());
			System.out.println(contato.getEmail());
			
			System.out.println(contato1.getNome());
			System.out.println(contato1.getTelefone());
			System.out.println(contato1.getEmail());
			
			System.out.println(contato2.getNome());
			System.out.println(contato2.getTelefone());
			System.out.println(contato2.getEmail());							
           */
	}

}
