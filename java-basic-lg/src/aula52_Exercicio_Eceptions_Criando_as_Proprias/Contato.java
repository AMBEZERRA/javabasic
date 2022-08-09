package aula52_Exercicio_Eceptions_Criando_as_Proprias;

public class Contato {
	
	private static int contador = 0; // tem que ser static pra toda vez que instanciar a classe ele somar + 1 (ser incrementado)
	
	private int id;
	private String nome;
	private String telefone;
	private String email;
	
	// criando o contador da classe (colocamos ela dentro do proprios construtor)s
	public Contato() {
	 contador++;
	 id = contador;
	}
	
	
	
	public int getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmailString() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	@Override
	public String toString() {
		String s = "[";
		s += " Id: "  + id;
		s += ", Nome:" + nome;
		s += ", Telefone:" + telefone;
		s += ", email:" + email + "]"; 
				
		return s;
	}
}
