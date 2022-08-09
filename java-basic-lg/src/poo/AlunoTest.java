package poo;

import java.util.Scanner;

public class AlunoTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("Entre com o nome do aluno");
		aluno.nome = scan.next();
		
		System.out.println("Entre com o a matricula do aluno");
		aluno.matricula = scan.next();
		
		System.out.println("Entre com o nome do curso");
		aluno.nomeCurso = scan.next();
		
		for(int i=0; i<aluno.nomeDisciplina.length; i++) {
			System.out.println("Entre com  nome da disciplina" + i);
			aluno.nomeDisciplina[i] = scan.next();
		}

		for(int i=0; i<aluno.notasDisciplinas.length; i++) {
			System.out.println("Obtendo as notas das disciplina" + " " + aluno.nomeDisciplina[i]);
			for(int j =0; j<aluno.notasDisciplinas[i].length; j++) {
				System.out.println("Entre com a nota" + (j+1));
				aluno.notasDisciplinas[i][j]= scan.nextDouble();
				
			}
		}
		
		aluno.mostrarInfo();
		
		for(int i =0; i<aluno.nomeDisciplina.length; i++) {
			if(aluno.verificarAprovado(i)) {
				System.out.println("Dsiciplina " + aluno.nomeDisciplina[i] + " - foi aprovado");
			}else {
				System.out.println("Dsiciplina " + aluno.nomeDisciplina[i] + " - foi reprovado");
				
			}
			
		}
	}

}
