package org.serratec.testes;

public class TesteMaiusculoException {

	public static void main(String[] args) {

		String palavra = null;
		try {

			String caixaAlta = palavra.toUpperCase();
			System.out.println(caixaAlta);

		} catch (NullPointerException n) {
			System.out.println("Preencha uma palavra!");
		}
	}

}
