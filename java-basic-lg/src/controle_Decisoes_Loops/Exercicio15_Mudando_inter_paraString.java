package controle_Decisoes_Loops;

import javax.swing.JOptionPane;

public class Exercicio15_Mudando_inter_paraString {

	public static void main(String[] args) {
		/*Fa�a um Programa que pe�a os 3 lados de um tri�ngulo. 
		O programa dever� informar se os valores podem ser um tri�ngulo. 
		Indique, caso os lados formem um tri�ngulo, se o mesmo �: equil�tero, is�sceles ou escaleno.
		Dicas:
			Tr�s lados formam um tri�ngulo quando a soma de quaisquer dois lados for maior que o terceiro;
			Tri�ngulo Equil�tero: tr�s lados iguais;
			Tri�ngulo Is�sceles: quaisquer dois lados iguais;
			Tri�ngulo Escaleno: tr�s lados diferentes;
			
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
			System.out.println("� um tri�ngulo:");
		}
		
		if (Integer.parseInt(lado1) == Integer.parseInt(lado2) &&
				Integer.parseInt(lado3) == Integer.parseInt(lado2) 
				 ) {
			System.out.println("Equil�tero");
			
		} else if (Integer.parseInt(lado1) == Integer.parseInt(lado2) &&
				Integer.parseInt(lado1) != Integer.parseInt(lado3) ||
				Integer.parseInt(lado2) == Integer.parseInt(lado3) &&
				Integer.parseInt(lado2) != Integer.parseInt(lado1) ||
				Integer.parseInt(lado3) == Integer.parseInt(lado1) &&
				Integer.parseInt(lado3) != Integer.parseInt(lado2)) {
			System.out.println("Is�sceles");
			
		} else {
			System.out.println("Escaleno");
		}

	}

}
