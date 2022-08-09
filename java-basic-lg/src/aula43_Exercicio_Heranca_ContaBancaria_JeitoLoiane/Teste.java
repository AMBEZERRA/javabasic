package aula43_Exercicio_Heranca_ContaBancaria_JeitoLoiane;

public class Teste {

	public static void main(String[] args) {

		System.out.println("Conta Simples");
		
		ContaBancaria contaSimples = new ContaBancaria();
		contaSimples.setNomeCliente("Juan Andrade");
		contaSimples.setNumConta("1111");
		
		contaSimples.depositar(100);
		
		realizarSaque(contaSimples, 50);
		
		realizarSaque(contaSimples, 70);
						
		System.out.println(contaSimples);
		
        System.out.println("Conta Poupança");
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setNomeCliente("Taty Andrade");
		contaPoupanca.setNumConta("22222");
		contaPoupanca.setDiaRendimento(1);
		contaPoupanca.depositar(100);
		
		realizarSaque(contaPoupanca, 50);
		
		realizarSaque(contaPoupanca, 70);
		
		if(contaPoupanca.calcularNovoSaldo(0.5)) {
			System.out.println("Rendimento Aplicado, novo saldo é = "  + contaPoupanca.getSaldo());
		}else {
			System.out.println("Hoje não é dia de Rendimento, novo saldo não calculado");
		}
						
		System.out.println(contaPoupanca);
		
		 System.out.println("***Conta Especial****");
			
			ContaEspecial contaEspecial = new ContaEspecial();
			contaEspecial.setNomeCliente("Allisson Nascimentos");
			contaEspecial.setNumConta("33333");
			contaEspecial.setLimite(50);
			//contaEspecial.setDiaRendimento(1);
			contaEspecial.depositar(100);
			
			realizarSaque(contaEspecial, 50);
			
			realizarSaque(contaEspecial, 70);
			realizarSaque(contaEspecial, 80);
			
			
			if(contaPoupanca.calcularNovoSaldo(0.5)) {
				System.out.println("Rendimento Aplicado, novo saldo é = "  + contaPoupanca.getSaldo());
			}else {
				System.out.println("Hoje não é dia de Rendimento, novo saldo não calculado");
			}
							
			System.out.println(contaEspecial);
	}
	
	
	
	private static void realizarSaque(ContaBancaria conta, double valor) {
		if(conta.sacar(valor)) {
			System.out.println("Saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
		}else {
			System.out.println("Saldo insuficiente para saque de:" + valor + " " +  "Saldo de = " + conta.getSaldo() );
		}
	}

}
