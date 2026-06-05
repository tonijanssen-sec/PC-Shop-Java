package OOPProjektPCShopToniJanssen;
	
/**
 * Klasse für den Monitor, welche von Produkt erbt
 */
	public class Monitor extends Produkt {
		protected String bildschirmaufloesung;

/**
 * Gibt die Bildschirmauflösung zurück
 */
		public String getBildschirmaufloesung() {
			return bildschirmaufloesung;
		}

/**
 * Setzt die Bildschirmauflösung
 */
		public void setBildschirmaufloesung(String bildschirmaufloesung) {
			this.bildschirmaufloesung = bildschirmaufloesung;
		}
		
/**
 * Gibt den Typ des Produkts zurück
 */
		public String getTyp() {
		    return "Monitor";
		}
	}