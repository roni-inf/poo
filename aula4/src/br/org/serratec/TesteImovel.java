package br.org.serratec;

public class TesteImovel {

	public static void main(String[] args) {
		Proprietario p1 = new Proprietario("Ana");
		Casa casa = new Casa("Centro", 200000., p1, true);
		
		//Imovel imovel = new Imovel("Bingen", 10000., p1);
		
		System.out.println("Valor do Itbi:"+ casa.calcularITBI());
		System.out.println(casa);
	}

}
