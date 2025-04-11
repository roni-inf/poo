package org.serratec.testes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteExceptionExercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Digite uma palavra:");
			String entrada = sc.next();

			System.out.println("Digite sua idade:");
			int idade = sc.nextInt();

			// String maiuscula = entrada.toUpperCase();
			// System.out.println(maiuscula);
			String textoNulo = null;

			String resultado = textoNulo.toUpperCase();
			System.out.println(resultado);
		} catch (NullPointerException e) {
			System.out.println("Erro!");
		} catch (InputMismatchException e) {
			System.out.println("Caracter inválido!");
		}

		finally {
			sc.close();
		}

	}

}
