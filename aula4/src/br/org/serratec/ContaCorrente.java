package br.org.serratec;

public class ContaCorrente implements Conta {
	private String titular;
	private Double saldo;

	public ContaCorrente(String titular, Double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "titular:" + titular + ", saldo=" + saldo + "]";
	}

	public String getTitular() {
		return titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	@Override
	public Boolean saque(Double valor) {

		if (saldo >= valor) {
			saldo -= valor;
			return true;
		}
		return false;
	}

	@Override
	public void deposito(Double valor) {

		if (valor > 0) {
			saldo += valor;
			System.out.println("saldo atual:" + saldo);
		} else {
			System.out.println("Valor inválido!");
		}

	}

}
