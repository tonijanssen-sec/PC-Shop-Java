package OOPProjektPCShopToniJanssen;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Zeigt mir das Hauptmenü an und verarbeitet die Eingabe/Auswahl
 */

public class hauptMenue {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Produkt> produktListe = new ArrayList<>(); // einmal im hauptMenue damit für alle Methoden sichtbar
																// ist
/**
 * Zeigt das Hauptmenü an und verarbeitet die Eingabe des Nutzers
 */
	public void zeigHauptMenue() {
		while (true) {
			System.out.println("---------------------------------------------------");
			System.out.println("PC-SHOP          Hauptmenü          von:Toni Janßen");
			System.out.println("---------------------------------------------------");
			System.out.println("1) Produkt anlegen");
			System.out.println("2) Produkt bearbeiten");
			System.out.println("3) Produkt suchen");
			System.out.println("4) Produkt löschen");
			System.out.println("0) Shop beenden");
			System.out.println("---------------------------------------------------");
			System.out.println("Bitte wählen: ");
			String auswahl = sc.nextLine();

			if (auswahl.equals("1")) {
				produktAnlegen();

			} else if (auswahl.equals("2")) {
				produktBearbeiten();
			} else if (auswahl.equals("3")) {
				produktSuchen();
			} else if (auswahl.equals("4")) {
				produktLoeschen();
			} else if (auswahl.equals("0")) {
				shopBeenden();
			} else {
				System.out.println("Fehler bei der Eingabe.");
			}
		}
	}

	/**
	 * Zeigt mir das Menü für Produkte anlegen an und verarbeitet die
	 * Eingabe/Auswahl
	 */

	public void produktAnlegen() {
		String preisEingabe = "";
		System.out.print("Marke: ");
		String marke = sc.nextLine();

		System.out.print("Modell: ");
		String modell = sc.nextLine();

		while (true) {
			System.out.print("Preis: ");
			preisEingabe = sc.nextLine();
			try {
				double preis = Double.parseDouble(preisEingabe);
				preisEingabe = String.valueOf(preis);
				break;
			} catch (NumberFormatException e) {
				System.out.println("Formatfehler.");
			}
		}
		if (marke.isEmpty() || modell.isEmpty() || preisEingabe.isEmpty()) {
			System.out.println("Produkt konnte aufgrund leerer Eingabewerte nicht gespeichert werden");
			return;
		}

		preisEingabe = preisEingabe.replace(",", ".");
		double preis = Double.parseDouble(preisEingabe);

		System.out.println("Welche Kategorie möchten sie anlegen?");
		System.out.println("1) Monitor");
		System.out.println("2) Motherboard");
		System.out.println("3) Tastatur");
		System.out.println("4) Maus");

		String kategorie = sc.nextLine();

		if (kategorie.equals("1")) {
			System.out.println("Bildschirmauflösung (z.B. 1920.0): ");
			String aufloesung = sc.nextLine();

			Monitor m = new Monitor();
			m.setMarke(marke);
			m.setModell(modell);
			m.setPreis(preis);
			m.setBildschirmaufloesung(aufloesung);

			produktListe.add(m);
			System.out.println("Monitor wurde angelegt.");
			System.out.print("Noch ein Produkt anlegen? (ja/nein): ");
			String weiter = sc.nextLine();
			if (weiter.equalsIgnoreCase("ja") || weiter.equalsIgnoreCase("j")) {
				produktAnlegen();
			} else if (!weiter.equalsIgnoreCase("nein") && !weiter.equalsIgnoreCase("n")) {
				System.out.println("Fehlerhafte Eingabe.");
			}

		} else if (kategorie.equals("2")) {
			System.out.println("Motherboard Massenspeicher-Anschlüsse (z.B. 4): ");
			int anschluesse = Integer.parseInt(sc.nextLine());
			Motherboard mb = new Motherboard();
			mb.setMarke(marke);
			mb.setModell(modell);
			mb.setPreis(preis);
			mb.setMassenspeicherAnschluesse(anschluesse);

			produktListe.add(mb);
			System.out.println("Motherboard wurde angelegt.");
			System.out.print("Noch ein Produkt anlegen? (ja/nein): ");
			String weiter = sc.nextLine();
			if (weiter.equalsIgnoreCase("ja") || weiter.equalsIgnoreCase("j")) {
				produktAnlegen();
			} else if (!weiter.equalsIgnoreCase("nein") && !weiter.equalsIgnoreCase("n")) {
				System.out.println("Fehlerhafte Eingabe.");
			}

		} else if (kategorie.equals("3")) {
			System.out.println("Tastatur (mechanisch? true/false): ");
			boolean mechanisch = Boolean.parseBoolean(sc.nextLine());
			Tastatur t = new Tastatur();
			t.setMarke(marke);
			t.setModell(modell);
			t.setPreis(preis);
			t.setMechanisch(mechanisch);

			produktListe.add(t);
			System.out.println("Tastatur wurde angelegt.");
			System.out.print("Noch ein Produkt anlegen? (ja/nein): ");
			String weiter = sc.nextLine();
			if (weiter.equalsIgnoreCase("ja") || weiter.equalsIgnoreCase("j")) {
				produktAnlegen();
			} else if (!weiter.equalsIgnoreCase("nein") && !weiter.equalsIgnoreCase("n")) {
				System.out.println("Fehlerhafte Eingabe.");
			}

		} else if (kategorie.equals("4")) {
			System.out.println("Maus (ergonomisch? true/false): ");
			boolean ergonomisch = Boolean.parseBoolean(sc.nextLine());
			Maus m = new Maus();
			m.setMarke(marke);
			m.setModell(modell);
			m.setPreis(preis);
			m.setErgonimisch(ergonomisch);

			produktListe.add(m);
			System.out.println("Maus wurde angelegt.");
			System.out.print("Noch ein Produkt anlegen? (ja/nein): ");
			String weiter = sc.nextLine();
			if (weiter.equalsIgnoreCase("ja") || weiter.equalsIgnoreCase("j")) {
				produktAnlegen();
			} else if (!weiter.equalsIgnoreCase("nein") && !weiter.equalsIgnoreCase("n")) {
				System.out.println("Fehlerhafte Eingabe.");
			}

		} else {
			System.out.println("Fehler bei der Eingabe.");
		}
	}

