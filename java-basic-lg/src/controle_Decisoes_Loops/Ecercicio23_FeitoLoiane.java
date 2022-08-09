package controle_Decisoes_Loops;

import java.util.Scanner;

public class Ecercicio23_FeitoLoiane {

	public static void main(String[] args) {
		//Conta do açougue 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o tipo de carne:");
		System.out.println("1 - File Duplo");
		System.out.println("2 - Alcatra");
		System.out.println("3 - Picanha");
		int tipo = scan.nextInt();
		
		System.out.println("Entre com a quantidade de carne:");
		double qtd = scan.nextDouble();
		
		double precoKg = 0;
		if (tipo == 1) {
			
			System.out.println( qtd + "Kg - File Duplo");
		}
			if(qtd <=5) {
				precoKg = 4.90;
			}else {
				precoKg = 5.80;
			}
			
			
			if (tipo == 2) {
				System.out.println( qtd + "Kg - Alcatra");
			}
				if(qtd <=5) {
					precoKg = 5.90;
				}else {
					precoKg = 6.80;
				}
				
			if (tipo == 3) {
				System.out.println( qtd + "Kg - Picanha");
				if(qtd <=5) {
					precoKg = 6.90;
				}else {
					precoKg = 7.80;
					}
				
				}
		
			double total = qtd * precoKg;
			System.out.println( qtd + "Kg *" + precoKg + " = " + total );
			
			System.out.println("Compra no cartão: Digite 1 para sim ");
			int cartao = scan.nextInt();
			
			if (cartao == 1) {
				double desconto = (total/ 100) *5;
				System.out.println(" Desconto de : " + desconto);
				System.out.println("Valor a pagar: " + (total-desconto));
				
				} else {
					System.out.println("Valor a pagar" + total);
				}
			
			
			
	}

}
