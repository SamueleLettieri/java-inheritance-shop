package org.lessons.java.shop2;

public class Televisore extends Prodotto {

	int pollici;
	boolean smart;
	
	
	public Televisore(String nome, double prezzo, int pollici, boolean smart) {
		super(nome, prezzo);
		this.pollici = pollici;
		this.smart = smart;
	}
	
	
}