	/**
	 * Zeigt alle Produkte an und man kann das Produkt bearbeiten
	 */

	public void produktBearbeiten() {
		if (produktListe.isEmpty()) {
			System.out.println("Keine Produkte vorhanden.");
			return;
		}

		for (int i = 0; i < produktListe.size(); i++) {
			Produkt p = produktListe.get(i);
			System.out.println("Produkt " + i + ": " + p.getMarke() + " " + p.getModell() + " - " + p.getPreis() + "€ ["
					+ p.getTyp() + "]");
		}

		System.out.print("Welches Produkt willst du bearbeiten? (Nummer eingeben): ");
		int auswahl;
		try {
			auswahl = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Fehlerhafte Eingabe.");
			return;
		}

		if (auswahl < 0 || auswahl >= produktListe.size()) {
			System.out.println("Ungültige Nummer. Bitte eine gültige Nummer 0-" + (produktListe.size()-1) + " eingeben");
			return;
		}

		Produkt p = produktListe.get(auswahl);

		System.out.print("Neue Marke (" + p.getMarke() + "): ");
		String neueMarke = sc.nextLine();

		System.out.print("Neues Modell (" + p.getModell() + "): ");
		String neuesModell = sc.nextLine();

		System.out.print("Neuer Preis (" + p.getPreis() + "): ");
		String neuerPreisEingabe = sc.nextLine();

		if (neueMarke.isEmpty() || neuesModell.isEmpty() || neuerPreisEingabe.isEmpty()) {
			System.out.println("Produkt konnte aufgrund leerer Eingabewerte nicht gespeichert werden");
			return;
		}

		p.setMarke(neueMarke);
		p.setModell(neuesModell);
		try {
		    p.setPreis(Double.parseDouble(neuerPreisEingabe));
		} catch(NumberFormatException e) {
		    System.out.println("Fehlerhafte Eingabe. Bitte eine gültige Zahl eingeben.");
		    return;
		}

		System.out.println("Produkt wurde aktualisiert.");

		System.out.print("Nochmal bearbeiten? (ja/nein): ");
		String weiter = sc.nextLine();
		if (weiter.equalsIgnoreCase("ja") || weiter.equalsIgnoreCase("j")) {
			produktBearbeiten();
		} else if (!weiter.equalsIgnoreCase("nein") && !weiter.equalsIgnoreCase("n")) {
			System.out.println("Fehlerhafte Eingabe.");
		}
	}

