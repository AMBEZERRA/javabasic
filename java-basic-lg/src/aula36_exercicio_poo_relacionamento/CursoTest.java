package aula36_exercicio_poo_relacionamento;

import java.util.Scanner;

public class CursoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o nome do curso");
		String nome = scan.nextLine();
		
		System.out.println("Entre com o Horário");
		String horario = scan.nextLine();
		
		System.out.println("Entre com o nome do Professor");
		String nomeprof = scan.nextLine();
		
		System.out.println("Entre com o email");
		String email = scan.nextLine();
		
		System.out.println("Entre com o Departamento");
		String departamento = scan.nextLine();
		
		Curso curso = new Curso();
		curso.setNome(nome);
		curso.setHorario(horario);
		
		Professor professor = new Professor();
		professor.setNome(nomeprof);
		professor.setDepartamento(departamento);
		professor.setEmail(email);
		
		curso.setProfessor(professor);
		
		System.out.println("--------------------------------------------");

		Aluno[] alunos = new Aluno[5]; 
				
		for(int i =0 ; i<5; i++) {
			
			System.out.println("Entre com o nome do aluno" + (i+1));
			String nomeAluno = scan.nextLine();
			
			System.out.println("Entre com a matrícula do aluno");
			String matAluno = scan.nextLine();
			
			int [] notas = new int[4];
			for (int j = 0; j<4; j++) {
				System.out.println("Entre com a nota " + (j+1));
				notas[j] = scan.nextInt();
			}
			
			Aluno aluno = new Aluno();
			aluno.setNome(nomeAluno);
			aluno.setMatricula(matAluno);
			aluno.setNotas(notas);
			
			alunos[i] = aluno;

		}
		curso.setAlunos(alunos);
		
		System.out.println(curso.Obterinfo());
		
	}

}
