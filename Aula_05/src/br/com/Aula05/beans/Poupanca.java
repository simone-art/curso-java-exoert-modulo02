package br.com.Aula05.beans;

public class Poupanca extends Conta{
	
	private int rendimento;

	
	// Construtor
	public Poupanca() {}

	public Poupanca(int agencia, int conta, double saldo, Cliente cliente, int rendimento) {
		super(agencia, conta, saldo, cliente);
		this.rendimento = rendimento;
	}

	
	//Getter Setter

	public int getRendimento() {
		return rendimento;
	}

	public void setRendimento(int rendimento) {
		this.rendimento = rendimento;
	}
	
	// Metodo (operações)
	public void creditarRendimento() {
		super.setSaldo(this.rendimento + super.getSaldo());
	}

}
