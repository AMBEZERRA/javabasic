package aula43_Exercicio_Heranca_ContaBancaria_JeitoLoiane;

public class ContaEspecial extends ContaBancaria {

	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	@Override
	public String toString() {
		String s = "Conta Especial [";
		s+= "limite: " + limite;
		s+= super.toString();
		s+= "]";
		return s;
	}
	
	public boolean sacar(double valorSaque) {
	    double  saldoComLimite = this.getSaldo() + limite;
	    	    
			if((saldoComLimite-valorSaque) >= 0) {
			    this.setSaldo(this.getSaldo()- valorSaque);
			    return true;
			}
			 		
			return  false;
		}
		 		
		
	
}
