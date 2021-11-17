package br.com.aula06.beans;

public class Atendente extends Pessoa{
	
	public Atendente(String nome, String cpf, String fone) {
		super(nome, cpf, fone);
	}

	@Override
	public void pesquisar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void salvar() {
		System.out.println("Salvando Atendente");
		
	}

	@Override
	public void excluir() {
		// TODO Auto-generated method stub
		
	}

}
