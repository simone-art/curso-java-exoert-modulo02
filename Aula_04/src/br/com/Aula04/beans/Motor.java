package br.com.Aula04.beans;

public class Motor {
	
	private int potencia;
	private int cilindros;
	private String combustivel;
	
	public Motor(int potencia, int cilindros, String combustivel) {
		super();
		this.potencia = potencia;
		this.cilindros = cilindros;
		this.combustivel = combustivel;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public int getCilindros() {
		return cilindros;
	}
	public void setCilindros(int cilindros) {
		this.cilindros = cilindros;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

}
