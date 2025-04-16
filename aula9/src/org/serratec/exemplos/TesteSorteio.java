package org.serratec.exemplos;

public class TesteSorteio {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Ana", 23);
		Aluno aluno2 = new Aluno("Marcos", 56);
		Aluno aluno3 = new Aluno("Igor", 32);

		Sorteio<Aluno> sortear = new Sorteio<>();
		
		sortear.adicionar(aluno1);
		sortear.adicionar(aluno2);
		sortear.adicionar(aluno3);
		
		System.out.println("Aluno sorteado:" + sortear.sorteio());
		
		Sorteio<Integer> sortearNumeros = new Sorteio<>();
		
		sortearNumeros.adicionarVarios(10,3,5,7,89,1,11);
		System.out.println("Número sorteado:" + sortearNumeros.sorteio());
		
	}

}
