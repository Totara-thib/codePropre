package ex2;

/** Class LivretA représente un compte bancaire de type Livret A (type=LA) 
 * @author DIGINAMIC
 */
public class LivretA extends CompteBancaire {
	
	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private Double tauxRemuneration;
	
	/** Ce constructeur est utilisé pour créer un compte de type Livret A
	 * @param type = LA
	 * @param solde représente le solde du compte
	 * @param decouvert  représente le découvert autorisé définis a 0 par défault
	 * @param tauxRemuneration  représente le taux de rémunération du livret A
	 */

	public LivretA(String type, Double solde, Double decouvert, Double tauxRemuneration) {
		super("LA", solde, 0.0);
		this.tauxRemuneration = tauxRemuneration;
	}
	
	/** Applique le taux de rémuneration annuelle a la solde du Livret A */
	public void appliquerRemuAnnuelle(){
		Double solde = getSolde();
		solde = solde + solde*tauxRemuneration/100;
	}
	
	/** Getter pour tauxRemuneration
	 * @return le taux de remunération du compte
	 */
	public Double getTauxRemuneration() {
		return tauxRemuneration;
	}
	/** Setter permet de modifier le taux de remunération du compte
	 * @param tauxRemuneration est un double
	 */
	public void setTauxRemuneration(Double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}
