package aula34_construtor_metodo_variavel_static;

public class Contador {
	// metodos e atributos static não vai precisar instaciar é só chamar direto

	static int cont;


	public static void incrementar() {
		cont ++;
		System.out.println(cont);
	}
	
	public static void zerarCont() {
		cont=0;
		System.out.println(cont);
	}
	
	public static int mostrarCont() {
		return cont;
		
				
	}
	
}
