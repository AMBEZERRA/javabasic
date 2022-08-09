package for_each;

import java.util.Random;

public class For_Each {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] notas = new int[10];
		
		Random random = new Random();
		
		
		for(int i=0; i<notas.length; i++) {
			notas[i] = random.nextInt(10);
					
			
			}
		
		for(int i=0; i<notas.length; i++) {
			System.out.println(notas[i]);
		}
		
		System.out.println("Usando o for each");
		
		for(int nota : notas) {
			System.out.println(nota);
		}
		
		//exemplo 2 for each de Matriz
		double [][] notasAlunos = new double [3][4];
		
		notasAlunos[0][0] = 1;
		notasAlunos[0][1] = 2;
		notasAlunos[0][2] = 3;
		notasAlunos[0][3] = 4;
		
		notasAlunos[1][0] = 5;
		notasAlunos[1][1] = 6;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 8;
		
		notasAlunos[2][0] = 9;
		notasAlunos[2][1] = 10;
		notasAlunos[2][2] = 11;
		notasAlunos[2][3] = 12;
		
		for(double [] notasAluno : notasAlunos) {
			for(double nota :  notasAluno) {
				System.out.print(nota + " ");
				
			}
			System.out.println();
		}
		
		
		
		
	}
}

