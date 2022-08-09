package poo;

import java.util.Scanner;

public class Exercicio3_Aluno_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		
		Exercicio3_Aluno aluno = new Exercicio3_Aluno();
		
		System.out.println("Informe o nome do Aluno");
		aluno.nome = scan.next();
		System.out.println("Informe a matrícula do Aluno");
		aluno.matricula = scan.nextInt();
		System.out.println("Informe o curso do Aluno");
		aluno.curso = scan.next();
		
		
		System.out.println("Informe o nome da disciplina 1");
		aluno.disc1 = scan.next();
		System.out.println("Informe o nota da disciplina 1");
		aluno.nota = scan.nextInt();
		System.out.println("Informe o nota1 da disciplina 1");
		aluno.nota1 = scan.nextInt();
		System.out.println("Informe o nota2 da disciplina1");
		aluno.nota2= scan.nextInt();
		System.out.println("Informe o nota3 da disciplina 1");
		aluno.nota3= scan.nextInt();
		aluno.aprovado1(); 
		
		System.out.println("Informe o nome da disciplina 2");
		aluno.disc2 = scan.next();
		System.out.println("Informe o nota da disciplina 2");
		aluno.nota = scan.nextInt();
		System.out.println("Informe o nota1 da disciplina 2");
		aluno.nota1 = scan.nextInt();
		System.out.println("Informe o nota2 da disciplina 2");
		aluno.nota2 = scan.nextInt();
		System.out.println("Informe o nota3 da disciplina 2");
		aluno.nota3 = scan.nextInt();
		aluno.aprovado1();
		
		System.out.println("Informe o nome da disciplina 3");
		aluno.disc3 = scan.next();
		System.out.println("Informe o nota da disciplina 3");
		aluno.nota = scan.nextInt();
		System.out.println("Informe o nota1 da disciplina 2");
		aluno.nota1 = scan.nextInt();
		System.out.println("Informe o nota2 da disciplina 2");
		aluno.nota2 = scan.nextInt();
		System.out.println("Informe o nota3 da disciplina 2");
		aluno.nota3 = scan.nextInt();
		aluno.aprovado1();
		

	}

}
