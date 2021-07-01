package ex3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private String nom;
	private List<Zone> zones = new ArrayList<Zone>();

	public Zoo(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter for nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Zone> getZones() {
		return zones;
	}

	public void setZones(List<Zone> zones) {
		this.zones = zones;
	}

	public void addZone(Zone zone) {
		zone.setZoo(this);
		this.zones.add(zone);
	}

	@Override
	public String toString() {
		return "Zoo [nom=" + nom + ", zones=" + zones + "]";
	}

}
