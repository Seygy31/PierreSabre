package personnages;

public class Ronin extends Humain {
    private int honneur = 1;

    public Ronin(String nom, int argent) {
        super(nom, "shochu", argent);
    }

    public void donner(Commercant beneficiaire) {
        int montant = (int) (getArgent() * 0.10);
        perdreArgent(montant);
        beneficiaire.recevoir(montant);
        parler(beneficiaire.getNom() + " prend ces " + montant + " sous.");
    }

    public int getForce() {
        return honneur * 2;
    }

    public void provoquer(Yakuza adversaire) {
        int forceRonin = getForce();
        int reputationYakuza = adversaire.getReputation();
        parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
        if (forceRonin >= reputationYakuza) {
            int argentPris = adversaire.getArgent();
            honneur += 1;
            parler("Je t'ai eu petit yakusa!");
            gagnerArgent(argentPris);
            adversaire.perdre();
        } else {
            honneur -= 1;
            parler("J’ai perdu mon duel et mes " + getArgent() + " sous, snif... J'ai déshonoré le clan de " + adversaire.getClan());
            perdreArgent(getArgent());
            adversaire.gagner(getArgent());
        }
    }
}
