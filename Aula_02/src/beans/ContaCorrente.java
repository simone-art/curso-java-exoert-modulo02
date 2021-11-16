package beans;

public class ContaCorrente {
	private int agencia;
	private int numero;
	private double saldo;

	// Getters Setters
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// Operações (metodos)

	public void extrato() {
		System.out.println("Ag:" + this.agencia + " c/c:" + this.numero + " saldo:" + this.saldo);
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
