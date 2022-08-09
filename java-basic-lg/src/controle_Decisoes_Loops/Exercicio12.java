package controle_Decisoes_Loops;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		//cálculo de IR com variação salarial
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a quantidade de horas trabalhada:");
		double qtdHoras = scan.nextDouble();
		
		System.out.println("Informe o valor da hora trabalhada");
		double valorHora = scan.nextDouble();
		
		
		double salarioBruto = qtdHoras * valorHora;
		double ir1 = (salarioBruto * 0.2);  
		double ir2 = (salarioBruto * 0.1);
		double ir3 = (salarioBruto * 0.05);
		double fgts = (salarioBruto * 0.11) ;
		double sindicato = (salarioBruto * 0.03);
		double inss = (salarioBruto * 0.10) ;
		
		System.out.println("Salario Bruto é: = " + salarioBruto);
		
		if(salarioBruto > 900 && salarioBruto <= 1500) {
			System.out.println("Salário Bruto  : " + qtdHoras + " * " + valorHora + " = " + salarioBruto);
			System.out.println("(-) IR (5%)    : " + ir3 );
			System.out.println("(-) INSS (10%) :" + inss);
			System.out.println("FGTS (11%)     :" + fgts);
			System.out.println("Total desconto :" + (ir3 + inss) );
			System.out.println("Salario Liquido:" + (salarioBruto - ir3 - inss) );
			
		} else if(salarioBruto > 1500 && salarioBruto <= 2500) {
			System.out.println("Salário Bruto  : " + qtdHoras + " * " + valorHora + " = " + salarioBruto);
			System.out.println("(-) IR (10%)    : " + ir2 );
			System.out.println("(-) INSS (10%) :" + inss);
			System.out.println("FGTS (11%)     :" + fgts);
			System.out.println("Total desconto :" + (ir2 + inss) );
			System.out.println("Salario Liquido:" + (salarioBruto - ir2 - inss) );
		
		} else if(salarioBruto > 2500) {
			System.out.println("Salário Bruto  : " + qtdHoras + " * " + valorHora + " = " + salarioBruto);
			System.out.println("(-) IR (20%)    : " + ir1 );
			System.out.println("(-) INSS (10%) :" + inss);
			System.out.println("FGTS (11%)     :" + fgts);
			System.out.println("Total desconto :" + (ir1 + inss) );
			System.out.println("Salario Liquido:" + (salarioBruto - ir1 - inss) );
		
		} else {
			System.out.println("Salário Bruto  : " + qtdHoras + " * " + valorHora + " = " + salarioBruto);
			System.out.println("(-) INSS (10%) :" + inss);
			System.out.println("FGTS (11%)     :" + fgts);
			System.out.println("Total desconto :" + (inss) );
			System.out.println("Salario Liquido:" + (salarioBruto - inss) );
			
		}	
		

	}

}
