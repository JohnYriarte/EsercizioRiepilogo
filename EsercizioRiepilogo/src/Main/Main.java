package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	// Metodo per stampare il Menu
	public static void stampaMenu() {
		System.out.println("1) Aggiungere Citta");
		System.out.println("2) Visualizzare Citta");
		System.out.println("3) Rimuovere Citta");
		System.out.println("4) Uscire");
	}
	
	// Metodo aggiungere citta alla lista
	public static void addCitta(ArrayList<String> lista, String nome) {
		for (String citta : lista) {
			if (citta.equals(nome)) {
				System.out.println("Citta' gia inserita");
				return;
			}
		}
		System.out.println("Citta' inserita");
		lista.add(nome);
	}
	
	// Metodo togliere citta dalla lista
	public static void removeCitta(ArrayList<String> lista, String nome) {
		for (int i = 0; i<lista.size(); i++) {
			if (lista.get(i).equals(nome)) {
				lista.remove(i);
				System.out.println("Citta' rimossa");
				return;
			}
		}
		System.out.println("Citta' non trovata");
	}
	
	// Metodo stampare citta delle lista
	public static void stampaCitta(ArrayList<String> lista) {
		if (lista.size() == 0) {
			System.out.println("Non ci sono citta");
			return;
		}
		System.out.println("Le citta' sono: ");
		for (String citta: lista) {
			System.out.println(citta);
		}
	}
	
	public static void main(String[] args) {

		/*
		 * 1) Creazione e gestione di un ArrayList
		 * 
		 * Crea un programma che:
		 * 
		 * Crei un ArrayList di stringhe. Aggiunga i nomi di 5 città. Stampi tutte le
		 * città contenute nella lista. Rimuova la seconda città. Stampi nuovamente le
		 * città aggiornate.
		 * 
		 * Obiettivo: Comprendere le operazioni di base sugli ArrayList: aggiunta,
		 * rimozione e iterazione.
		 */
		
		ArrayList<String> lista = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int scelta = -1;
		
		while (true) {
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
			switch(scelta) {
			case 1:
				try {
					System.out.println("Quanti citta' vuoi aggiungere? ");
					int temp = scanner.nextInt();
					scanner.nextLine();
					for (int i = 0; i < temp; i++) {
						System.out.println("Quale citta vuoi aggiungere? ");
						addCitta(lista, scanner.nextLine().toUpperCase());
					}
				} catch (Exception e) {
					scanner.nextLine();
					System.out.println("Inserire la quantita giusta");
				}
				break;
			case 2:
				stampaCitta(lista);
				break;
			case 3:
				System.out.println("Quale citta vuoi rimuovere? ");
				removeCitta(lista, scanner.nextLine().toUpperCase());
				break;
			}
		}
		
		scanner.close();
		
	}

}
