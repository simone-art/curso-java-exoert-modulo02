package br.com.Aula05.beans;

public class Livro extends Produto{
	
	private String autor;
	private String isbn;
	
	
	
	public Livro() {}
	
	public Livro(int codigo, double preco, String descricao, String autor, String isbn) {
		super(codigo, preco, descricao);
		this.autor = autor;
		this.isbn = isbn;
	}


	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public void calcImp() {
		System.out.println(("ValorImposto: " + super.getPreco() * 1.10));
	}	

}
