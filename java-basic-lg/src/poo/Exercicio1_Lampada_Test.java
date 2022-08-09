package poo;

public class Exercicio1_Lampada_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exercicio1_Lampada lampada = new Exercicio1_Lampada();
		
		lampada.cor = "Vermelha";
		//lampada.ascenderLampada(false);
		
		lampada.desligado();
		lampada.mudarEstadoLampada();
		
		System.out.println("A cor da lâmpada é : " + lampada.cor);
	
		
		
	
	}

}
