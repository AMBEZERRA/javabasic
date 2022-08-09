package aula31_public_private;

public class CarroTest {

	public static void main(String[] args) {

		Carro van = new Carro();
		van.setMarca("Fiat");
		van.numPassageiros = 4;
		
		System.out.println(van.getMarca() + " , " + van.numPassageiros);
		
	}

}
