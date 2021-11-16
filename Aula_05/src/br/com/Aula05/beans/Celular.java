package br.com.Aula05.beans;

public class Celular extends Produto{
	
	private int cameraMega;
	private int armazenamento;
	
	public Celular() {}
	
	public Celular(int codigo, double preco, String descricao, int cameraMega, int armazenamento) {
		super(codigo, preco, descricao);
		this.cameraMega = cameraMega;
		this.armazenamento = armazenamento;
	}
	
	public int getCameraMega() {
		return cameraMega;
	}
	public void setCameraMega(int cameraMega) {
		this.cameraMega = cameraMega;
	}
	public int getArmazenamento() {
		return armazenamento;
	}
	public void setArmazenamento(int armazenamento) {
		this.armazenamento = armazenamento;
	}
	
	// Metodo 
	@Override
	public void calcImp() {
		// TODO Auto-generated method stub
		System.out.println(("ValorImposto: " + super.getPreco() * 1.50));
		
	}

}
