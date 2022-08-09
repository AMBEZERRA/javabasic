package testes_loiane;

import java.util.Scanner;



public class Aula13ListaExercicios {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o tamanho do arquivo:");
		double tanArquivo = scan.nextDouble();
		
		System.out.println("Entre com a velocidade da internet:");
		double velInternet = scan.nextDouble();
		
		double tempo = tanArquivo / velInternet;
		System.out.println(tempo);
		
		/*
		double tamanhoMetros = scan.nextDouble();
		double valorLitro = 4.44;
		double valorMetro = 1.48148;
		double valorMetragemCompleta = tamanhoMetros * valorMetro;
		double qtdLatas1= (tamanhoMetros /3) / 18 ;
		double precoTotal = qtdLatas1 * 80;
		
		if (qtdLatas1 >= 0 && qtdLatas1 < 2)  {
			System.out.println("Quantidade de latas é igual a 1");
			
		} else {
			System.out.println("Quantidade total de latas é: " + qtdLatas1);
		}
		
		System.out.println(tamanhoMetros);
		System.out.println(precoTotal);
	   */

		
		/*  Questão 15
		double valorHora = scan.nextDouble();
		double numHoras = scan.nextDouble();
		double valorSalario = valorHora * numHoras;
		double salarioBruto = valorSalario;
		double valorInss = (8* salarioBruto) / 100;
		double valorIr = (11*salarioBruto) /100;
		double valorSindicato = (5 * salarioBruto) /100;
		double salarioliquido = salarioBruto - valorInss - valorIr - valorSindicato;
		
		System.out.println(" + Salário Bruto: =" + salarioBruto);
		System.out.println(" - Imposto de Renda IR: =" + valorIr);
		System.out.println(" - INSS: =" + valorInss);
		System.out.println(" - Sindicato: =" + valorSindicato);
		System.out.println(" - Salário Líquido: =" + salarioliquido);
		*/
				
		
		/* questão 14
		double pesoPeixe = scan.nextDouble();
		double qtdExcedente = pesoPeixe - 50;
		double valorMulta = qtdExcedente * 4;
		
		if (pesoPeixe <=50) {
			System.out.println("O peso do pescado está dentro do regulamento de São Paulo:" +pesoPeixe);
		} else if (pesoPeixe > 50) {
			System.out.println("A quantidade de peixe excede o limite o regulamento em: " + qtdExcedente +"kg");
			System.out.println("O valor da multa por quantidade excedente de pescado é : " +"R$" +valorMulta);
			}
		*/
		
		/*double  numAlturaHomem = scan.nextDouble();
		double  numAlturaMulher = scan.nextDouble();
		double pesoidealHomem = (72.7 * numAlturaHomem) - 58;
		double pesoidealMulher = (62.1 * numAlturaMulher) - 44.7;
		System.out.println(" Peso ideal homem é  :  " + pesoidealHomem);
		System.out.println(" Peso ideal Mulher é  :  " + pesoidealMulher);
		*/
		
		/*double num2 = scan.nextInt();
		double num3 = scan.nextInt();
		double num4 = scan.nextInt();
		double media = (num1 + num2 + num3 + num4)/4;  
		//System.out.println("A média  é: " + media);
		
		// ou assim 
		/*System.out.println("Nome do Doutor em JAVA:  " + nome);
		System.out.println("A nota 1  é: " + num1);
		System.out.println("A nota 2  é: " + num2);
		System.out.println("A nota 3  é: " + num3);
		System.out.println("A nota 4  é: " + num4);
		System.out.println("A média  é: " + media);
		System.out.println("Olá Mundo!!!!");
        */
	}

}
