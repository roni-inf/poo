package org.serratec.exemplos;

//final na classe não pode ter filhos
public class Policial {
	protected String nome;
	// protected final String LOTACAO = "Brasília";
	protected final String LOTACAO;

	public Policial(String nome, String lOTACAO) {
		this.nome = nome;
		LOTACAO = lOTACAO;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLOTACAO() {
		return LOTACAO;
	}

	// Não pode ser sobrescrito
	public final void imprimir() {
		System.out.println("Dados do Policial!");
	}
}
