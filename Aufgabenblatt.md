# Aufgabenblatt – OOP Projekt PC-Shop

## Projektname
`OOPProjektPCShop[Vorname Name]`

## Hauptmenü
Nach dem Start soll folgendes Menü angezeigt werden:

PC-Shop Hauptmenü von: [Vor- und Nachname]

1. Produkt anlegen
2. Produkt bearbeiten
3. Produkt suchen
4. Produkt löschen
5. Shop beenden

Bitte wählen:

## Aufgaben

### 1. Hauptmenü (`hauptMenue()`)
Bei falscher Eingabe: `"Fehlerhafte Eingabe"` → Hauptmenü erneut anzeigen.

### 2. Produkt anlegen (`produktAnlegen()`)
- Kategorien: Monitor, Motherboard, Tastatur, Maus
- Pflichtfelder: Marke, Modell, Preis + mind. 1 typspezifische Eigenschaft
- Vererbung zur Vermeidung doppelter Eigenschaften
- Leere Felder: `"Produkt konnte aufgrund leerer Eingabewerte nicht gespeichert werden"`
- Abfrage ob weiteres Produkt angelegt werden soll

### 3. Produkt bearbeiten (`produktBearbeiten()`)
- Alle Produkte durchnummeriert anzeigen
- Keine Produkte: `"Keine Produkte vorhanden"` → Hauptmenü
- Eigenschaften neu eingeben, Produkt aktualisieren
- Leere Felder: Speichern verweigern mit Hinweis
- Abfrage ob weiteres Produkt bearbeitet werden soll

### 4. Produkt suchen (`produktSuchen()`)
- Suchbegriff eingeben, alle Treffer durchnummeriert ausgeben
- Alle Eigenschaften der Produkte durchsuchen
- Abfrage ob erneut gesucht werden soll

### 5. Produkt löschen (`produktLoeschen()`)
- Alle Produkte durchnummeriert anzeigen
- Sicherheitsabfrage vor dem Löschen
- Bei falscher Eingabe: `"Fehlerhafte Eingabe"` → Hauptmenü

### 6. Shop beenden (`shopBeenden()`)
- Sicherheitsabfrage
- Bei Ja: `"PC Shop wurde beendet"`
- Bei Nein: Hauptmenü

## Weitere Anforderungen
- Alle fehlerhaften Eingaben abfangen
- JavaDoc für alle Methoden und Klassen
