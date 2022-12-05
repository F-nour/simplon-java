package spatialship.app;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Vaisseau extends Vehicule {
	Creature capitaine;
	ArrayList<CapsuleDeSecour> capsulesDeSecour;

	public Vaisseau() {
		super();
		this.capitaine = new Creature("Nour-eddine FATTOUM", Race.HUMAIN, 42);
		this.capsulesDeSecour = new ArrayList<CapsuleDeSecour>(
				Arrays.asList(new CapsuleDeSecour(), new CapsuleDeSecour()));
		this.passagers = new ArrayList<Creature>();
		this.nbMaximumPassager = 10;
	}

	public Vaisseau(Creature capitaine, ArrayList<Creature> passagers, int nbrCapsulesDeSecour,
			int nbMaximumPassager) {
		super();
		this.capitaine = capitaine;
		this.passagers = passagers;
		for (int i = 0 ; i < nbrCapsulesDeSecour ; i++) {
			this.capsulesDeSecour.add(new CapsuleDeSecour());
		}
		this.nbMaximumPassager = nbMaximumPassager;
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
	
	public boolean lancerCapsuleDeSecours() {
		boolean lancement = false;
		for (int i = 0 ; i < this.capsulesDeSecour.size() ; i++) {
			CapsuleDeSecour capsuleDeSecour = this.capsulesDeSecour.get(i); 
			if (capsuleDeSecour.passagers.size() == capsuleDeSecour.nbMaximumPassager) {
				lancement = true;
				capsuleDeSecour.lanceCapsule();
			} else if (this.passagers.size() == 0) {
				if (this.capitaine.nom == "Nour-eddine FATTOUM") {
					JOptionPane.showMessageDialog(null, "J'ai bien peur de ne pas pouvoir faire ça, Dave");
					capsuleDeSecour.lanceCapsule();
				}
				capsuleDeSecour.ajouterPassager(this.capitaine); 
				lancement = true;
				capsuleDeSecour.lanceCapsule();
			}
		}
		return lancement;
	}
	
	

}
