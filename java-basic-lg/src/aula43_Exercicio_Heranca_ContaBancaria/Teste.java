package aula43_Exercicio_Heranca_ContaBancaria;

public class Teste {

	public static void main(String[] args) {
		
		ContaBancaria conta = new ContaBancaria();
		conta.setNomeCliente("Juan Miguel");
		conta.setNumConta("12456897");
		conta.setSaldo(500);

		conta.depositar(600);
		conta.sacar(20);	
	
		System.out.println(conta);
		
		ContaPoupanca poupanca = new ContaPoupanca();
		poupanca.setNomeCliente("Allisson");
		poupanca.setNumConta("4589878");
		poupanca.setSaldo(400);
		poupanca.depositar(100);
		poupanca.sacar(30);
		poupanca.setDiaRendimento(8);
			    	
	    System.out.println(poupanca);
	    System.out.println("Novo Saldo = " + poupanca.calcularNovoSaldo(1.6));
	    
	    ContaEspecial especial = new ContaEspecial();
	    especial.setNomeCliente("Victoria Chagas");
	    especial.setNumConta("8578485");
	    especial.setSaldo(300);
	    especial.setLimite(500);
	    
	    especial.sacar(400);
	    System.out.println(especial);
	    System.out.println("Saldo = " + especial.sacar(1000));
	    
	    
	}
}
