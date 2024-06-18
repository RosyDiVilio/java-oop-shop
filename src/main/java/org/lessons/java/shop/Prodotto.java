package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	
	private int codice;
	public String nome;
	public String descrizione;
	public float prezzo;
	public float iva;
	public String nomeEsteso;
	
	public String dettagliProdotto() {
		return "Codice: " + codice + ", " + "Nome: " + nome + ", " + "Descrizione: " + descrizione + ", " + "Prezzo: €" + prezzo + ", " + "Prezzo con Iva del 5% = €" + iva + ", "+ "Nome Completo: " + nomeEsteso;
		
		//this.codice = codice;
		//this.nome = nome;
		//this.descrizione = descrizione;
		//this.prezzo = prezzo;
		//this.iva = iva;
	
	}
	
	static Prodotto product = new Prodotto(); {
	
	//nome prodotto uno
	this.nome = "Tablet";
	this.descrizione = "Oggetto tecnologioco molto utile";
	
	//nome prodotto due
	//product.nome = "Smartphone";
	//product.descrizione = "Oggetto di ultima generaione";
	
	//creazione randomica del codice 
	Random random = new Random();
	int numeroCodice = random.nextInt(500); {
	this.codice = numeroCodice;
	}
	
	//creazione prezzo randomico
	Random randomDue = new Random();
	int numeroPrezzo = random.nextInt(1000); {
	this.prezzo = numeroPrezzo;
	}
	
	//calcolo dell'iva da applicare al prodotto
	float calcolaIva = (prezzo * 5) / 100; {
	this.iva = prezzo + calcolaIva;
	}
	
	//nome esteso
	String nomeEsteso = codice + "-" + nome; {
	this.nomeEsteso = nomeEsteso; 
	}
	}
	
	public static void main(String[] args) {
		
		System.out.println(product.dettagliProdotto());
	
	}

}
