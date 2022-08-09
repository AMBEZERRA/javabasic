package aula43_ClasseObject;

public class Teste {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		
		aluno.setCurso("Ciências da Computação");
		
		double[] notas = {10, 9, 7};
		aluno.setNotas(notas);
		
		System.out.println(aluno); // aqui imprime o valor de memória
		                           // temos que usar o to String que vai imprimir os valores e nao a posição na memoria
		
		
	}

}
