package poo;

public class TestLivro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Livros livro = new Livros();
		livro.anoPublica��o = 2010;
		livro.autor = "Juan Miguel";
		livro.editora = "Xibil de veio";
		livro.nome = "Java vou chegar l�!!!";
		livro.qtdPagina = 520;
		livro.genero = "JAVA";
		
		System.out.println(livro.anoPublica��o + livro.autor + livro.genero + livro.editora);

	}

}
