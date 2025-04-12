package org.serratec.revisao;

import java.time.LocalDate;

public class Cachorro extends Mamifero implements AnimalDomestico {
	private Boolean castrado;

	public Cachorro(String nome, LocalDate dataVacinacao, String raca, Boolean castrado) {
		super(nome, dataVacinacao, raca);
		this.castrado = castrado;
	}

	@Override
	public String toString() {
		return super.toString() + "castrado:" + castrado;
	}

	@Override
	public Boolean levarVeterianario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean alimentar() {
		// TODO Auto-generated method stub
		return null;
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
