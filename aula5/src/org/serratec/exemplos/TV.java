package org.serratec.exemplos;

public class TV {
	private String modelo;
	private Marca marca;

	public TV(String modelo, Marca marca) {
		this.modelo = modelo;
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public Marca getMarca() {
		return marca;
	}

}
