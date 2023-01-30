package org.lessons.java.shop2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Prodotto prodotti;
		
		String nome;
		double prezzo;
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Inserisci Il nome Del prodotto: ");
		nome = s.nextLine();
		
		System.out.print("Inserisci Il prezzo del prodotto: ");
		prezzo = s.nextDouble();
		
		prodotti = new Prodotto(nome, prezzo);
		
		prodotti.setCalcolaPrezzoIva(prezzo);
		
		System.out.println("Il nome del prodotto + codice è: " + nome + "-" + prodotti.getFormaCodice());
		System.out.println("Il prezzo del prodotto senza iva è: " + prezzo + " + iva è: " + prodotti.getCalcolaPrezzoIva() + "€");
		s.close();
	}
	
}
