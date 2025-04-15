package org.serratec.exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Time {
	private String nome;
	private List<Atleta> atletas;

	public Time(String nome) {
		this.nome = nome;
		atletas = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "Time [nome=" + nome + "]";
	}

	public String getNome() {
		return nome;
	}

	public List<Atleta> getAtletas() {
		return atletas;
	}

	public void adicionarAtleta(Atleta... atletas) {
		// atletas.add(atleta);
		this.atletas.addAll(Arrays.asList(atletas));
	}

}
