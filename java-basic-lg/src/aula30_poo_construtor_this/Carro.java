package aula30_poo_construtor_this;

public class Carro {
	String marca; 
	String modelo;  
	int numPassageiros; 
	double capCombustivel; 
	double consuCombustivel;
	
	
	public Carro(){
		
	}
	
	
	
	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consuCombustivel) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consuCombustivel = consuCombustivel;
	}



	// jeita certo de fazer 
	public Carro(String marca, String modelo, int numPassageiros) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Construtor 3 parâmetros ");
		
	}
	 // jeito correto mais não usado 
	public Carro(String marca, String modelo) {
		this("Fiat", "Ducato", 10);
		
		System.out.println("Chamando o construtor com 2 parâmetros");
	}
	
	

}
 