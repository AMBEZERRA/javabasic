package aula43_Exercicio_Heranca_ContaBancaria;

public class ContaEspecial extends ContaBancaria {

	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public double sacar(double valorSaque) {
		if(valorSaque > limite) {
			System.out.println("Saque Excede o Limite disponível.");
		}
		double s = setSaldo(getSaldo()) + limite;		 		
		return  s - valorSaque;
	}
}
