package aula43_Exercicio_Heranca_ContaBancaria;

public class ContaPoupanca extends ContaBancaria {
	private int diaRendimento;
	
	
	
	
	public int getDiaRendimento() {
		return diaRendimento;
	}




	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}




	// n�o conseguir fazer o calculo pois n�o consigo puxar o saldo informado da classe pai
	public double calcularNovoSaldo(double taxaRendimento) {
		double s = taxaRendimento * diaRendimento;
		// System.out.println("Taxa de Rendimento : = " + s);
		return s + setSaldo(getSaldo());
		
	}

	

}
