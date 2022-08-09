package aula44_Heranca_Interface;

public abstract class Animal {
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract void emitirSon();

}
