package ex2;

/** Représente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 * @author DIGINAMIC
 */
public class CompteBancaire {

	/** solde : solde du compte */
	private Double solde;
	
	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	private Double decouvert;
	
	/** Le type vaut soit CC=Compte courant, ou soit LA=Livret A */
	private String type;
	
	/**
	 * @param type est un String
	 * @param solde est un Double
	 * @param decouvert est un Double
	 */
	public CompteBancaire(String type, Double solde, Double decouvert) {
		super();
		this.type = type;
		this.solde = solde;
		this.decouvert = decouvert;
	}
	
	/** Ajoute un montant au solde
	 * @param montant est un Double
	 */
	public void ajouterMontant(Double montant){
		this.solde += montant;
	}
	
	/** Débite un montant donné a la solde du compte.
	 ** 
	 * Si la solde du Compte bancaire moins le montant débité 
	 * est supérieur au découvert autorisé
	 * @param montant est un Double
	 */
	public void debiterMontant(Double montant){
		if (type.equals("CC")){
			if (this.solde - montant > decouvert){
				this.solde = solde - montant;
			}	
		}
		else if (type.equals("LA")){
			if (this.solde - montant > 0){
				this.solde = solde - montant;
			}	
		}
	}
	
	
	/** Getter pour solde
	 * @return le solde
	 */
	public Double getSolde() {
		return solde;
	}
	
	/** Setter permet de modifier le solde du compte
	 * @param solde est un Double
	 */
	public void setSolde(Double solde) {
		this.solde = solde;
	}
	/** Getter pour decouvert
	 * @return le decouvert
	 */
	public Double getDecouvert() {
		return decouvert;
	}
	/** Setter permet de modifier le découvert du compte
	 * @param decouvert est un Double 
	 */
	public void setDecouvert(Double decouvert) {
		this.decouvert = decouvert;
	}

	/** Getter pour type
	 * @return le type du compte (CC ou LA)
	 */
	public String getType() {
		return type;
	}
	/** Setter  permet de modifier le type du compte
	 * @param type est un String
	 */
	public void setType(String type) {
		this.type = type;
	}
}
