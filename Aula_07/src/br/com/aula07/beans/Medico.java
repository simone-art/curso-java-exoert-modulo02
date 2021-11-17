package br.com.aula07.beans;

public class Medico extends Funcionario{
	
	private String especialidade;
	private String crm;
	
	
	public Medico(String nome, String cpf, String fone, String dtAdmissao, String dtDemissao, double salario,
			String departamento, String especialidade, String crm) {
		super(nome, cpf, fone, dtAdmissao, dtDemissao, salario, departamento);
		this.especialidade = especialidade;
		this.crm = crm;
	}
	
	//Precisa deste constructor com 5 par�metros,3 da classe Funcion�rio que herda de pessoa, mas os par�metros do Medico
	
	public Medico(String nome, String cpf, String fone,  String especialidade, String crm) {
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
	
	// Metodos
	@Override
	public void calcularParticipacaoLucros() {
		System.out.println("Participa��o Funcionario:" + (super.getSalario() * 0.5));
	}
	

}
