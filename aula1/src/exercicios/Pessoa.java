package exercicios;

public class Pessoa {
	// modificador de acesso padrão
	private int id;
	private String nome;
	// tipo primitivo - armazenam valores
	private double peso, altura;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso >= 0) {
			this.peso = peso;
		} else {
			System.out.println("Você digitou um valor inválido!");
		}
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	private double calcularIMC() {
		return peso / (altura * altura);
	}

	public String resultado() {
		// Se o resultado for < 18.5 - Abaixo do peso
		// entre 18.5 e 24.9 - peso ideal
		// Acima do peso

		if (calcularIMC() < 18.5) {
			return "Abaixo do peso";
		} else if (calcularIMC() <= 24.9) {
			return "Peso ideal";
		} else {
			return "Acima do peso";
		}
	}

}
