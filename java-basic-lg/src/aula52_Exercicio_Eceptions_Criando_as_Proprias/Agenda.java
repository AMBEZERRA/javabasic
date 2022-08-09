package aula52_Exercicio_Eceptions_Criando_as_Proprias;

public class Agenda {
 
	private Contato [] contatos;
	
		
	public Agenda() {
		contatos = new Contato[5];
		
	}
	
	public void adicionarT(Contato c) {

		for (int i = 0; i < contatos.length; i++) {
			if (i > contatos.length) {
				System.out.println("Agenda Cheia");

			} else {
				contatos[i] = c;
			}

		}

	}
	
	
	public void adicionar(Contato c) throws AgendaCheiaException {
		boolean cheia = true;
		for(int i = 0; i<contatos.length ; i++) {
			if(contatos[i] == null) {
				contatos[i] = c;
				cheia = false;
				break;
			}
		}
		
		if(cheia) {
			throw new AgendaCheiaException();
		}
		
	} 
	
	public int consultarContatoPorNome(String nome) throws ContatoNaoExisteException {
		for (int i= 0; i< contatos.length; i++) {
			if(contatos[i] != null) {
				if(contatos[i].getNome().equalsIgnoreCase(nome)) {
					return i;
				}
				
			}
		}
		throw new ContatoNaoExisteException(nome);
		
	}
	
	
	@Override
	public String toString() {
		String s = " ";
		for(Contato c: contatos) {
			if(c!= null) {
			s+= c.toString() + "\n";
			}
		}
		return s;
		
	}
}
