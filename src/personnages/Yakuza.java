package personnages;

public class Yakuza extends Humain {
	private int reputation = 0;
	private String clan;

	public Yakuza(String nom, String clan, int argent) {
		super(nom, "whisky", argent);
		this.clan = clan;
	}

	public void extorquer(Commercant victime) {
		int wallet = victime.getArgent();
		gagnerArgent(wallet);
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		victime.seFaireExtorquer();
		reputation += 1;
	}

}
