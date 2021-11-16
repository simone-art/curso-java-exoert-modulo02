package br.com.Aula05.beans;

import br.com.Aula05.Interface.PadraoImposto;

public class Produto implements PadraoImposto{
	
	private int codigo;
	private double preco;
	private String descricao;
	
	public Produto() {}
	
	public Produto(int codigo, double preco, String descricao) {
		super();
		this.codigo = codigo;
		this.preco = preco;
		this.descricao = descricao;
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public void calcImp() {
		// TODO Auto-generated method stub
		
	}
	
	// Metodo
//	public void calcImpostoPAI() {
//		System.out.println("ValorImposto: " + (preco * 1.20));
//	}
	

}
