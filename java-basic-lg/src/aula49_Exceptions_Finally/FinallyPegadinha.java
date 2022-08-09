package aula49_Exceptions_Finally;

public class FinallyPegadinha {

	public static void main(String[] args) {
		
		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] denom = {2, 0, 4, 8, 0};
		
		for(int i = 0; i<numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + denom[i] + " = " + (numeros[i]/denom[i]));
			}catch(ArithmeticException e1) {
				System.out.println("Erro ao dividir por 0");
				System.exit(0);
			} catch(java.lang.ArrayIndexOutOfBoundsException e2) {
				System.out.println("Erro ao tentar ecessar index do array");
				System.exit(0);
			}
			
			finally {
			    System.out.println("Essa linha � impressa sempre ap�s o try catch");
			}
							
		}

	}

}
