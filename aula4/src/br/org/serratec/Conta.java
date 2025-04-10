package br.org.serratec;

public interface Conta {
	public static final Double TAXAS = 10.;
	
	public Boolean saque(Double valor);
	public void deposito(Double valor);
			
}
