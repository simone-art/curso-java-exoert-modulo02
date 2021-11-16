package implementacao;

import beans.Pessoa;

public class ImplementarPessoa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa();

		p1.nome = "Fausto";
		p1.setIdade(50);

		p1.comer("almoço");

		System.out.println("Pessoa: " + p1.nome + " / Idade:" + p1.getIdade() + "/ sentimento:" + p1.getSentimento());

		p1.domir(5);

		// p1.setSentimento("repouso");
		System.out.println("Pessoa: " + p1.nome + " / Idade:" + p1.getIdade() + "/ sentimento:" + p1.getSentimento());

	}

}
