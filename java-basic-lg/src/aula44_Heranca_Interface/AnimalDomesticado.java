package aula44_Heranca_Interface;

public interface AnimalDomesticado {

	public final int ANO = 2016; // quando tem o final vira constante pois interface não tem atributo 
	
	public abstract void levarVeterinario();
	
	public abstract void alimentar();
	
}
