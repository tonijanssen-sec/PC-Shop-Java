package OOPProjektPCShopToniJanssen;

/**
 * Klasse für Maus, welche von Produkt erbt
 */
public class Maus extends Produkt {
	protected boolean ergonimisch;

/**
 * Gibt zurück ob die Maus ergonomisch ist
 */	
	public boolean isErgonimisch() {
		return ergonimisch;
	}

/**
 * Setzt ob die Maus ergonomisch ist
 */
	
	public void setErgonimisch(boolean ergonimisch) {
		this.ergonimisch = ergonimisch;
	}
	
/**
 * Gibt den Typ des Produkts zurück
 */
	public String getTyp() {
	    return "Maus";
	}
}