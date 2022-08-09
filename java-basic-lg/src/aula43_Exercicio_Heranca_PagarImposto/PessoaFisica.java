package aula43_Exercicio_Heranca_PagarImposto;

public class PessoaFisica extends Contribuinte {

	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public double calcularImposto() {
		if(this.getRendaBruta() <= 1400) {
			return 0;
		}else if (this.getRendaBruta() >=1400.01 && this.getRendaBruta() <= 2100) {
			return this.getRendaBruta() * 0.10 -100;
		} else if(this.getRendaBruta() >= 2100.01 && this.getRendaBruta() <= 2800 ) {
			return this.getRendaBruta() * 0.15 - 270;
		} else if(this.getRendaBruta() >= 2800.01 && this.getRendaBruta() <= 3600 ) {
			return this.getRendaBruta() * 0.20 - 500;
		} 
			return this.getRendaBruta() * 0.30 - 700;
		}

	@Override
	public String toString() {
		return "PessoaFisica [cpf= " + cpf + "]" + "," +  "ImpostoPago: " + calcularImposto() + "   " +
				super.toString();
	}
		
			
		
	
	
	
	
	
}
