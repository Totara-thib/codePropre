package ex3;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		Zone savane = new Zone("Savane africaine");
		Zone carnivore = new Zone("Zone carnivore");
		Zone reptile = new Zone("Ferme reptile");
		Zone aquarium = new Zone("Aquarium");
		savane.addAnimal(new Animal("Gazelle",TypeAnimal.MAMMIFERE,RegimeAnimal.HERBIVORE));
		savane.addAnimal(new Animal("Zèbre",TypeAnimal.MAMMIFERE,RegimeAnimal.HERBIVORE));
		carnivore.addAnimal(new Animal("Lion",TypeAnimal.MAMMIFERE,RegimeAnimal.CARNIVORE));
		carnivore.addAnimal(new Animal("Panthère",TypeAnimal.MAMMIFERE,RegimeAnimal.CARNIVORE));
		reptile.addAnimal(new Animal("Boa constrictor",TypeAnimal.REPTILE,RegimeAnimal.CARNIVORE));
		reptile.addAnimal(new Animal("Python",TypeAnimal.REPTILE,RegimeAnimal.CARNIVORE));
		aquarium.addAnimal(new Animal("Requin blanc",TypeAnimal.POISSON,RegimeAnimal.CARNIVORE));
		aquarium.addAnimal(new Animal("Truite dorée",TypeAnimal.POISSON,RegimeAnimal.HERBIVORE));
		zoo.addZone(savane);
		zoo.addZone(carnivore);
		zoo.addZone(reptile);
		zoo.addZone(aquarium);
		System.out.println(zoo);
		System.out.println(aquarium.calculerKgsNourritureParJour());
	}

}
