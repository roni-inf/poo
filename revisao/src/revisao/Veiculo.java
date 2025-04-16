package revisao;

public abstract class Veiculo implements Pagamentos{
	protected String nome;
	protected Integer ano;
	protected String chassi;
	protected Double valor;

	public Veiculo(String nome, Integer ano, String chassi, Double valor) {
		this.nome = nome;
		this.ano = ano;
		this.chassi = chassi;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Veiculo [nome=" + nome + ", ano=" + ano + ", chassi=" + chassi + ", valor=" + valor + "]";
	}

	public String getNome() {
		return nome;
	}

	public Integer getAno() {
		return ano;
	}

	public String getChassi() {
		return chassi;
	}

	public Double getValor() {
		return valor;
	}

	public abstract void reajuste(Double valor);
}
