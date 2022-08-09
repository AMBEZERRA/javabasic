package aula45_Heranca_Interface_Casting_Instaceof;

public class Aluno extends Pessoa {
	private String [] cursos;
	private double[] notas;
	
	
	
	public Aluno() {
		super();
	}
	
			
	public Aluno(String nome, String endereco, String telefone, String cpf, String celular) {
		super(nome, endereco, telefone, cpf, celular);
		this.cursos = cursos;
	}



	
	
			
		
	/*
	public double calcularMedia() {
		double soma = 0;
		for (double i = 0; i<notas[4]; i++ ) {
			soma += notas.length;
			}
		
		return soma/notas.length;
	}
	*/
	

	public String[] getCursos() {
		return cursos;
	}


	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}


	public double[] getNotas() {
		return notas;
	}


	public void setNotas(double[] notas) {
		this.notas = notas;
	}


	public String obterInfo() {
		String info = " ,";
			info += "Notas ";
		
		double soma = 0;
		for (double nota : notas) {
			soma += nota;
			info += nota + " ";
			
			 
		}
		return info;
	}
	
	
	
	public boolean verificarAprovado(){
		return true; 
	}	
	
	public  void metodoQualquer() {
		this.setCpf(("8888888")); // aqui setou através do aluno que extends Pessoa
		super.setCpf("8888888"); // aqui ta pegando direto da classe pessoa (super) 
	}
	
	public String obterEtiquetaEndereco() {
		String s = "Endereço do Aluno: "; 
		s += super.getEndereco();
		
		return s;
	}
	
}
