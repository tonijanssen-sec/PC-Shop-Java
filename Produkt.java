package OOPProjektPCShopToniJanssen;
/**
 * Die Basisklasse für das Produkt 
 */
public class Produkt {
	protected String marke, modell;
	protected double preis;
	
 /**
  * Gibt die Marke zurück
  */
	public String getMarke() {
		return marke;
	}
	
/**
 * Setzt die Marke
 */
	public void setMarke(String marke) {
		this.marke = marke;
	}
	
/**
 * Gibt das Modell zurück
 */
	public String getModell() {
		return modell;
	}
	
/**
 * Setzt das Modell
 */
	public void setModell(String modell) {
		this.modell = modell;
	}
	
/**
 * Gibt den Preis zurück
 */
	public double getPreis() {
		return preis;
	}
	
/**
 * Setzt den Preis
 */
	public void setPreis(double preis) {
		this.preis = preis;
	}	
	
/**
 * Gibt den Typ des Produkts zurück
 */
	public String getTyp() {
	    return "Produkt";
	}
}
