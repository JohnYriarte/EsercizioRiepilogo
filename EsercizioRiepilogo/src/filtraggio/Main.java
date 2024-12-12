package filtraggio;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	// Metodo per stampare il Menu
	public static void stampaMenu() {
		System.out.println("1) Aggiungere Prodotto");
		System.out.println("2) Visualizzare Prodotti");
		System.out.println("3) Filtraggio Prodotto");
		System.out.println("4) Uscire");
	}

	// Metodo per aggiungere prodotto
	public static void addProdotto(ArrayList<Prodotto> prodotti, Scanner scanner) {
		System.out.println("Inserire nome prodotto");
		String nome = scanner.nextLine();
		System.out.println("Inserire categoria prodotto");
		String categoria = scanner.nextLine().toUpperCase();
		prodotti.add(new Prodotto(nome, categoria));

	}

	// Metodo per Visualizzare prodotti
	public static void stampaProdotto(ArrayList<Prodotto> prodotti) {
		if (prodotti.size() == 0) {
			System.out.println("Non ci sono prodotti");
			return;
		}
		System.out.println("I prodotti sono: ");
		for (Prodotto prodotto : prodotti) {
			System.out.println(prodotto.getNome());
		}
	}

	// Overloading per Visualizzare prodotti per categoria
	public static void stampaProdotto(ArrayList<Prodotto> prodotti, String categoria) {
		if (prodotti.size() == 0) {
			System.out.println("Non ci sono prodotti");
			return;
		}

		System.out.println(String.format("I prodotti della categoria %s sono: ", categoria));
		for (Prodotto prodotto : prodotti) {
			if (prodotto.getCategoria().equals(categoria)) {
				System.out.println(prodotto.getNome());
			}
		}
	}

	public static void main(String[] args) {
		/*
		 * Crea una classe Prodotto con attributi nome, categoria e prezzo. Crea un
		 * ArrayList di prodotti con almeno 5 elementi. Implementa un metodo che filtra
		 * e restituisce solo i prodotti appartenenti a una determinata categoria (ad
		 * esempio, "Elettronica"). Stampa i prodotti filtrati. Obiettivo: Applicare i
		 * metodi sugli ArrayList per filtrare i dati in base a criteri specifici.
		 */

		// Variabili
		ArrayList<Prodotto> prodotti = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		int scelta = -1;
		
		// LOOP MENU
		while (true) {
			// EXIT MENU
			if (scelta == 4) {
				break;
			}

			stampaMenu();
			
			try {
				scelta = scanner.nextInt();
			} catch (Exception e) { // Gestisce InputMismatchException
				System.out.println("Per favore inserire un numero! ");
				scelta = -1;
			}

			scanner.nextLine();
			switch (scelta) {
			case 1:
				addProdotto(prodotti, scanner);
				break;
			case 2:
				stampaProdotto(prodotti);
				break;
			case 3:
				System.out.println("Quale categoria vuoi vedere?");
				stampaProdotto(prodotti, scanner.nextLine().toUpperCase());
				break;
			}
		}

		scanner.close();
	}

}
