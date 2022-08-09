package poo;

public class Aluno {
	
	String nome;
	String matricula;
	String nomeCurso;
	String [] nomeDisciplina = new String[3];
	double [] []notasDisciplinas = new double[3][4];

	void mostrarInfo() {
		System.out.println("Nome; " + nome);
		System.out.println("Matricula; " + matricula);
		System.out.println("Nome do Curso; " + nomeCurso);
		
		for(int i=0; i<notasDisciplinas.length; i++ ) {
			System.out.println("Notas das disciplinas" + " " + nomeDisciplina[i]);
			for(int j =0; j<notasDisciplinas[i].length; j++) {
				System.out.println(notasDisciplinas[i][j] +  " ");
			}
			
			System.out.println();
		}
	}
	
	boolean verificarAprovado(int indice) {
		double soma=0;
		
		for (int i=0; i<notasDisciplinas[indice].length; i++) {
			soma +=  notasDisciplinas[indice][i];
		}
		
		double media = soma /4;
		
		if(media>=7) {
			return true;
		}else {
			return false;
		}
		
		
		}
}