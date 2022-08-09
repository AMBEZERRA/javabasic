package aula46Heranca_Interface_Exercicio1;

public class Teste {
	public static void main(String[] args) {
		
		Triangulo tri = new Triangulo();
		tri.setNome("Triangulo");
		tri.setCor("Azul");
		tri.setAltura(21);
		tri.setBase(3);
		tri.calcularArea();
		System.out.println(tri);
		
		System.out.println("****************** //****************************");
		
		Circulo roda = new Circulo();
		roda.setCor("Amarelo");
		roda.setNome("Ciruclo Amarelo");
		roda.setRaio(5);
		roda.calcularArea();
		
		System.out.println(roda);
		
		System.out.println("****************** //****************************");
		
		Quadrado quadr = new Quadrado();
		quadr.setNome("Quadrado");
		quadr.setCor("Marron");
		quadr.setLado(2);
		quadr.calcularArea();
		
		System.out.println(quadr);
		
		System.out.println("****************** //****************************");
		Piramide queopes = new Piramide();
		queopes.setaB(3);
		queopes.setNome("Queópes");
		queopes.setCor("Areia");
		queopes.setH(2);
		queopes.calcularVolume();
		
		System.out.println(queopes);
		
		System.out.println("****************** //****************************");
		
		Cilindro cilin = new Cilindro();
		cilin.setCor("Metalico");
		cilin.setNome("Cilindro de Compressão");
		cilin.setH(2);
		cilin.setR(2);
		cilin.calcularVolume();
		
		System.out.println(cilin);
		
		System.out.println("****************** //****************************");
		
		Cubo cub = new Cubo();
		cub.setNome("Cubo Mágico");
		cub.setCor("Vermelho");
		cub.setA(2);
		cub.calcularVolume();
		
		System.out.println(cub);
		
		System.out.println("****************** //****************************");
		
		FiguraGeometrica [] figura = new FiguraGeometrica[6];
		figura[0] = tri;
		figura[1] = roda;
		figura[2] = quadr;
		figura[3] = queopes;
		figura[4] = cilin;
		figura[5] = cub;
		for(FiguraGeometrica c : figura) {
			System.out.println(c);
		}
		
	}

}
