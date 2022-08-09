package poo;

public class Exercicio1_Lampada {
	
	String modelo;
	String tensao;
	int potencia;
	String cor;
	String tipoLuz;
	int garantiaMes;
	boolean tipo;
	String[] tipos;
	boolean ligado;
	boolean desligado;
	
	
	void ligado() {
		ligado = true;
		System.out.println("Lampada Ligada");
	}
	
	void desligado() {
		desligado = false;
		System.out.println("Lampada Desligada");
	}
	
	void mudarEstadoLampada() {
		if(ligado == true) {
			ligado = false;
			System.out.println("Lampada Desligada");
		} else {
			ligado = true;
			System.out.println("Lampada Ligada");
		}
	}
	
	
	boolean ascenderLampada(boolean aceso) {
		if(aceso == true) {
			System.out.println("Lampada está ligada");
		}else {
			System.out.println("Lampada apagada");
		}
		return aceso;
	}
	
	
}