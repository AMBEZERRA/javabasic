package aula29_poo_construtores;

public class Carro {
	String marca; 
	String modelo;  
	int numPassageiros; 
	double capCombustivel; 
	double consuCombustivel;
	
	int velocidade;
	 int acelerar;
	 
	 Carro(){
		 System.out.println("Classe Carro instanciada");
		 numPassageiros = 4;
	 }
	 
	 // construtor com todos os atributos da classe inicializados
	 Carro(String marca_, String modelo_ , int numPassageios_, double capCumbustivel_, double consuCombustivel_){
		marca = marca_;
		modelo = modelo_;
		numPassageiros = numPassageios_;
		capCombustivel = capCumbustivel_;
		consuCombustivel = consuCombustivel_;
		 
	 }	 
	 public void exibirAutonomia() {
		 System.out.println("Autonomia do ve�culo �: " + capCombustivel * consuCombustivel);
	 }
	 
	 // com retorno e sem parametro
	 double obterAutonomia() {
		 return capCombustivel * consuCombustivel;
	 }
	 

	 public void acelerarCarro() {
		 acelerar = velocidade + 1;
		 System.out.println(acelerar);
	 }
	 
	 public void pararCarro() {
		 acelerar = velocidade - 40;
		 if(acelerar <= 0) {
			 System.out.println("Carro est� parado");
		 
		 }else {
			 System.out.println();
		 }
		 
	 }
	 
	 // com parametro e retorno(quando chamar o metodo na classe que queira usar ter� que informar o par�metro)
	 // Usa-se parametro quando queremos usar uma var�vel que n�o est� declarada na classe.
	 
	 double calcularCombustivel(double km){
		 double qtdCombustivel = km/consuCombustivel;
		 
		 return qtdCombustivel;
		 }

}
