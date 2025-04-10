package org.serratec.testes;

import org.serratec.exemplos.PeriodoCurso;
import org.serratec.exemplos.Turma;

public class TesteTurma {

	public static void main(String[] args) {
		Turma turma = new Turma("Programador Full Stack",PeriodoCurso.TARDE );
		
		System.out.println("Curso:"+ turma.getCurso());
		System.out.println("Dias:"+ turma.getPeriodoCurso().getDias());
		System.out.println("Valor:"+ turma.getPeriodoCurso().getValor());
	}

}
