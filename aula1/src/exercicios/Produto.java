package exercicios;

public class Produto {
	private int codigo;
	private String descricao;
	private double valor;

	//OVERLOAD - SOBRECARGA
	
	// Construtor Default - Padrão
	public Produto() {
		System.out.println("Construtor inicializado!");
	}

	//Construtor cheio - atributos 
	public Produto(int codigo, String descricao, double valor) {
	
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
