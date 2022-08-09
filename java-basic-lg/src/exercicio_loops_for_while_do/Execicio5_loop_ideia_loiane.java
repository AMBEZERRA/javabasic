package exercicio_loops_for_while_do;

import java.util.Scanner;

public class Execicio5_loop_ideia_loiane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner scan = new Scanner(System.in);
		
		double popA;
		double popB;
	    double taxA;
	    double taxB;
	    
	    boolean valido = false;
	    
	    do {
	    	System.out.println("Entre com a população A:");
	    	popA = scan.nextDouble();
	    	
	    	if(popA > 0) {
	    		valido = true;
	    	} else {
	    		valido = false;
	    		System.out.println("Infome o número da população de A válido:");
	    	}
	    	
	    } while(valido == false);
	    

	    valido = false;
	    do {
	    	System.out.println("Entre com a população B:");
	    	popB = scan.nextDouble();
	    	
	    	if(popB > 0) {
	    		valido = true;
	    	} else {
	    		valido = false;
	    		System.out.println("Infome o número da população de B válido:");
	    	}
	    	
	    } while(valido == false);
	    
	    
	    valido = false;
	    do {
	    	System.out.println("Entre com a taxa de crescimento da população A:");
	    	taxA = scan.nextDouble();
	    	
	    	if(taxA > 0) {
	    		valido = true;
	    	} else {
	    		valido = false;
	    		System.out.println("Infome o número da taxa da população de A válido:");
	    	}
	    	
	    } while(valido == false);
	    
	    valido = false;
	    do {
	    	System.out.println("Entre com a taxa de crescimento da população B:");
	    	taxB = scan.nextDouble();
	    	
	    	if(taxB > 0) {
	    		valido = true;
	    	} else {
	    		valido = false;
	    		System.out.println("Infome o número da taxa da população de B válido:");
	    	}
	    	
	    } while(valido == false);
	    
	    
int cont = 0;
		
		while(popA < popB) {
			popA += (popA / 100) *taxA;
			popB += (popB /100) *taxB;
			cont++;
		}
		
		System.out.println("População A:" + popA);
		System.out.println("População B:" + popB);
		System.out.println("Quantidade de Anos: " + cont);
	}

}
