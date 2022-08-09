package poo;

public class Conta {

	int numConta;
	String nomeTitular;
	double saldo;
	boolean especial;
	double limite;
	
	
	double saqueDinheiro(double saque) {
		if(saldo >= saque) {
		   saldo -=  saque;
		} else {
			System.out.println("Saque não permitido, valor excede o limite");
		}
		return saldo;
		
		}
	
	double depositarDinheiro(double deposito) {
		saldo += deposito;
		return saldo;
	}
	
	void consultarSaldo () {
	  System.out.println("Saldo atual é  de: " + saldo);
	  
	  }
	
		
	
	}
	

