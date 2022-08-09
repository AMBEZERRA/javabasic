package loops_while_dowhile;

public class Do_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;  // count ou cont
		int max = 10;
		
		System.out.println("Contando até:" + max);

		while(i <= max) {
		 
			System.out.println("Valor de i: " + i);
			 i++;  // i = i + 1; ou i += 1;
		}
		
		System.out.println(i);
		
		do {
			
			i++;
			System.out.println("Valor de i:" + i);
		} while (i < 15 );
		
		System.out.println(i);
	}

}
