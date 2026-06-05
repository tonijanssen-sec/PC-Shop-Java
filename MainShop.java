package OOPProjektPCShopToniJanssen;

/**
 * Einstiegspunkt des PC-Shop Programms
 */

public class MainShop {
	
	/**
     * Startet das Programm und öffnet das Hauptmenü
     */
	public static void main(String[] args) {
		hauptMenue hm = new hauptMenue();
		hm.zeigHauptMenue();
	}
}