package aula43_ClasseObject;

public class Teste {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		
		aluno.setCurso("Ci�ncias da Computa��o");
		
		double[] notas = {10, 9, 7};
		aluno.setNotas(notas);
		
		System.out.println(aluno); // aqui imprime o valor de mem�ria
		                           // temos que usar o to String que vai imprimir os valores e nao a posi��o na memoria
		
		
	}

}
