package br.com.aula07.beans;

public class Funcionario extends Pessoa{
	
	private String dtAdmissao;
	private String dtDemissao;
	private double salario;
	private String departamento;
	
	// Construtor
	public Funcionario(String nome, String cpf, String fone, String dtAdmissao, String dtDemissao, double salario,
			String departamento) {
		super(nome, cpf, fone);
		this.dtAdmissao = dtAdmissao;
		this.dtDemissao = dtDemissao;
		this.salario = salario;
		this.departamento = departamento;
	}
	
	//Precisa deste constructor com 3 par�metros na hora de executar agendamentoMedico
	public Funcionario(String nome, String cpf, String fone) {
		super(nome, cpf, fone);
		
	}
   
	
	//Getter + Setters
		
	public String getDtAdmissao() {
		return dtAdmissao;
	}
	public void setDtAdmissao(String dtAdmissao) {
		this.dtAdmissao = dtAdmissao;
	}
	public String getDtDemissao() {
		return dtDemissao;
	}
	public void setDtDemissao(String dtDemissao) {
		this.dtDemissao = dtDemissao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public void pesquisar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void salvar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir() {
		// TODO Auto-generated method stub
		
	}
	
	
	// Opera��es Metodos
	
	public void calcularParticipacaoLucros() {
		System.out.println("Participa��o Funcionario:" + (salario * 0.1));
	}
	
	public void calcularParticipacaoLucros(double percentual ) {
		System.out.println("Participa��o Funcionario:" + (salario * percentual));
	}
	

}
