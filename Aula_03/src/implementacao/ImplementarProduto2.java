package implementacao;

import javax.swing.JOptionPane;

import beans.Produto;

public class ImplementarProduto2 {

	public static void main(String[] args) {

		Produto impressora = new Produto();

		impressora.setMarca("HP");
		String texto = JOptionPane.showInputDialog("Marca");
		System.out.println("Valor TEXTO:" + texto);

		impressora.setMarca(JOptionPane.showInputDialog("Marca"));
		impressora.setNome(JOptionPane.showInputDialog("Descriçao"));
		impressora.setValor(Float.parseFloat(JOptionPane.showInputDialog("Valor:")));

		int resp = JOptionPane.showConfirmDialog(null, "Promoção ?", "Informe", JOptionPane.YES_NO_OPTION);

		if (resp == 0) {
			impressora.setPromocao(true);
		} else {
			impressora.setPromocao(false);
		}

		System.out.println(impressora.detalhes() + " Promoção: " + impressora.isPromocao());

		// Usando direto no Construtor

		Produto p2 = new Produto(JOptionPane.showInputDialog("Descriçao"), JOptionPane.showInputDialog("Marca"),
				Float.parseFloat(JOptionPane.showInputDialog("Valor:")));
		System.out.println(p2.detalhes());

		Produto p3 = new Produto(JOptionPane.showInputDialog("Descriçao"), JOptionPane.showInputDialog("Marca"),
				Float.parseFloat(JOptionPane.showInputDialog("Valor:")),
				Boolean.parseBoolean(JOptionPane.showInputDialog("Promoção?")));
		System.out.println(p3.detalhes() + p3.isPromocao());

	}

}
