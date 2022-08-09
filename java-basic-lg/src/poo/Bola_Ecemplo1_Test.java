package poo;

public class Bola_Ecemplo1_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bola_Exemplo1 bola = new Bola_Exemplo1();
		bola.circunferncia = 360;
		bola.cor = "Amarelo";
		bola.Material = "Gel";
		
		bola.mostrarCor();
		bola.tocarCor("Verde");
		bola.mostrarCor();

	}

}
