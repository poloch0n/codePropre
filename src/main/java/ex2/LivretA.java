package ex2;

/**
 * @author Formation
 *
 */
public class LivretA extends CompteBancaire {

	private double tauxRemuneration;
	
	/**
	 * Ce constructeur est utilisé pour créer un Livret A
	 * 
	 * @param solde            représente le solde du compte
	 * @param decouvert        représente le découvert autorisé
	 * @param tauxRemuneration représente le taux de rémunération du livret A
	 */
	public LivretA(double solde, double decouvert, double tauxRemuneration) {
		super( solde, 0);
		this.setTauxRemuneration(tauxRemuneration);
	}

	public void debiterMontant(double montant){
		if (this.solde - montant > 0){
			this.solde = solde - montant;
		}
	}

	public void appliquerRemuAnnuelle() {
		this.solde = solde + solde * tauxRemuneration / 100;
	}
	
	/**
	 * Getter for tauxRemuneration
	 * 
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter
	 * 
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}
