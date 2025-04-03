package personnages;

public class Samourai extends Ronin {

	private String chef;

	public Samourai(String chef, String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		this.chef = chef;
	}

	public String getChef() {
		return chef;
	}

	public void direbonjour() {
		super.direBonjour();
		parler("Je suis fier de servir le seigneur " + getChef());
	}
}