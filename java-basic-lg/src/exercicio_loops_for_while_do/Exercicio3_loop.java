package exercicio_loops_for_while_do;

import java.util.Scanner;

public class Exercicio3_loop {

	public static void main(String[] args) {
	
		/*3.Fa�a um programa que leia e valide as seguintes informa��es:
			Nome: maior que 3 caracteres;
			Idade: entre 0 e 150;
			Sal�rio: maior que zero;
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
		
		System.out.println("Informe o Sal�rio: ");
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
			System.out.println("Digite o um nome v�lido");
		}
		
		if(estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("v") 
				|| estadoCivil.equalsIgnoreCase("D")) {
			estadoCivilValido = true;
			System.out.println("O Estado Civil �: " + estadoCivil);
		}else {
			estadoCivilValido = false;
			System.out.println("Informe um Estado Civil V�lido ");
		}
		
		if(sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F")) {
			sexoValido = true;
			System.out.println("O sexo � = " + sexo);
			
		} else {
			sexoValido = false;
			System.out.println("Digite um sexo v�lido: ");
		}
		
		
		if(idade > 0 && idade <=50 ) {
			iadadeValido = true;
			System.out.println("Idade � = :" + idade);
		} else {
			iadadeValido = false;
			System.out.println("Idade � n�o � v�lida, Digite outra idade");
		}

		if(salario > 0) {
			salarioValido = true;
			System.out.println("Sal�rio: = " + salario);
		} else {
			salarioValido = false;
			System.out.println("Sal�rio inv�lido, Digite outro valor : ");
		}
		
		
	} while(salarioValido && iadadeValido && sexoValido && estadoCivilValido && nomeValido == false);
	
	}
	
}
