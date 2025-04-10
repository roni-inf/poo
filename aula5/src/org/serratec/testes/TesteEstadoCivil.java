package org.serratec.testes;

import org.serratec.exemplos.EstadoCivil;
import org.serratec.exemplos.Pessoa;

public class TesteEstadoCivil {

	public static void main(String[] args) {
		Pessoa pessoa =  new Pessoa("Marcos",100000.);
		pessoa.setEstadoCivil(EstadoCivil.DIVORCIADO);
		
		System.out.println(pessoa.getEstadoCivil().getSigla());
		System.out.println(pessoa.getEstadoCivil().ordinal());
		
		for (EstadoCivil ec : EstadoCivil.values()) {
			System.out.println(ec);
		}
	}

}
