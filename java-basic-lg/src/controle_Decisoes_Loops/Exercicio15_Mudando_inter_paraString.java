package controle_Decisoes_Loops;

import javax.swing.JOptionPane;

public class Exercicio15_Mudando_inter_paraString {

	public static void main(String[] args) {
		/*Faça um Programa que peça os 3 lados de um triângulo. 
		O programa deverá informar se os valores podem ser um triângulo. 
		Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
		Dicas:
			Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
			Triângulo Equilátero: três lados iguais;
			Triângulo Isósceles: quaisquer dois lados iguais;
			Triângulo Escaleno: três lados diferentes;
			
			 FIZ USANDO O JOPANE... PRA VARIRAR NESTE CASO TEM QUE TRANSFORMAR A STRING EM INT*/
		
		String lado1 = JOptionPane.showInputDialog("Informe o lado 1");
		String lado2 = JOptionPane.showInputDialog("Informe o lado 2");
		String lado3 = JOptionPane.showInputDialog("Informe o lado 3");
		
		int media = (Integer.parseInt(lado1) + Integer.parseInt(lado2))/2;		
		System.out.println(lado1);
		System.out.println(lado2);
		System.out.println(lado3);
		
		if(Integer.parseInt(lado1) + Integer.parseInt(lado2) > Integer.parseInt(lado3) &&
				Integer.parseInt(lado2) + Integer.parseInt(lado3) > Integer.parseInt(lado1) ) {
			System.out.println("É um triângulo:");
		}
		
		if (Integer.parseInt(lado1) == Integer.parseInt(lado2) &&
				Integer.parseInt(lado3) == Integer.parseInt(lado2) 
				 ) {
			System.out.println("Equilátero");
			
		} else if (Integer.parseInt(lado1) == Integer.parseInt(lado2) &&
				Integer.parseInt(lado1) != Integer.parseInt(lado3) ||
				Integer.parseInt(lado2) == Integer.parseInt(lado3) &&
				Integer.parseInt(lado2) != Integer.parseInt(lado1) ||
				Integer.parseInt(lado3) == Integer.parseInt(lado1) &&
				Integer.parseInt(lado3) != Integer.parseInt(lado2)) {
			System.out.println("Isósceles");
			
		} else {
			System.out.println("Escaleno");
		}

	}

}
