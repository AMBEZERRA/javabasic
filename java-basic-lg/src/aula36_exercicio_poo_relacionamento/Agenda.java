package aula36_exercicio_poo_relacionamento;

public class Agenda {

	private String nome;
	private Contato[] contato;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Contato[] getContato() {
		return contato;
	}
	public void setContato(Contato[] contato) {
		this.contato = contato;
	}
	
	//Exemplo perfeito de recursividade (mesmo nome do metodo da classe contato e o metodo chama ele mesmo com os parâmetro da classe Contato)
	public String obterInfo() {
		String info = "Nome = " + this.nome + "\n";
		
		if(contato != null) {
			for(Contato c : contato) {
				info += c.obterInfo() + "\n";
				
			}
		}
		
		
		return info;
	}
	
	
}
