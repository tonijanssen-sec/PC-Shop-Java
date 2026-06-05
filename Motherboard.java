package OOPProjektPCShopToniJanssen;

/**
 * Klasse für das Motherboard, welches von Produkt erbt
 */
public class Motherboard extends Produkt {
	protected int massenspeicherAnschluesse;

/**
 * Gibt die Anzahl der Massenspeicher-Anschlüsse zurück
 */
	public int getMassenspeicherAnschluesse() {
		return massenspeicherAnschluesse;
	}

/**
 * Setzt die Anzahl der Massenspeicheranschlüsse
 */
	public void setMassenspeicherAnschluesse(int massenspeicherAnschluesse) {
		this.massenspeicherAnschluesse = massenspeicherAnschluesse;
	}

/**
 * Gibt den Typ des Produkts zurück
 */
	public String getTyp() {
	    return "Motherboard";
	}
}