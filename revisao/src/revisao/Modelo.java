package revisao;

public class Modelo extends Veiculo {
	private String descricao;
	private Marca marca;

	public Modelo(String nome, Integer ano, String chassi, Double valor, String descricao, Marca marca) {
		super(nome, ano, chassi, valor);
		this.descricao = descricao;
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Modelo [descricao=" + descricao + ", marca=" + marca + "]";
	}

	public String getDescricao() {
		return descricao;
	}

	public Marca getMarca() {
		return marca;
	}

	@Override
	public void reajuste(Double valor) {
		this.valor = this.valor * valor;

	}

	@Override
	public void calcularSeguro() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Double pagarIPVA() {
		// TODO Auto-generated method stub
		return null;
	}

}
