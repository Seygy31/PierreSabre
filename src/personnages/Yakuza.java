package personnages;

public class Yakuza extends Humain {
	private int reputation = 4;
	private String clan;

	public Yakuza(String nom, String clan, int argent, String string) {
		super(nom, "whisky", argent);
		this.clan = clan;
	}

	public void extorquer(Commercant victime) {
		int wallet = victime.getArgent();
		gagnerArgent(wallet);
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		victime.seFaireExtorquer();
		reputation += 1;
		parler("J’ai piqué les " + wallet + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent()
				+ " sous dans ma poche. Hi ! Hi !");

	}

	public String getClan() {
		return clan;
	}

	public int perdre() {
		int wallet = getArgent();
		reputation -= 1;
		parler("J'ai perdu mon duel et mes " + getArgent() + " sous,snif... J'ai déshonoré le clan de " + getClan());
		perdreArgent(wallet);
		return wallet;
	}

	public void gagner(int gain) {
		gagnerArgent(gain);
		int argent = getArgent();
		reputation += 1;
		parler(" Ce ronin pensait vraiment battre " + getNom() + "du clan " + getClan() + "? Je l'ai dépouillé de ses "
				+ argent + " sous");
		parler("J'ai gagné le duel et pris " + argent + " sous de mon adversaire ! Ma réputation grandit !");
	}

	public int getReputation() {
		return reputation;
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler(" Mon clan est celui de " + getClan());
	}
}
