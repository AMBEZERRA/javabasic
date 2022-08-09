package aula52_Exceptions_Criando_as_Proprias;

public class CriandoException {

	public static void main(String[] args) {

		int[] numeros = {4, 8, 5, 16, 32, 64, 128};
		int[] denom = {2, 0, 4, 8, 0, 2, 4};
		
		for(int i = 0; i<numeros.length; i++) {
			
			try {
				if(numeros[i] % 2!= 0) {
					System.out.println("Néumero impra divisão não exata");
			}
				System.out.println(numeros[i] + "/" + denom[i] + " = " + (numeros[i]/denom[i]));
			
			}catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.out.println("Erro ao dividir por 0");
			}catch(Exception e1) {
				System.out.println(e1.getMessage());
				e1.printStackTrace();
			} 
						
		}
	}

}
