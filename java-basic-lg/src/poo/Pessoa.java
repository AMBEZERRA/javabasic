package poo;

public class Pessoa {
	String nome;
	int idade;
	double peso;
	double altura;
	
	//Métodos: Envelhercer, engordar, emagrecer, crescer. Obs: Por padrão, 
	//a cada ano que nossa pessoa envelhece, sendo a idade dela menor que 21 anos,
	// ela deve crescer 0,5 cm.

	void envelhecer() {
		
		if(idade <21) {
			altura += 0.05;
			idade+= +1;
		}else {
			idade += +1;  
		}
		System.out.println(idade);
	}
	
	void engordar() {
		peso += +1; 
	}
	
	void emagrecer() {
		peso -= - 1; 
	}
}
