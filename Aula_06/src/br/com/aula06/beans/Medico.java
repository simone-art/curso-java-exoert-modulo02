package br.com.aula06.beans;

public class Medico extends Pessoa{
	
	private String especialidade;
	private String crm;
	
	
	public Medico(String nome, String cpf, String fone, String especialidade, String crm) {
		super(nome, cpf, fone);
		this.especialidade = especialidade;
		this.crm = crm;
	}
	

	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}


	@Override
	public void pesquisar() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void salvar() {
		System.out.println("Salvando Medico");
	}


	@Override
	public void excluir() {
		// TODO Auto-generated method stub
		
	}
	

}
