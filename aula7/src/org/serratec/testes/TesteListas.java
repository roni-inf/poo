package org.serratec.testes;

import java.util.Arrays;
import java.util.List;

public class TesteListas {

	public static void main(String[] args) {
		String[] carros = {"Sandero","HB20","Versa","KA","Corsa"};
		List<String> listaCarros = List.of(carros);
		
		//listaCarros.set(0, "Fusca");
		carros[1] = "Fox";
		
		for (String carro : listaCarros) {
			System.out.println(carro);
		}
	}

}
