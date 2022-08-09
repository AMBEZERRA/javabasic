package poo;

public class Carro {
	
	//atributos da classe carra. Caracteristicas
	public String modelo;
	 public String marca;
	 public int numPassageiros;
	 public double capCombustivel;
	 public double consuCombstivel;
	 int velocidade;
	 int acelerar;
	
	 // sem retono  sem parametro
	 public void exibirAutonomia() {
		 System.out.println("Autonomia do ve�culo �: " + capCombustivel * consuCombstivel);
	 }
	 
	 // com retorno e sem parametro
	 double obterAutonomia() {
		 return capCombustivel * consuCombstivel;
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
		 double qtdCombustivel = km/consuCombstivel;
		 
		 return qtdCombustivel;
		 }
	 
}
