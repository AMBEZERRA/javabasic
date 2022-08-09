package poo;

public class PessoaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa pessoa = new Pessoa();
		pessoa.nome = "Allisson";
		pessoa.altura = 1.85;
		pessoa.idade = 25;
		pessoa.peso = 85;
		
		pessoa.envelhecer();
		pessoa.engordar();
		pessoa.engordar();
		pessoa.engordar();
		pessoa.engordar();
		pessoa.engordar();
		
		System.out.println(pessoa.altura +  " , " + pessoa.peso);
	}

}
