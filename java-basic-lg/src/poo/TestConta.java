package poo;

public class TestConta {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.numConta = 125648;
		conta.nomeTitular= "Juan Miguel";
		conta.especial= true;
		conta.limite = 5000.00;
		conta.saldo = 5000.00;
		
			
		System.out.println(conta.saqueDinheiro(500) + " + " + conta.depositarDinheiro(1500));
		conta.saqueDinheiro(1000);
		System.out.println(conta.saqueDinheiro(6000));
		conta.depositarDinheiro(450);
		System.out.println(conta.depositarDinheiro(450));
		
		
		System.out.println(conta.nomeTitular + "," + conta.limite + "," +  conta.numConta + "," + conta.saldo);

	}

}
