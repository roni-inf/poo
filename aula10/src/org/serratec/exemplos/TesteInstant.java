package org.serratec.exemplos;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class TesteInstant {

	public static void main(String[] args) {
		Instant dataHoje = Instant.now();
		System.out.println(dataHoje);
		//Variável Global
		Instant dataNova = Instant.parse("2025-04-17T01:00:00Z");
				
		//Variável Local
		LocalDateTime data2 = LocalDateTime.ofInstant(dataNova, ZoneId.systemDefault());
		
		
		System.out.println(data2);
	}

}
