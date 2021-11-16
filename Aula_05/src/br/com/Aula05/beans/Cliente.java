package br.com.Aula05.beans;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String fone;
	
	
	// Construtor
	public Cliente() {}
	
	public Cliente(String nome, String cpf, String fone) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.fone = fone;
	}
	
	
	// Getter / Setters	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	

}
