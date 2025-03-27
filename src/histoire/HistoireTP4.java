package histoire;

import personnages.Commercant;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		Yakuza yaku = new Yakuza("Yaku Le Noir", "Warsong", 30);
		Commercant marco = new Commercant("Marco", 15);

		yaku.direBonjour();
		System.out.println("(Yaku Le Noir) - Marco, si tu tiens à la vie donne moi ta bourse !");

	}

}
