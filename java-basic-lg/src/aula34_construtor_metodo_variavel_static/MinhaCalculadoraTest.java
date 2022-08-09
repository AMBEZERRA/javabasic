package aula34_construtor_metodo_variavel_static;

public class MinhaCalculadoraTest {

	public static void main(String[] args) {
		
		// já passa o o método direto pela chamada da classe (isso pq o metodo pe static)
	int	soma = MinhaCalculadora.soma(2, 3);
	int soma2 = MinhaCalculadora.soma(5, 6, 9);
	MinhaCalculadora.soma(2, 5);
	
 	System.out.println(soma);
 	System.out.println(soma2);
 	System.out.println(MinhaCalculadora.soma(2, 5));
 	
	

	}

}
