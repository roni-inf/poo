package org.serratec.revisao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteException {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer num = 0;
		// String a = null;
		try {
			FileReader fr = new FileReader("\\temp\\teste2.bat");
			System.out.println("Digite um número");
			num = sc.nextInt();
//			System.out.println();
			
		}catch (FileNotFoundException e) {
			throw new RuntimeException(e.getMessage());
		} catch (InputMismatchException e) {
			//System.out.println("Numero invalido");
			throw new InputMismatchException("parou de funcionar");
		}
		finally {
			System.out.println("Sempre executa");
		}
		System.out.println("continua funcionando....");

	}

}
