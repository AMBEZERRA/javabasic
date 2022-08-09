package aula43_Exercicio_Heranca_PagarImposto;

public class Teste {

	public static void main(String[] args) {
		
		
		
		PessoaFisica p1 = new PessoaFisica();
		p1.setNome("Allisson");
		p1.setCpf("895785899");
		p1.setRendaBruta(5000);
		p1.calcularImposto();
		
		PessoaJuridica p2 = new PessoaJuridica();
		p2.setNome("Amachado System");
		p2.setCnpj("054548789421351");
		p2.setRendaBruta(10000);
		p2.calcularImposto();
		
		PessoaFisica p3 = new PessoaFisica();
		p3.setNome("Jurema");
		p3.setCpf("4849875454");
		p3.setRendaBruta(2750);
		p3.calcularImposto();
		
		PessoaJuridica p4 = new PessoaJuridica();
		p4.setNome("System Nascimento");
		p4.setCnpj("1050597979797979");
		p4.setRendaBruta(50000);
		p4.calcularImposto();
		
		PessoaFisica p5 = new PessoaFisica();
		p5.setNome("Clemilda Maria");
		p5.setCpf("258741235");
		p5.setRendaBruta(5500);
		p5.calcularImposto();
		
		PessoaJuridica p6 = new PessoaJuridica();
		p6.setNome("System CSS , HTML");
		p6.setCnpj("00000125445888");
		p6.setRendaBruta(45000);
		p6.calcularImposto();
		
		Contribuinte[] contribuintes = new Contribuinte[6];
		contribuintes[0] = p1;
		contribuintes[1] = p2;
		contribuintes[2] = p3;
		contribuintes[3] = p4;
		contribuintes[4] = p5;
		contribuintes[5] = p6;
		for(Contribuinte c : contribuintes) {
			System.out.println(c.toString());
		}
		
	}

}
