package poo;

public class Exercicio3_Aluno {
	
	String nome;
	int matricula;
	String curso;
	String disc1;
	String disc2;
	String disc3;
	int nota;
	int nota1;
	int nota2;
	int nota3;
	
	
	
	void aprovado() {
		if(nota>=7) {
			System.out.println("Aluno Aprovado");
		}else {
			System.out.println("Aluno reprovado");
		}
	}
	
	void aprovado1() {
		int media = (nota1 + nota2 + nota3)/3;
		if(media >=7) {
			System.out.println("Aluno Aprovado");
		}else {
			System.out.println("Aluno Reprovado");
		}
		
	}
	

}
