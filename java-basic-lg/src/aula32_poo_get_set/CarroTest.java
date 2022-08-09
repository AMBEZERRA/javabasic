package aula32_poo_get_set;

public class CarroTest {

	public static void main(String[] args) {

		Carro van = new Carro();
		van.setMarca("Fiat");
		van.setModelo("Dobló");
		van.setNumPassageiros(9);
		van.setCapCombustivel(45);
		van.setConsuCombustivel(0.8);
		
		System.out.println(van.getMarca());
		System.out.println(van.getModelo());
		System.out.println(van.getNumPassageiros());
		System.out.println(van.getCapCombustivel());
		System.out.println(van.getConsuCombustivel());
		
		
	}

}
