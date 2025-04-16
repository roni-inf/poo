package org.serratec.exemplos;

import java.util.HashMap;
import java.util.Map;

public class TesteMapEstado {

	public static void main(String[] args) {
		Map<String, String> estados = new HashMap<>();
		estados.put("AC", "ACRE");
		estados.put("RJ", "Rio de Janeiro");
		estados.put("AL", "Alagoas");

		for (String sigla : estados.keySet()) {
			System.out.println(sigla);
		}

		for (String nome : estados.values()) {
			System.out.println(nome);
		}

		for (Map.Entry<String, String> dados : estados.entrySet()) {
			System.out.println(dados);
		}

	}

}
