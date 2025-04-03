package histoire;

import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {
	public static void main(String[] args) {
		Ronin roro = new Ronin("Roro", "shochu", 60);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");

		roro.provoquer(yaku);

	}
}
