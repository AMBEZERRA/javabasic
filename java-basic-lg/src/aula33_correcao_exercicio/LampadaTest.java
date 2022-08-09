package aula33_correcao_exercicio;

public class LampadaTest {

	public static void main(String[] args) {
		
		Lampada lamp  = new Lampada();
		lamp.ligado();
		
		lamp.mudarEstadoLampada();
		
		Lampada lamp2 = new Lampada("Turbo", "35", 65, "Azul", null, 0, false, args, false, false);
		System.out.println(lamp2.getCor() + "," +  lamp2.getModelo());

	}

}
