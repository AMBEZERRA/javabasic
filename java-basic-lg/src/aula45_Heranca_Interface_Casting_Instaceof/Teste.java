package aula45_Heranca_Interface_Casting_Instaceof;

public class Teste {

	public static void main(String[] args) {

		/*Aluno aluno = new Aluno();
		Pessoa pessoaAluno = aluno; // upcasting transformando uma classe menor em uma maior
		
		Pessoa aluno2 = (Pessoa) new Aluno(); // muito usando em hibernate
		
		Pessoa aluno3 = new Pessoa();
		Aluno aluno4 = (Aluno) aluno3; // dowcasting (não da certo, java não permite)
		*/
		
		// istanceof é ultil para verificar o tipo de classe
		
		Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();
		Professor prof = new Professor();
		
		if(pessoa instanceof Pessoa) {
			System.out.println("É do tipo Pessoa");
		}
		
		if (aluno instanceof Aluno) {
			System.out.println("É do tipo Aluno");
		}
		
		if (prof instanceof Professor) {
			System.out.println("É do tipo Professor");
		}
	}

}
