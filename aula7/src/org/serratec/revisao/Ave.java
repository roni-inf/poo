package org.serratec.revisao;

import java.time.LocalDate;

public abstract class Ave extends Animal {
	protected String cor;

	public Ave(String nome, LocalDate dataVacinacao, String cor) {
		super(nome, dataVacinacao);
		this.cor = cor;
	}

	@Override
	public String toString() {
		return super.toString() + "cor:" + cor;
	}

	public abstract String voar();
}
