package org.serratec.exemplos;

public enum EstadoCivil {
	VIUVO('V'), SOLTEIRO('S'), CASADO('C'), DIVORCIADO('D');

	private char sigla;

	private EstadoCivil(char sigla) {
		this.sigla = sigla;
	}

	public char getSigla() {
		return sigla;
	}

}
