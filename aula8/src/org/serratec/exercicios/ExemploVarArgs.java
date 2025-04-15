package org.serratec.exercicios;

public class ExemploVarArgs {

	public static void main(String[] args) {
		//int[] totalGeral = {2,4};
		int total = somar(10, 24, 45, 32, 1000, 234, 909);
		System.out.println("Total:" + total);
		
		int total2 = somar2(10,20,30,40,60);
		System.out.println("Total2:" + total2);
	}
	
	//VarArgs
	public static int somar(int... numeros) {
		int soma = 0;

		for (int i : numeros) {
			soma += i;
		}
		return soma;
	}
	
	public static int somar2(int numero, int... numeros) {
		int soma = 0;

		for (int i : numeros) {
			soma += i;
		}
		return soma * numero;
	}
	
	
	

}
