package aula40_Heranca_poliformismo;

public class Teste {

	public static void main(String[] args) {
		// Essa forma de inst�nciar s� � poss�vel pq aluno e professor extends Pessoa
		Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		pessoa.setEndereco("Rua 1, num 1");
		aluno.setEndereco("Rua 2, num 2");
		professor.setEndereco("Rua 3, num 3");
		
		System.out.println(pessoa.obterEtiquetaEndereco());
		System.out.println(aluno.obterEtiquetaEndereco());
		System.out.println(professor.obterEtiquetaEndereco());
        // devido a heranca o aluno e professor poderam acessar o m�todo criado
		// em pessoa OBTERETIQUETAENDERECO exemplo classico de heranca.
		
		//Reescrevemos o metodo da na classe aluno e professor, o metodo tem o 
		// mesmo nome mais o resultado � diferente...logo a sa�da do m�todo vai ser 
		// chamada de acordo com a instancia do objeto.
	}

}
