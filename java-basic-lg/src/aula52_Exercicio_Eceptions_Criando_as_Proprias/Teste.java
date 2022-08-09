package aula52_Exercicio_Eceptions_Criando_as_Proprias;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Agenda agenda = new Agenda();
		
		int opcao = 1;
		
		while(opcao != 3) {
		
			 opcao = obterOpacaoMenu(scan);

			if (opcao == 1) { // consultar contato (a logica eta dentro do método abaixo)
				consultarContato(scan, agenda);
				
			} else if (opcao == 2) { // incluir contato
				 adicionarContato(scan, agenda);
			}
		}
	}
		
			public static void adicionarContato(Scanner scan, Agenda agenda) {
				
		try {
			System.out.println("Criando um contato entre com as informações");
			String nome = lerInformacaoString(scan, "Entre com o nome do contato");
			String telefone = lerInformacaoString(scan, "Entre com mo telefone do contato");
			String email = lerInformacaoString(scan, "Entre com o email do contato");
			
			Contato contato = new Contato();
			contato.setNome(nome);
			contato.setEmail(email);
			contato.setTelefone(telefone);
			
			System.out.println("Contato a ser criado: ");
			System.out.println(contato.toString());
			agenda.adicionar(contato);
		} catch (AgendaCheiaException e) {
			System.out.println(e.getMessage());
			System.out.println("Contatos da Agenda");
			System.out.println(agenda);
		}
	}
	
	public static void consultarContato(Scanner scan, Agenda agenda) {
		String nomeContato = lerInformacaoString(scan, "Entre com o nome do contato a consultar");
		try {
			if (agenda.consultarContatoPorNome(nomeContato) >=0 ) {
				System.out.println("Contato existe");
			}
		} catch (ContatoNaoExisteException e) {
			System.out.println(e.getMessage());
			e.getStackTrace();
		}
	}
	
	public static String lerInformacaoString(Scanner scan, String msg) { // usado pra String
				System.out.println(msg);
				String entrada = scan.nextLine();
				return entrada;
	}
	
	public static int obterOpacaoMenu(Scanner Scan) {
		boolean entradaValida = false;
		int opcao = 3;
		while(!entradaValida){
		System.out.println("Digite a opção Desejada");
		System.out.println("1: Consulta contato");
		System.out.println("2: Adicionarcontato ");
		System.out.println("3: Sair  ");
		
		try {
			String entrada = Scan.nextLine();
			opcao = Integer.parseInt(entrada);
			
			if (opcao == 1 || opcao == 2 || opcao == 3) {
				entradaValida = true;
			}else {
				
				throw new Exception("Entrada inválida");
			}
		}
		catch(Exception e) {
			System.out.println("Entrada Inválida, digite novamente");
		}
		}
		return opcao;
	}

}


