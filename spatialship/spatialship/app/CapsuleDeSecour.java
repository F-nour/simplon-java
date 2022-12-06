package spatialship.app;

import java.util.ArrayList;

public class CapsuleDeSecour extends Vehicule {

	boolean isInSpace;

	public CapsuleDeSecour() {
		super();
		this.passagers = new ArrayList<Creature>();
		this.nbMaximumPassager = 3;
		this.isInSpace = false;
	}
	
	public ArrayList<Creature> lanceCapsule() {
		this.isInSpace = true;
		return this.passagers;
	}

}
