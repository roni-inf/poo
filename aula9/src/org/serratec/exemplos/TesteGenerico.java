package org.serratec.exemplos;

public class TesteGenerico {

	public static void main(String[] args) {
		Generico<Integer> numero = new Generico(400);
		Generico<String> texto =  new Generico("Aula");
		
		System.out.println(numero.getValor());
		System.out.println(texto.getValor());

	}

}
