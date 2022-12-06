package spatialship.app;

public class Creature {

	String nom;
	Race race;
	int age;

	public Creature() {
		this.nom = "Nour-eddine";
		this.race = Race.HUMAIN;
		this.age = 18;
	}

	public Creature(String nom, Race race, int age) {
		this.nom = nom;
		this.race = race;
		this.age = age;
	}

	public boolean isAdulte() {
		if (this.age == this.race.ageAdulte) {
			return true;
		}
		return false;
	}

	public void afficherInformations() {
		String type;
		if (isAdulte())
			type = "adulte";
		else
			type = "enfant";

		System.out.println("Mon nom est " + this.nom + ". Je suis un " + this.race + ". Je suis un " + type + ".");
	}

}
