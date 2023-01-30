package org.lessons.java.shop2;

public class Cuffie extends Prodotto {

	String colore;
	boolean wireless;
	
	public Cuffie(String nome, double prezzo, String colore, boolean wireless) {
		super(nome, prezzo);
		this.colore = colore;
		this.wireless = wireless;
	}
	
	public void setCuffie(String wireless) {
	 
		if (wireless.equals("wireless")) {
			this.wireless = true;
			
		} else if (wireless.equals("cablate")) {
			this.wireless = false;
		}
		
	}
	
	
	public boolean getCuffie() {
		return this.wireless;
	}
	 
	
}
