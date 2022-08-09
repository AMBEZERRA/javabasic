package controle_Decisoes_Loops;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		// O 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o tipo de Carne:");
		String tipoCarne = scan.next();

		System.out.println("Informe a Quantidade de (kg):");
		double carneKg = scan.nextDouble();
		
		   double precoFileDuplo =0;
		if( precoFileDuplo <= 5 ) {
			
			precoFileDuplo = 4.90;
			} else {
				precoFileDuplo = 5.80;
			}
		
		   double precoAlcatra = 0;
		if( precoAlcatra <= 5) {
			 precoAlcatra = 5.90;
				
			} else {
				precoAlcatra = 6.80;
			}
		
		
		double precoPicanha =0;
		if(precoPicanha <= 5) {
			precoPicanha = 6.90;
			} else {
				precoPicanha = 7.80;
			}
		
		
		double precoTotalFileDuplo = precoFileDuplo * carneKg;
		double precoTotalAlcatra = precoAlcatra * carneKg;
		double precoTotalPicanha = precoPicanha * carneKg;
		
		if(tipoCarne.equalsIgnoreCase("Picanha")){
				System.out.println("Tipo da Carne: " + tipoCarne + " Quantidade KG: " + carneKg
						+ " Preço Total da Picanha: " + precoTotalPicanha);
		
		} else if (tipoCarne.equalsIgnoreCase("Alcatra")) {
			System.out.println("Tipo da Carne: " + tipoCarne + " Quantidade KG: " + carneKg
					+ " Preço Total da Alcatra: " + precoTotalAlcatra);
			
		} else if(tipoCarne.equalsIgnoreCase("File")) {
			System.out.println("Tipo da Carne: " + tipoCarne + " Quantidade KG: " + carneKg
					+ " Preço Total do File Duplo: " + precoTotalFileDuplo );
		}
		
	   // faltou validar a compra por cartão (mas o código ta perfeito : no proximo exercicio copiarei o codigo dela)	
		
		 }
		
		}
		
		
	


