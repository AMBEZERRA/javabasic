package controle_Decisoes_Loops;

import java.util.Scanner;

public class Exercicio3 {
  public static void main(String[] args) {
	/*  Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: 
		  F - Feminino, M - Masculino, Sexo Inválido.*/
	  
	   Scanner scan = new Scanner(System.in);
	  
	  System.out.println("Digite a letra: F - Femenino, M - Masculino:");
	  String letra = scan.nextLine();   // quando é String se compara com .equals() por ser  uma clase
	  if (letra.toUpperCase().equals("M")) {  // usa toUpper ou .equals.ignoreCase().
		  System.out.println("Masculino");
	  } else if(letra.toUpperCase().equals("F")) {
		  System.out.println("Femenino");
	  } else {
		  System.out.println("Letra informada não corresponde a definição sexual");
	  }
	  
	  
  }
	
}
