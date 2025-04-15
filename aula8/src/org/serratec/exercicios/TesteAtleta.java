package org.serratec.exercicios;

import java.util.Arrays;

public class TesteAtleta {

	public static void main(String[] args) {
		Time time = new Time("Flamengo");
		
		Atleta a1  = new Atleta("Rossi", 1.89);
		Atleta a2  = new Atleta("Bruno Henrique", 1.79);
		Atleta a3  = new Atleta("Pedro", 1.80);
		
		time.adicionarAtleta(a1);
		time.adicionarAtleta(a2);
		time.adicionarAtleta(a3);
		
		System.out.println(time.getAtletas());
		
	}

}
