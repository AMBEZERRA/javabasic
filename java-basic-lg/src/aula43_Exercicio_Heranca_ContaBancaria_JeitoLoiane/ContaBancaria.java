package aula43_Exercicio_Heranca_ContaBancaria_JeitoLoiane;

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
	
	
	public boolean sacar(double valorSaque) {
		if((saldo-valorSaque) >= 0) {
		    saldo-= valorSaque;
		    return true;
		}
		 		
		return  false;
	}
	
	public double depositar(double valorDeposito) {
				
		return  saldo += valorDeposito ;
	}
	
	@Override
	public String toString() {
		return "ContaBancaria  [nomeCliente=" + nomeCliente + ", numConta=" + numConta + ", saldo=" + saldo +  "]" ;
	}
	
	
}
	

