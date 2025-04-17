package org.serratec.exemplos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LeituraData {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Formatadores
		DateTimeFormatter entradaFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter saidaFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");

		System.out.print("Digite a data (dd/MM/yyyy): ");
		String dataDigitada = scanner.nextLine();

		try {
			LocalDate data = LocalDate.parse(dataDigitada, entradaFormatter);
			String dataFormatada = data.format(saidaFormatter);
			System.out.println("Data formatada: " + dataFormatada);
		} catch (Exception e) {
			System.out.println("Data inválida. Certifique-se de usar o formato dd/MM/yyyy.");
		}

		scanner.close();
	}
}
