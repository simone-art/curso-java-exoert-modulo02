package br.com.Aula05.implementacao;

import br.com.Aula05.beans.Cliente;
import br.com.Aula05.beans.Conta;
import br.com.Aula05.beans.ContaCorrente;
import br.com.Aula05.beans.Poupanca;

public class ExecutarContas {
	
public static void main(String[] args) {
		
		//1o. Definir os clientes
		Cliente cliente1 = new Cliente("Ana Maria Brada","1234536798","55119989898");
		
		Cliente cliente2 = new Cliente("Fausto Silva","98989898","123456");
		
		// 2o. Abra a conta
		
		Conta cc1 = new Conta(1010, 5001, 100, cliente1);
		Conta cc2 = new Conta(1010, 5002, 200, cliente2);
		
		cc1.extrato();
		cc2.extrato();
		
		
		Poupanca pp = new Poupanca(1010, 5003, 300, cliente1, 10);
		
		pp.creditarRendimento();
		pp.extrato();
		
		ContaCorrente ccr = new ContaCorrente(1010, 5004, 400, cliente2, 200, 5);
		
		ccr.extrato();
		

	}

}
