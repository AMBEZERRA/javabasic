package aula52_Exercicio_Eceptions_Criando_as_Proprias;

public class ContatoNaoExisteException extends Exception {

	private String nomeContato;
	
	public ContatoNaoExisteException(String nomeContato) {
		this.nomeContato = nomeContato;
	}
	
	
	@Override
	public String getMessage() {
		
		return "Contato" + " " + nomeContato + " " + "não existe na Agendas";
	}
}
