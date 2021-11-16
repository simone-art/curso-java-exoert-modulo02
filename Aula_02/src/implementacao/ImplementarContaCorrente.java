package implementacao;

import beans.ContaCorrente;

public class ImplementarContaCorrente {
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		
		ContaCorrente renato = new ContaCorrente();
		
		
		cc.setAgencia(2021);
		cc.setNumero(101521);
		
		cc.deposito(500);
		cc.extrato();

		cc.deposito(100);
		cc.extrato();
		
		cc.saque(1000);
		
		cc.extrato();
		
		System.out.println("-- cc: Renato");
		
		
		renato.setAgencia(2020);
		renato.setNumero(101010);
		renato.setSaldo(5000);
		renato.extrato();
		renato.saque(10000);
		
	}
}
