package OOPProjektPCShopToniJanssen;

/**
 * Klasse für Tastatur, welche von Produkt erbt
 */
public class Tastatur extends Produkt {
	protected boolean mechanisch;

/**
 * Gibt zurück ob die Tastatur mechanisch ist
 */
	public boolean isMechanisch() {
		return mechanisch;
	}

/**
 * Setzt ob die Tastatur mechanisch ist
 */
	public void setMechanisch(boolean mechanisch) {
		this.mechanisch = mechanisch;
	}
	
/**
 * Gibt den Typ des Produkts zurück
 */
	public String getTyp() {
	    return "Tastatur";
	}
}