package tools;

import beans.Produto;

public class ImplementarProdutoTool {
	
	public static void main(String[] args) {

		Produto p1 = new Produto(Input.texto("Descriçao"), 
								 Input.texto("Marca"), 
								 Input.decimal("Valor:"), 
								 Input.logico("Promoção?"));

		System.out.println(p1.detalhes() + p1.isPromocao());
	}

}
