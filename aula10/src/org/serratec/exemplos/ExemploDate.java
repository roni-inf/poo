package org.serratec.exemplos;

import java.util.Calendar;
import java.util.Date;

public class ExemploDate {

	public static void main(String[] args) {
		Date data = new Date();
		System.out.println("Data de hoje:" + data);
		System.out.println(data.getHours());
		
		Calendar dataHoje = Calendar.getInstance();
		System.out.println(dataHoje);
		System.out.println(dataHoje.get(Calendar.MONTH));
		
	}

}
