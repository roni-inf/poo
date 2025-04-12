package org.serratec.revisao;

import java.time.LocalDate;

public class Cavalo extends Mamifero implements AnimalCompeticao {
	private String marcaFerradura;

	public Cavalo(String nome, LocalDate dataVacinacao, String raca, String marcaFerradura) {
		super(nome, dataVacinacao, raca);
		this.marcaFerradura = marcaFerradura;
	}

	@Override
	public void trocarFerradura() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viajar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void amamentar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return null;
	}

}
