package aula29_poo_construtores;

public class Carro2 {
	
	String marca; 
	String modelo;  
	int numPassageiros; 
	double capCombustivel; 
	double consuCombustivel;
	public Carro2(String marca, String modelo, int numPassageiros, double capCombustivel, double consuCombustivel) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consuCombustivel = consuCombustivel;
	}
	public Carro2() {
		super();
		// TODO Auto-generated constructor stub
	} 

	// após ter definido seus atributos geramos os construtores automático 
	// clica source generate construct using fields 
	// pode escolher se será public , private , protected
	// sempe que gerar um construtor com parâmetro é recomendado criar um vazio tb 
	
	
}
