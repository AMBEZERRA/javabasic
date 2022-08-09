package controle_Decisoes_Loops;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		//Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, 
		//sabendo que a decisão é sempre pelo mais barato.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digitie valor do produto1: ");
		double valorProduto1 = scan.nextDouble();
		
		System.out.println("Digitie valor do produto2: ");
		double valorProduto2 = scan.nextDouble();
		
		System.out.println("Digitie valor produto3: ");
		double valorProduto3 = scan.nextDouble();
		
		if(valorProduto1 <= valorProduto2 && valorProduto1 <= valorProduto3) {
			System.out.println("Compre o produto 1 =" + valorProduto1);
		} else if (valorProduto2 <= valorProduto1 && valorProduto2 <= valorProduto3) {
			System.out.println("Compre o produto 2 =" + valorProduto2);
		}else {
			System.out.println("Compre o produto 3 =" + valorProduto3);
		}
		
		
	}

}
