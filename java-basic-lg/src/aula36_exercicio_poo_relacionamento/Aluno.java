package aula36_exercicio_poo_relacionamento;

public class Aluno {
	private String nome;
	private String matricula;
	private int [] notas;
	
	
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int[] getNotas() {
		return notas;
	}
	public void setNotas(int[] notas) {
		this.notas = notas;
	}
	
	
			public String obterInfo() {
				String info = "Nome do Aluno = " + nome + " ; ";
				info += "Matricula = " + matricula + " ; ";
				info += "Notas ";
				
				int soma = 0;
				for (int nota : notas) {
					soma += nota;
					info += nota + " ";
				}
				
				int media = soma/4;
				info += "\n" + "Média = " + media + " - ";
				if(media>=7) {
					info += "Aprovado";
				} else {
					info += "Reprrovado";
					
				}
				
				return info;
			}
			
		public int mediaGeral() {
			int soma = 0;
			for(int nota : notas) {
				soma += nota; 
			}			
			return soma/4;
		}

}
