package org.lessons.java.shop2;

public class Televisori extends Prodotto {

	int pollici;
	boolean smart;
	
	
	public Televisori(String nome, double prezzo, int pollici, boolean smart) {
		super(nome, prezzo);
		this.pollici = pollici;
		this.smart = smart;
	}
	
	
	
}
