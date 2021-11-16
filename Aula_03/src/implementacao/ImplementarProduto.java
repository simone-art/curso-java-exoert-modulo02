package implementacao;

import beans.Produto;

public class ImplementarProduto {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto();

		p1.setNome("Notebook 15");
		p1.setMarca("Dell");
		p1.setValor(1500);
		
		System.out.println(p1.detalhes());
		
		Produto p2 = new Produto("Notebook 14", "HP",2000);
		System.out.println(p2.detalhes());
		
		Produto p3 = new Produto("Impressora DJ","HP",500,true);
		System.out.println(p3.detalhes() + " Promoção:" + p3.isPromocao());
		
		
	}

}
