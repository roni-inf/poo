package org.serratec.exemplos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeituraArquivo {

	public static void main(String[] args) {
		File arquivo = new File("/curso/aula.txt");

		try {
			Scanner sc = new Scanner(arquivo);
			System.out.println("Arquivo encontrado");
			
			while (sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.err.println("Arquivo não encontrado");
			e.printStackTrace();
		}
	}

}
