package org.serratec.exercicios;

import java.util.Set;
import java.util.TreeSet;

public class TesteAluno {

	public static void main(String[] args) {
		//Set<Aluno> alunos = new HashSet<>();
		Set<Aluno> alunos = new TreeSet<>();
		alunos.add(new Aluno("Antônio", "a@gmail.com", 45));
		alunos.add(new Aluno("Bruno", "b@gmail.com", 67));
		alunos.add(new Aluno("Carlos", "c@gmail.com", 25));
		alunos.add(new Aluno("Débora", "d@gmail.com", 12));
		alunos.add(new Aluno("Débora", "d@gmail.com", 12));
		
		for (Aluno a : alunos) {
			System.out.println(a);
		}
	}

}
