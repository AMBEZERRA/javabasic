package exercicio_loops_for_while_do;

import java.util.Scanner;

public class Exercicio3_loop {

	public static void main(String[] args) {
	
		/*3.Faça um programa que leia e valide as seguintes informações:
			Nome: maior que 3 caracteres;
			Idade: entre 0 e 150;
			Salário: maior que zero;
			Sexo: 'f' ou 'm';
			Estado Civil: 's', 'c', 'v', 'd';*/
		
		boolean salarioValido = false;
		boolean iadadeValido = false;
		boolean sexoValido = false;
		boolean estadoCivilValido = false;
		boolean nomeValido = false;
		
		do {
		Scanner scan = new Scanner(System.in);
	
		
		System.out.println("Informe o Nome: ");
		String nome = scan.next();
		
		System.out.println("Informe a Idade: ");
		int idade = scan.nextInt();
		
		System.out.println("Informe o Salário: ");
		double salario = scan.nextDouble();
        
		System.out.println("Informe o Sexo: ");
		String sexo = scan.next();
		
		System.out.println("Informe o Estado Civil: ");
		String estadoCivil = scan.next();
		
		if(nome.length() <= 3) {
			nomeValido = true;
			System.out.println("Nome: " + nome);
		}else {
			nomeValido = false;
			System.out.println("Digite o um nome válido");
		}
		
		if(estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("v") 
				|| estadoCivil.equalsIgnoreCase("D")) {
			estadoCivilValido = true;
			System.out.println("O Estado Civil é: " + estadoCivil);
		}else {
			estadoCivilValido = false;
			System.out.println("Informe um Estado Civil Válido ");
		}
		
		if(sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F")) {
			sexoValido = true;
			System.out.println("O sexo é = " + sexo);
			
		} else {
			sexoValido = false;
			System.out.println("Digite um sexo válido: ");
		}
		
		
		if(idade > 0 && idade <=50 ) {
			iadadeValido = true;
			System.out.println("Idade é = :" + idade);
		} else {
			iadadeValido = false;
			System.out.println("Idade é não é válida, Digite outra idade");
		}

		if(salario > 0) {
			salarioValido = true;
			System.out.println("Salário: = " + salario);
		} else {
			salarioValido = false;
			System.out.println("Salário inválido, Digite outro valor : ");
		}
		
		
	} while(salarioValido && iadadeValido && sexoValido && estadoCivilValido && nomeValido == false);
	
	}
	
}
