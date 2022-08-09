package aula41_Heranca_ClasseAbstract;

public class Teste_classeAbstract {

	public static void main(String[] args) {
		
		//Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		//pessoa.setEndereco("Rua 1 , Num 1");
		aluno.setEndereco("Rua 2 , Num 2");
		professor.setEndereco("Rua 3 , Num 3");

		//System.out.println(pessoa.getEndereco());
		System.out.println(aluno.getEndereco());
		System.out.println(professor.getEndereco());
		
		System.out.println(aluno.obterEtiquetaEndereco());
		System.out.println(professor.obterEtiquetaEndereco());
		
		// observe que os métodos que estçai a classe Pessoa foram usados normalmente 
		// só não podemos é instânciar a classe pessoa
	}

}
