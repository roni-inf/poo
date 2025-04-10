package br.org.serratec;

public class Proprietario {
	private String nome;

	public Proprietario(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Proprietario [nome=" + nome + "]";
	}

	public String getNome() {
		return nome;
	}

}
