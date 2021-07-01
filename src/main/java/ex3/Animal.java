package ex3;

public class Animal {
	private String nom;
	private TypeAnimal type;
	private RegimeAnimal regime;
	private Zone zone;

	public Animal(String nom, TypeAnimal type, RegimeAnimal regime) {
		super();
		this.nom = nom;
		this.type = type;
		this.regime = regime;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public TypeAnimal getType() {
		return type;
	}

	public void setType(TypeAnimal type) {
		this.type = type;
	}

	public RegimeAnimal getRegime() {
		return regime;
	}

	public void setRegime(RegimeAnimal regime) {
		this.regime = regime;
	}
	
	public Zone getZone() {
		return zone;
	}

	public void setZone(Zone zone) {
		this.zone = zone;
	}

	@Override
	public String toString() {
		return "Animal [nom=" + nom + ", type=" + type + ", regime=" + regime + "]";
	}

}
