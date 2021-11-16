package br.com.Aula04.implementacao;

import br.com.Aula04.beans.Cliente;
import br.com.Aula04.beans.ContaCorrente;

public class ImplementarConta {

	public static void main(String[] args) {

		// 1o. Capturar o dados do Cliente

		Cliente cliente1 = new Cliente();
		cliente1.setNome("Caua Reimond");
		cliente1.setCpf("12345678");
		cliente1.setFone("98989898");

		// Gerar segundo cliente usando o constructor
		Cliente cli2 = new Cliente("Ana Maria Braga", "9999999", "123459800");

		// 2o. Gerar a Conta Corrente
		ContaCorrente cc = new ContaCorrente();
		cc.setAgencia(1010);
		cc.setConta(150025);
		cc.setSaldo(100);
		cc.setCliente(cliente1);

		System.out.println("ag:" + cc.getAgencia() + " cc:" + cc.getConta() + " saldo:" + cc.getSaldo() + " Cliente:"
				+ cc.getCliente().getNome() + " fone:" + cc.getCliente().getFone());

		cliente1.setFone("xxxxxxxx");

		System.out.println("Cliente:" + cliente1.getNome() + " Fone:" + cliente1.getFone());

		System.out.println("ag:" + cc.getAgencia() + " cc:" + cc.getConta() + " saldo:" + cc.getSaldo() + " Cliente:"
				+ cc.getCliente().getNome() + " fone:" + cc.getCliente().getFone());

		ContaCorrente cc2 = new ContaCorrente(1010, 150015, 50, cli2);

		System.out.println("ag:" + cc2.getAgencia() + " cc:" + cc2.getConta() + " saldo:" + cc2.getSaldo() + " Cliente:"
				+ cc2.getCliente().getNome() + " fone:" + cc2.getCliente().getFone());

	}

}
