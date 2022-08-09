package aula43_ClasseObject;

import java.util.Arrays;

public class Aluno  {
	private String curso;
	private double[] notas;
	
	
	
	public Aluno() {
		super();
	}
	
			
	public Aluno(String nome, String endereco, String telefone, String cpf, String celular) {
		//super(nome, endereco, telefone, cpf, celular);
		this.curso = curso;
	}




	public double[] getNotas() {
		return notas;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
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
	
	/*public  void metodoQualquer() {
		this.setCpf(("8888888")); // aqui setou através do aluno que extends Pessoa
		super.setCpf("8888888"); // aqui ta pegando direto da classe pessoa (super) 
	}
	*/
	
	public String obterEtiquetaEndereco() {
		String s = "Endereço do Aluno: "; 
		//s += super.getEndereco();
		
		return s;
	}


	/*@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}
	*/

	//criando o proprio to String
	public String toString() {
		String s = curso + "\n";
		for(double nota : notas) {
			s += nota + " ";
		}
		return s;
	}
	
	
}
