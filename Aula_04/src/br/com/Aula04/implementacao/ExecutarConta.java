package br.com.Aula04.implementacao;

import javax.swing.JOptionPane;

import br.com.Aula04.beans.Banco;
import br.com.Aula04.beans.Cliente;
import br.com.Aula04.beans.ContaCorrente;
import br.com.Aula04.tools.Input;

public class ExecutarConta {
	
	public static void main(String[] args) {

		// 1o. Criar dados do Banco
		Banco bb = new Banco(Input.texto("Digite a Razao Social:"),Input.inteiro("Digite o Id Bancario:"));
		System.out.println(bb.getRazao());
		
		// 2o. Capturar dados do Cliente		
		Cliente cli = new Cliente(JOptionPane.showInputDialog("Digite o Nome:"), Input.texto("Digite CPF:"), Input.texto("Digite Fone:"));
		System.out.println(cli.getNome());

		// 3o. Abrir a ContaCorrente  ( Banco + Cliente + CC)
		
		ContaCorrente cc = new ContaCorrente(Input.inteiro("Digite Agencia:"), 
											 Input.inteiro("Digite CC:"), 
											 Input.decimal("Digite o Saldo:"), 
											 cli, 
											 bb);
		
		System.out.println("ag:" + cc.getAgencia() + " cc:" + cc.getConta() 
			+ " Cliente:" + cc.getCliente().getNome() 
			+ " Banco:" + cc.getBanco().getRazao());
		
	}

}
