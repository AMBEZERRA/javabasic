package aula36_poo_relacionamento_classes;

public class ContatoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contato contato = new Contato();
		contato.setNome("Juan Andrade");
		//contato.setEndereco("Rua Flash CD Liga da Justiça");
		//contato.setFone("99 996055773");

		
		//criar o objeto telefone da classe teltefone (foram dois criados e seão incluidos no array)
		Telefone tele = new Telefone();
		tele.setNumero("99 9999 9898");
		tele.setDdd("88");
		tele.setTipo("Celular"); 
		
		Telefone tele2 = new Telefone();
		tele2.setNumero("79 3254 0000");
		tele2.setDdd("79");
		tele2.setTipo("Casa");
		
		// Criado o objeto que recebe na classe contato um array de telefones;
		Telefone[] telefones = new Telefone[2];
		telefones[0] = tele;
		telefones[1] = tele2;
		
		//criar objeto endereço
		Endereco end =  new Endereco();
		end.setNomeRua("Game Of Throns");
		end.setNumero("n/t");
		end.setComplemento("Não se aplica");
		end.setCidade("Brejo Brejo");
		end.setEstado("Ceara");
		end.setCep("499889898");
		
		contato.setEndereco(end);  // aqui o objeto contato vai busca na classe contato o objeto(end) endereco, que está recebendo da classe endereco 1/1 
		//contato.setFone(tele);
		contato.setFones(telefones);  // aui setando fones da classe contato que recebe telefones da classe Telefones
		
		if(contato != null && contato.getFones() != null) {
		System.out.println(contato.getNome());
		for(Telefone t : contato.getFones()) { // for melhorado
			System.out.println(t.getDdd());
			System.out.println(t.getNumero());
			System.out.println(t.getTipo());
		}
		
		}

		if(contato != null &&  contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade()); // aqui chamamos o edereço e passamos o objeto do endereço
			System.out.println("Nome da Rua:" + contato.getEndereco().getNomeRua());
			System.out.println("Cep: " + contato.getEndereco().getCep());
			System.out.println(contato.getEndereco().getEstado());
		}
			
	}

}
