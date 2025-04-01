package histoire;

import personnages.Commercant;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {
    public static void main(String[] args) {
        Ronin roro = new Ronin("Roro", 60);
        Yakuza yaku = new Yakuza("Yaku Le Noir", "Warsong", 45);

        roro.provoquer(yaku);

        if (roro.getForce() < yaku.getReputation()) {
            roro.parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
            yaku.parler("Ce ronin pensait vraiment battre Yaku Le Noir du clan de " + yaku.getClan() + " ? Je l'ai dépouillé de ses " + roro.getArgent() + " sous.");
        }
    }
}
