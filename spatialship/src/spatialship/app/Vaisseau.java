package spatialship.app;

import java.util.ArrayList;
import java.util.Arrays;

public class Vaisseau {
	Creature capitaine;
	ArrayList<Creature> passagers;
	ArrayList<CapsuleDeSecour> capsulesDeSecour;
	int nbMaximumPassager;

	public Vaisseau() {
		this.capitaine = new Creature("Nour-eddine FATTOUM", Race.HUMAIN, 42);
		this.capsulesDeSecour = new ArrayList<CapsuleDeSecour>(
				Arrays.asList(new CapsuleDeSecour(), new CapsuleDeSecour()));
		this.passagers = new ArrayList<Creature>();
		this.nbMaximumPassager = 10;
	}

	public Vaisseau(Creature capitaine, ArrayList<Creature> passagers, int nbrCapsulesDeSecour,
			int nbMaximumPassager) {
		this.capitaine = capitaine;
		this.passagers = passagers;
		for (int i = 0 ; i < nbrCapsulesDeSecour ; i++) {
			this.capsulesDeSecour.add(new CapsuleDeSecour());
		}
		this.nbMaximumPassager = nbMaximumPassager;
	}
	
	public boolean ajouterPassager(Creature creature) {
		boolean isPossible = false;
		if (this.passagers.size() < this.nbMaximumPassager) {
			this.passagers.add(creature);
			creature.afficherInformations(); 
			isPossible = true;
		}
		System.out.println("Impossible d'ajouter un nouveau passager ! Le vaisseau est plein ! ");
		return isPossible;
	}
	
	public void ajouterPassagerClandestin(Creature creature, int potDeVin) {
		this.passagers.add(creature);
	}
	
	public boolean ajouterPassagerCapsuleSecour() {
		boolean isInCapsule = false;
		if (this.capsulesDeSecour.get(0).ajouterPassager(this.passagers.get(0))) {
			this.passagers.remove(0);
			isInCapsule = true;
		}
		return isInCapsule;
	}
	
	

}
