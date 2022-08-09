package aula34_construtor_metodo_variavel_static;

public class Fatorial {
	public static int fatorial(int num) {
		if(num ==0) {
			return 1;
		}
		int total = 1;
		for (int i = num; i>1; i--) {
			total *= i;
		}
		return total;
	}
	
	public int fatorial1(int num) {
		if(num ==0) {
			return 1;
		}
		return num* fatorial(num-1);
	}
	

}
