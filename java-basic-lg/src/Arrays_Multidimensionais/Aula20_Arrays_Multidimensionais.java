package Arrays_Multidimensionais;

public class Aula20_Arrays_Multidimensionais {

	public static void main(String[] args) {
		// TODO 
		
		String[] nomeAlunos = new String[4];
		double [][] notasAlunos = new double[4][4];
		nomeAlunos[0] = "Allisson";
		notasAlunos[0][0] = 8;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 7.5;
		
		nomeAlunos[1] = "Juan";
		notasAlunos[1][0] = 8;
		notasAlunos[1][1] = 6;
		notasAlunos[1][2] = 10;
		notasAlunos[1][3] = 8.5;
		
		nomeAlunos[2] = "Miguel";
		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 6;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 8.5;
		
		nomeAlunos[3] = "Taty";
		notasAlunos[3][0] = 8;
		notasAlunos[3][1] = 6;
		notasAlunos[3][2] = 10;
		notasAlunos[3][3] = 8.5;
		
		for(int i= 0; i< notasAlunos.length; i++) {
			for(int j =0; j<notasAlunos[i].length; j++ ) {
				System.out.println(nomeAlunos[i] + " : "+  i + " : " + notasAlunos[i][j]);
			}
		}
			

	}

}
