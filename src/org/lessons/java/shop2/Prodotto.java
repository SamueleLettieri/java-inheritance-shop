package org.lessons.java.shop2;

import java.util.Random;

public class Prodotto {

	private int codice;
	private String nome;
	private String marca;
	private double prezzo;
	private int iva;
	
	

	
	public Prodotto(String nome, double prezzo) {
		super();
		this.nome = nome;
		this.prezzo = prezzo;
	}

	
	public int getFormaCodice() {
		int max = 99999999;
		
		Random r = new Random();
		
		return codice = r.nextInt(max);
	}

	
	public void setCalcolaPrezzoIva(double prezzo) {
	this.prezzo = (prezzo + prezzo * 22 / 100);
		
	}
	
	
	public double getCalcolaPrezzoIva() {
		return this.prezzo;
	}
	
}
