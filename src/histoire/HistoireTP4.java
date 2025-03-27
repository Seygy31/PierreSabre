package histoire;

import personnages.Humain;

public class HistoireTP4 {
	
	
	public static void main(String[] args) {
		Humain humain1 = new Humain("Prof","kombucha", 40);
		
		humain1.direBonjour();
		humain1.acheter("boisson", 12);
		humain1.boire();
		humain1.acheter("jeu", 2);
		humain1.acheter("kimono" , 50);
		
		
	}

}
