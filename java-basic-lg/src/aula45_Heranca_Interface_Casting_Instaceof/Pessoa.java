package aula45_Heranca_Interface_Casting_Instaceof;

public class Pessoa {
	
	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	private String celular;
	
	
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pessoa(String nome, String endereco, String telefone, String cpf, String celular) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cpf = cpf;
		this.celular = celular;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	public String obterEtiquetaEndereco() {
		return endereco;
	}

}
