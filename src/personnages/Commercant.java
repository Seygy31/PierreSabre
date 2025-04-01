package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}

	public int seFaireExtorquer() {
		int wallet = getArgent();
		perdreArgent(wallet);
		parler("J’ai tout perdu! Le monde est trop injuste...");
		return wallet;
	}

	public void recevoir(int argent) {
		int wallet = getArgent();
		gagnerArgent(wallet);
		parler(argent + " sous ! Je te remercie généreux donateur!");
	}

}