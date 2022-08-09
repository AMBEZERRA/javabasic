package aula34_construtor_metodo_variavel_static;



public class Calculadora1Test {

	public static void main(String[] args) {

		Calculadora1.calculadoraSoma(2, 2);
		System.out.println(Calculadora1.calculadoraSoma(2, 2));
		
		Calculadora1.calculadoraSubtracao(3, 2);
		System.out.println(Calculadora1.calculadoraSubtracao(3, 2));
		
		Calculadora1.calculadoraMult(2, 5);
		System.out.println(Calculadora1.calculadoraMult(2, 5));
		
		Calculadora1.calculadoraDiv(6, 3);
		System.out.println(Calculadora1.calculadoraDiv(6, 3));
		
		Calculadora1.potencia(2,5);
		System.out.println(Calculadora1.potencia(2, 5));
		
		Calculadora1.CalculadoraMultiplicar(3);
		
		/*Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o númeo que corresponde a num: ");
		int num = scan.nextInt();
		for (int i =0; i<=10; i++) {
			System.out.println(i*num);
		}
		*/
		
	}

}
