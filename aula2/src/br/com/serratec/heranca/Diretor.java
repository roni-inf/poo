package br.com.serratec.heranca;

public class Diretor extends Empregado {
	private String area;

	public Diretor(String nome, String email, String telefone, Double salario, String area) {
		super(nome, email, telefone, salario);
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	@Override
	public String toString() {
		return super.toString() + " area:" + area;
	}
	
	

	
}
