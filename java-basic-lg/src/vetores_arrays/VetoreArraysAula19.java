package vetores_arrays;

public class VetoreArraysAula19 {

	public static void main(String[] args) {
		// armazenar a temperatura m�dia de 1 ano
		
		double[] temperatura = new double[365];
		temperatura[0] = 33.5;
		temperatura[1] = 32.5;
		temperatura[2] = 30.5;
		temperatura[3] = 31.7;
		temperatura[4] = 30.9;
		
		System.out.println("Temperatura dia 2: " + temperatura[2]);
		System.out.println("Tamanho do Arrays: " + temperatura.length);
		System.out.println("Os valores do Arrays s�o: " );
		
		for(int i=0; i <temperatura.length; i++) {
			System.out.println("Os valores da temperatura do dia  "  + (i+1) + " �: " + temperatura[i]);
		}
		
		for(double temp : temperatura) {
			System.out.println(temp);
		} 	
		
		

	}

}
