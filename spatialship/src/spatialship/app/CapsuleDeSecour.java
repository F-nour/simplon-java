package spatialship.app;

import java.util.ArrayList;

public class CapsuleDeSecour {

	ArrayList<Creature> passagers;
	int nbMaximumPassager;
	boolean isInSpace;

	public CapsuleDeSecour() {
		this.passagers = new ArrayList<Creature>();
		this.nbMaximumPassager = 3;
		this.isInSpace = false;
	}

	public boolean ajouterPassager(Creature creature) {
		boolean isInSpaceship = false;
		if (this.passagers.size() < this.nbMaximumPassager) {
			this.passagers.add(creature);
			isInSpaceship = true;
		}
		return isInSpaceship;
	}
	
	public ArrayList<Creature> lanceCapsule() {
		this.isInSpace = true;
		return this.passagers;
	}

}
