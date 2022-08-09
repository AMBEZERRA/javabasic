package controle_Decisoes_Loops;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		double vAlcool = 1.90;
		double vGasolina = 2.50;
						
				
		System.out.println("Informe o valor em Litro do Alcool");
		double alcool = scan.nextDouble();
		System.out.println("Informe o valor em Litro da Gasolina");
		double gasolina = scan.nextDouble();
		
		double valorVendaAlcool = alcool * vAlcool;
		double valorVendaAlcoolDesco1 = valorVendaAlcool * 0.03;
		double valorVendaAlcoolDesco2 = valorVendaAlcool * 0.05;
		
		
		double valorVendaGasolina = gasolina * vGasolina;
		double valorVendaGasolinaDesco1 = valorVendaGasolina * 0.04;
		double valorVendaGasolinaDesco2 = valorVendaGasolina * 0.06;
		
		System.out.println("Informe o Combustível");
		String combus = scan.next();
		
		if(combus.equalsIgnoreCase("Alcool") & alcool <=20 ) {
			System.out.println("Valor a Pagar:" +  (valorVendaAlcool - valorVendaAlcoolDesco1));
			
		} else {
				System.out.println("Valor a pagar é:" + (valorVendaAlcool  - valorVendaAlcoolDesco2));
			}
	
				
		if(combus.equalsIgnoreCase("Gasolina") & gasolina <=20) {
			System.out.println("Valor a pagar é:" + (valorVendaGasolina - valorVendaGasolinaDesco1));
				
			} else {
				System.out.println("Valor a pagar é:" + (valorVendaGasolina - valorVendaGasolinaDesco2));
			}
		
	}

	}


