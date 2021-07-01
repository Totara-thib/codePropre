package ex1;

import java.util.Date;

/**
 * Classe Entreprise qui permet d'instancier une entreprise avec ses attributs
 * 
 * @author Thibaud
 */

public class Entreprise {

	/** Map de variables */
	public int siret;
	public String nom;
	public String adresse;
	public Date dateCreation;
	
	/** Nombre maximum de valeurs */
	public static final int CAPITAL_MAX = 3000000;
	
	/** Permet d'afficher le statut de l'entreprise */
	public void afficherStatut(){
		
	}
	
}
