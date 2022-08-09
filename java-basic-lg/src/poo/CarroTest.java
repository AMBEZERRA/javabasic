package poo;

public class CarroTest {

	public static void main(String[] args) {
		
		Carro fusca = new Carro();
		fusca.marca = "Wolksvagem";
		fusca.modelo = "1300 Fafá de belém";
		fusca.numPassageiros = 4;
		fusca.capCombustivel = 55;
		fusca.consuCombstivel = 6.4;
		fusca.acelerar = 65;
		fusca.velocidade = 100;
		
		
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consuCombstivel = 2.4;
		van.acelerar = 120;
		van.velocidade = 40;
		
		System.out.println(fusca.marca);
		System.out.println(fusca.modelo);
		System.out.println(fusca.numPassageiros);
		System.out.println(fusca.capCombustivel);
		System.out.println(fusca.consuCombstivel);
		fusca.exibirAutonomia();
		fusca.acelerarCarro();
		fusca.pararCarro();
		System.out.println(fusca.calcularCombustivel(10));
		System.out.println("A autonomia do carro é de " + fusca.obterAutonomia() + " KM");

		
		System.out.println();
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		System.out.println(van.numPassageiros);
		System.out.println(van.capCombustivel);
		System.out.println(van.consuCombstivel);
		van.exibirAutonomia();
		van.acelerarCarro();
		van.pararCarro();
		System.out.println(van.calcularCombustivel(15));
		System.out.println("A autonomia do carro é de " + van.obterAutonomia() + " KM");

	}

}
