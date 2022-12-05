package spatialship.app;

import java.util.ArrayList;

public class CapsuleDeSecour {

	ArrayList<Creature> passager;
	int nbMaximumPassager;
	boolean isInSpace;

	public CapsuleDeSecour() {
		this.passager = new ArrayList<Creature>();
		this.nbMaximumPassager = 3;
		this.isInSpace = false;
	}

	public boolean ajouterPassager(Creature creature) {
		boolean isInSpaceship = false;
		if (this.passager.size() < this.nbMaximumPassager) {
			this.passager.add(creature);
			isInSpaceship = true;
		}
		return isInSpaceship;
	}
	
	public ArrayList<Creature> lanceCapsule() {
		this.isInSpace = true;
		return this.passager;
	}

}