	/**
	 * Sucht nach einen angelegten Produkt durch Suchgbegriff
	 */

	public void produktSuchen() {
		System.out.println("Suchbegriff eingeben: ");

		String suchbegriff = sc.nextLine();
		boolean gefunden = false;

		for (int i = 0; i < produktListe.size(); i++) {
			Produkt p = produktListe.get(i);
			if (p.getMarke().contains(suchbegriff) || p.getModell().contains(suchbegriff)
					|| p.getTyp().contains(suchbegriff)) {
				System.out.println("Produkt " + i + ": " + p.getMarke() + " " + p.getModell() + " - " + p.getPreis()
						+ "€ [" + p.getTyp() + "]");
				gefunden = true;
			}
		}

		if (!gefunden) {
			System.out.println("Suche hat nichts gefunden.");
		}
		System.out.println("Nochmal suchen? (ja/nein)");
		String weiter = sc.nextLine();
		if (weiter.equalsIgnoreCase("ja") || weiter.equalsIgnoreCase("j")) {
			produktSuchen();
		} else if (!weiter.equalsIgnoreCase("nein") && !weiter.equalsIgnoreCase("n")) {
			System.out.println("Fehlerhafte Eingabe.");
		}
	}

	/**
	 * Zeigt alle Produkte an und löscht ein ausgewähltes Produkt
	 */
	public void produktLoeschen() {
		if (produktListe.isEmpty()) {
			System.out.println("Keine Produkte vorhanden.");
			return;
		}

		for (int i = 0; i < produktListe.size(); i++) {
			Produkt p = produktListe.get(i);
			System.out.println("Produkt " + i + ": " + p.getMarke() + " " + p.getModell() + " - " + p.getPreis() + "€ ["
					+ p.getTyp() + "]");
		}

		System.out.print("Welches Produkt löschen? (Nummer eingeben): ");
		String eingabe = sc.nextLine();

		int auswahl;

		try {
			// Versuche: String in Zahl umwandeln
			auswahl = Integer.parseInt(eingabe);
		} catch (NumberFormatException e) {
			// Wenn es keine gültige Zahl ist (z.B. "abc")
			System.out.println("Fehlerhafte Eingabe. ID eingeben.");
			return;
		}
		if(auswahl < 0 || auswahl >=produktListe.size()) {
			System.out.println("Fehlerhafte Eingabe. Produkt existiert nicht.");
		    return;
		}

		System.out.print("Wirklich löschen? (ja/nein): ");
		String bestaetigung = sc.nextLine();

		if (bestaetigung.equalsIgnoreCase("ja") || bestaetigung.equalsIgnoreCase("j")) {
			produktListe.remove(auswahl);
			System.out.println("Produkt wurde gelöscht.");
		} else if (!bestaetigung.equalsIgnoreCase("nein") && !bestaetigung.equalsIgnoreCase("n")) {
			System.out.println("Fehlerhafte Eingabe.");
		}
	}

	/**
	 * Beendet den PC-Shop
	 */

	public void shopBeenden() {
		System.out.println("Wirklich beenden? (ja/nein)");
		String bestaetigung = sc.nextLine();

		if (bestaetigung.equalsIgnoreCase("ja") || bestaetigung.equalsIgnoreCase("j")) {
			System.out.println("Der PC-Shop wird beendet.");
			System.exit(0);
		} else if (!bestaetigung.equalsIgnoreCase("nein") && !bestaetigung.equalsIgnoreCase("n")) {
			System.out.println("Fehlerhafte Eingabe.");
		}
	}
}