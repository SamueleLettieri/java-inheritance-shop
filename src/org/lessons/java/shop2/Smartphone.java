package org.lessons.java.shop2;

import java.util.Random;

public class Smartphone extends Prodotto {

	int codiceIMEI;
	int memoria;
	
	public Smartphone(String nome, double prezzo, int codiceIMEI, int memoria) {
		super(nome, prezzo);
		this.codiceIMEI = codiceIMEI;
		this.memoria = memoria;
	}
	
	
	public int getFormaCodice() {
		int max = 999999999;
		
		Random r = new Random();
		
		return codiceIMEI = r.nextInt(max);
	}
	
}
