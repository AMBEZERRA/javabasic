package aula36_poo_relacionamento_classes;

public class Contato {
	private String nome;
	private Endereco endereco;
	private Telefone[] fones;  // o certo aqui era usar um List. (fica pra poximas aulas)
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Telefone[] getFones() {
		return fones;
	}
	public void setFones(Telefone[] fones) {
		this.fones = fones;
	}
	
}
