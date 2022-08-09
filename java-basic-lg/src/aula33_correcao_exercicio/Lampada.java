package aula33_correcao_exercicio;

public class Lampada {

	private String modelo;
	private String tensao;
	private int potencia;
	private String cor;
	private String tipoLuz;
	private int garantiaMes;
	private boolean tipo;
	private String[] tipos;
	boolean ligado;
	
	public Lampada() {
		
	}
	
	public Lampada(String modelo, String tensao, int potencia, String cor, String tipoLuz, int garantiaMes,
			boolean tipo, String[] tipos, boolean ligado, boolean desligado) {
		super();
		this.modelo = modelo;
		this.tensao = tensao;
		this.potencia = potencia;
		this.cor = cor;
		this.tipoLuz = tipoLuz;
		this.garantiaMes = garantiaMes;
		this.tipo = tipo;
		this.tipos = tipos;
		this.ligado = ligado;
		this.desligado = desligado;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	public boolean isDesligado() {
		return desligado;
	}
	public void setDesligado(boolean desligado) {
		this.desligado = desligado;
	}

	boolean desligado;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTensao() {
		return tensao;
	}
	public void setTensao(String tensao) {
		this.tensao = tensao;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTipoLuz() {
		return tipoLuz;
	}
	public void setTipoLuz(String tipoLuz) {
		this.tipoLuz = tipoLuz;
	}
	public int getGarantiaMes() {
		return garantiaMes;
	}
	public void setGarantiaMes(int garantiaMes) {
		this.garantiaMes = garantiaMes;
	}
	public boolean isTipo() {
		return tipo;
	}
	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}
	public String[] getTipos() {
		return tipos;
	}
	public void setTipos(String[] tipos) {
		this.tipos = tipos;
	}
	
	// aqui foram os metodos criados por mim 
	void ligado() {
		this.ligado = true;
		System.out.println("Lampada Ligada");
	}
	
	void desligado() {
		this.desligado = false;
		System.out.println("Lampada Desligada");
	}
	
	void mudarEstadoLampada() {
		if(this.ligado == true) {
			this.ligado = false;
			System.out.println("Lampada Desligada");
		} else {
			this.ligado = true;
			System.out.println("Lampada Ligada");
		}
	}
	
	
	boolean ascenderLampada(boolean aceso) {
		if(aceso == true) {
			System.out.println("Lampada está ligada");
		}else {
			System.out.println("Lampada apagada");
		}
		return aceso;
	}
	
}
