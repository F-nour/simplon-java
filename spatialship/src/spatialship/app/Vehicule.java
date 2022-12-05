package spatialship.app;

import java.util.ArrayList;

public abstract class Vehicule {
	
	ArrayList<Creature> passagers;
	int nbMaximumPassager;
	
	public boolean ajouterPassager(Creature creature) {
		boolean isOk = false;
		if (this.passagers.size() <= this.nbMaximumPassager) {
			this.passagers.add(creature);
			creature.afficherInformations(); 
			isOk = true;
		} else System.out.println("Impossible d'ajouter un nouveau passager ! Le véhicule est plein ! ");
		return isOk;
	}

}
