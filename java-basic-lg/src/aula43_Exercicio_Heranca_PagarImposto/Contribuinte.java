package aula43_Exercicio_Heranca_PagarImposto;

public abstract class Contribuinte {
	private String nome;
	private double rendaBruta;
	
	
	
	public double getRendaBruta() {
		return rendaBruta;
	}
	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// por ser metodo abstract não se abre {} finaliza ele com ; lembrando que ,etodos e classes abstract nao pode ser instanciados
	public abstract double calcularImposto();
	@Override
	public String toString() {
		return "Contribuinte [nome= " + nome + ", rendaBruta= " + rendaBruta + "]";
	}

	
}
