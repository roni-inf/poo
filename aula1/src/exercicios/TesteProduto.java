package exercicios;

import java.util.Scanner;

public class TesteProduto {

	public static void main(String[] args) {
		Produto p1 = new Produto();
		Scanner sc = new Scanner(System.in);
		//Construtor Default - implícito
		Produto p2 = new Produto(2,"Celular",1000);

		System.out.println("Descrição:");
		String descricao = sc.next();
		System.out.println("Valor");
		Double valor = sc.nextDouble();

		p1.setDescricao(descricao);
		p1.setValor(valor);

		System.out.println(p1.getDescricao() + "-" + p1.getValor());
	}

}
