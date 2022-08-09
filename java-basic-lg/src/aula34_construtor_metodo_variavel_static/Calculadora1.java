package aula34_construtor_metodo_variavel_static;

public class Calculadora1 {
	
	public static double calculadoraSoma(double num1, double num2) {
	   return  num1 + num2;	
	}
	
	public static double calculadoraSubtracao(double num1, double num2) {
		   return  num1 - num2;	
		}
	
	public static double calculadoraMult(double num1, double num2) {
		   return  num1 * num2;	
		}
	public static double calculadoraDiv(double num1, double num2) {
		   return  num1 / num2;	
		}
	public static double potencia (int num1, int num2) {
		return Math.pow(num1, num2);

}
	public static void  CalculadoraMultiplicar(int num1) {
		
		for (int i =0; i<=10; i++) {
			System.out.println(i*num1);
		}
	}
	
   public static int fatorial(int num) {
	   return num;
   }
		
}
	
