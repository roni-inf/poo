package exercicios;

public class Funcionario {

	private String nome;
	private double salario;
	//Pertence a classe (Visibilidade da classe)
	private static int contador = 0;

	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
		contador++;
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}

	public static int getContador() {
		return contador;
	}
}
