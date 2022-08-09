package aula38_Heranca_plavra_Super;

import java.util.Scanner;

public class Teste2 {

	public static void main(String[] args) {
	
Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe o nome do Aluno: ");
		String nomeAluno = scan.next();
		
		System.out.println("Informe o cpf do Aluno: ");
		String cpfAluno = scan.next();
		
		Aluno aluno = new Aluno();
		aluno.setNome(nomeAluno);
		aluno.setCpf(cpfAluno);
	 
		double [] nota = new double[4];
		for(int i = 0; i<4; i++) {
		System.out.println("Informe a nota " + (i+1));
		nota[i] = scan.nextDouble();
		
		}
			
		System.out.println("Nome do aluno: " + aluno.getNome());
		System.out.println("Cpf do aluno: " + aluno.getCpf());
		for(int j = 0; j<4; j++) {
			System.out.println("Nota : "  + (j+1) + " = " +  nota[j]);
		
			aluno.setNotas(nota);
		}

	}
}


