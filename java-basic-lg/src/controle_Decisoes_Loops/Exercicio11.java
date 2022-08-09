package controle_Decisoes_Loops;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Infore o Slario: R$");
		double salario = scan.nextDouble();
		
		double reajuste1 = (salario * 0.2) + salario; 
		double reajuste2 = (salario * 0.15) + salario;
		double reajuste3 = (salario * 0.1) + salario;
		double reajuste4 = (salario * 0.05) + salario; 
		
		if(salario <= 280.00) {
			System.out.println("Salario antes do Reajuste: = " + salario);
			System.out.println("Percentual do Ajuste é de : =  20% " );
			System.out.println("Valor do aumento é de : = " + salario * 0.20);
			System.out.println("Novo salário após o aumento é : = " + reajuste1);
			
		} else if (salario >= 280.00 && salario <= 700.00) {
			System.out.println("Salario antes do Reajuste: = " + salario);
			System.out.println("Percentual do Ajuste é de : =  15% " );
			System.out.println("Valor do aumento é de : = " + salario * 0.15);
			System.out.println("Novo salário após o aumento é : = " + reajuste2);
			
		} else if (salario >= 700.00 && salario <=1500.00) {
			System.out.println("Salario antes do Reajuste: = " + salario);
			System.out.println("Percentual do Ajuste é de : =  10% " );
			System.out.println("Valor do aumento é de : = " + salario * 0.10);
			System.out.println("Novo salário após o aumento é : = " + reajuste3);
			
		} else {
			System.out.println("Salario antes do Reajuste: = " + salario);
			System.out.println("Percentual do Ajuste é de : =  5% " );
			System.out.println("Valor do aumento é de : = " + salario * 0.05);
			System.out.println("Novo salário após o aumento é : = " + reajuste4);
		}
		
		

	}

}
