package br.com.Aula04.beans;

public class ContaCorrente {

	private int agencia;
	private int conta;
	private double saldo;
	private Cliente cliente;
	private Banco banco;

	// construtor
	public ContaCorrente() {
	}

	// Construtor com 3 parâmetros mais atributos de referência

	public ContaCorrente(int agencia, int conta, double saldo, Cliente cliente) {
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	// Construtor com 3 parâmetros mais atributos de referência
	public ContaCorrente(int agencia, int conta, double saldo, Cliente cliente, Banco banco) {
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
		this.cliente = cliente;
		this.banco = banco;
	}

	// Getters + Setters

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	// Metodos (operações)
	public void extrato() {
		System.out.println("Ag:" + this.agencia + " c/c:" + this.conta + " saldo:" + this.saldo);
	}

	public void deposito(double valor) {
		this.saldo = this.saldo + valor;
	}

	public void saque(double valor) {
		if (valor > this.saldo) {
			System.out.println("Saldo insuficiente para saque");
		} else {
			this.saldo = this.saldo - valor;
		}
	}

}
