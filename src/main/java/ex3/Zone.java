package ex3;

import java.util.ArrayList;
import java.util.List;

public class Zone {
	private String nom;
	private List<Animal> animals = new ArrayList<Animal>();
	private Zoo zoo;

	public Zone(String nom) {
		super();
		this.nom = nom;
	}
	
	public double calculerKgsNourritureParJour(){
		double nourriture = 0;
		for (Animal animal : animals) {
			switch (animal.getType()) {
			case MAMMIFERE:
				nourriture += 10;
			case REPTILE:
				nourriture += 0.1;
			case POISSON:
				nourriture += 0.2;
			}
		}
		return nourriture;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}

	public void addAnimal(Animal animal) {
		animal.setZone(this);
		this.animals.add(animal);
	}

	public Zoo getZoo() {
		return zoo;
	}

	public void setZoo(Zoo zoo) {
		this.zoo = zoo;
	}

	@Override
	public String toString() {
		return "Zone [nom=" + nom + ", animals=" + animals + "]";
	}

}
