package org.serratec.exemplos;

public class Turma {
	private String curso;
	private PeriodoCurso periodoCurso;

	public Turma(String curso, PeriodoCurso periodoCurso) {
		super();
		this.curso = curso;
		this.periodoCurso = periodoCurso;
	}

	public String getCurso() {
		return curso;
	}

	public PeriodoCurso getPeriodoCurso() {
		return periodoCurso;
	}

}
