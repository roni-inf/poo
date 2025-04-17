package org.serratec.exemplos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GravarArquivo {

	public static void main(String[] args) {
		BufferedWriter gravar = null;
		try {
			gravar = new BufferedWriter(new FileWriter("/curso/arquivo.txt"));
			gravar.append("oi\n");
			gravar.append("aula de java");
			gravar.close();
		} catch (IOException e) {
			System.out.println("Erro ao gravar arquivo!");
			e.printStackTrace();
		}
	}

}
