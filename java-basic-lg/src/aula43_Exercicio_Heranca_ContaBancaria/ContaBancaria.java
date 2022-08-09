package aula43_Exercicio_Heranca_ContaBancaria;

public class ContaBancaria {
	
	private String nomeCliente;
	private String numConta;
	private double saldo;
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public double setSaldo(double saldo) {
		return this.saldo = saldo;
	}
	
	
	public double sacar(double valorSaque) {
		if(valorSaque > saldo) {
			System.out.println("Saque excede o limite. Operação não realizada");
		}
		 		
		return   saldo -= valorSaque;
	}
	
	public double depositar(double valorDeposito) {
				
		return  saldo += valorDeposito ;
	}
	
	@Override
	public String toString() {
		return "ContaBancaria [nomeCliente=" + nomeCliente + ", numConta=" + numConta + ", saldo=" + saldo +  "]" ;
	}
	
	
}
	

