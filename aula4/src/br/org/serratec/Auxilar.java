package br.org.serratec;

public abstract class Auxilar extends Funcionario {
	protected String categoria;

	public Auxilar(String cpf, String nome, Double salario, String categoria) {
		super(cpf, nome, salario);
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Auxilar [categoria=" + categoria + ", cpf=" + cpf + ", nome=" + nome + ", salario=" + salario + "]";
	}

	public String getCategoria() {
		return categoria;
	}

}
