package org.serratec.revisao;

import java.time.LocalDate;

public abstract class Animal {
	protected String nome;
	protected LocalDate dataVacinacao;

	public Animal(String nome, LocalDate dataVacinacao) {
		this.nome = nome;
		this.dataVacinacao = dataVacinacao;
	}

	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", dataVacinacao=" + dataVacinacao + "]";
	}

	public abstract String emitirSom();

}
