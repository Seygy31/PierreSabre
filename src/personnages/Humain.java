package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;

	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}

	public int getArgent() {
		return argent;
	}

	public String getNom() {
		return nom;
	}

	public String getBoisson() {
		return boisson;
	}

	public void direBonjour() {
		parler(" Bonjour ! Je m'appelle " + getNom() + " et j'aime boire du " + getBoisson());
	}

	public void boire() {
		parler(" Mmmm, un bon verre de " + getBoisson() + "! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			argent -= prix;
			parler(" J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir un(e) " + bien + " à " + prix
					+ " sous");
		} else {
			parler(" Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir un " + bien + "à "
					+ prix + " sous");
		}

	}

	public void gagnerArgent(int gain) {
		argent += gain;
	}

	public void perdreArgent(int perte) {
		argent -= perte;
	}

	public void parler(String texte) {
		System.out.println("(" + nom + ")" + texte);
	}

}