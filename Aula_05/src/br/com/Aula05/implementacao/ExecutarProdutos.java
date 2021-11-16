package br.com.Aula05.implementacao;

import br.com.Aula05.beans.Celular;
import br.com.Aula05.beans.Livro;

public class ExecutarProdutos {
	
	public static void main(String[] args) {
		
		Livro lv = new Livro(1, 100, "Java OO", "Alunos", "123436");
		Livro lv2 = new Livro(2, 100, "Java Web", "Alunos", "55555");
		
		System.out.println("Produto: " + lv.getDescricao() + " author:" + lv.getAutor() + " preço:" + lv.getPreco());
		lv2.calcImp();
		
		
		
		Celular cel = new Celular(3, 500, "IPhone X", 5, 68);
		System.out.println("Produto: " + cel.getDescricao() + " camera:" + cel.getCameraMega() + " preço: " + cel.getPreco());
		cel.calcImp();
		
		//Produto pp = new Produto(5,500,"Sabonete");
		
		//System.out.println(pp.getDescricao());
	}
	

}
