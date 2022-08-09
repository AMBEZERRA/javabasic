package aula38_Heranca_plavra_Super;

import java.util.Scanner;

public class Teste {
	
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
		System.out.println("Informe a nota 1");
		nota[0] = scan.nextDouble();
		System.out.println("Informe a nota 2");
		nota[1] = scan.nextDouble();
		System.out.println("Informe a nota 3");
		nota[2] = scan.nextDouble();
		System.out.println("Informe a nota 4");
		nota[3] = scan.nextDouble();
		
		aluno.setNotas(nota);
			
		System.out.println("Nome do aluno: " + aluno.getNome());
		System.out.println("Cpf do aluno: " + aluno.getCpf());
		
		for (int i =0; i <4 ;i++) {
			System.out.println("Nota : "   + nota[i]);
		}
			

	}
	
	}