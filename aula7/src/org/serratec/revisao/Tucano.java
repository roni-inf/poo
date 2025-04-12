package org.serratec.revisao;

import java.time.LocalDate;

public class Tucano extends Ave {
	private Double peso;

	public Tucano(String nome, LocalDate dataVacinacao, String cor, Double peso) {
		super(nome, dataVacinacao, cor);
		this.peso = peso;
	}
 
	@Override
	public String voar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
