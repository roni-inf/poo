package org.serratec.exercicios;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TesteSet {

	public static void main(String[] args) {
		// Não permite elemento iguais
			//Não mantém a ordem
		//Set<String> times = new HashSet<>();
		//Mantém a ordem de inserção
		//Set<String> times = new LinkedHashSet<>();
		//Ordena os elementos
		Set<String> times = new TreeSet<>();
		
		times.add("Flamengo");
		times.add("Vasco");
		times.add("Vasco");
		times.add("Bangu");
		times.add("Botafogo");
		times.add("Flamengo");

		for (String time : times) {
			System.out.println(time);
		}
		
		Set<Integer> numeros = new HashSet<>();
		numeros.add(20);
		numeros.add(20);
		numeros.add(30);
		numeros.add(40);
		System.out.println(numeros);

	}

}
