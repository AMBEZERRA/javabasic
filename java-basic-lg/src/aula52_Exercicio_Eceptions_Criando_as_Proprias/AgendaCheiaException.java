package aula52_Exercicio_Eceptions_Criando_as_Proprias;

public class AgendaCheiaException extends Exception {
	
	@Override
	public String getMessage() {
		return "Agenda cheia";
    	}
	

}
