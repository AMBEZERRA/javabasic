package aula46Heranca_Interface_Exercicio1;

public abstract class FiguraGeometrica {
	
	private String cor;
	private String nome;
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "FiguraGeometrica [cor=" + cor + ", nome=" + nome + "]";
	}
	
	

}
