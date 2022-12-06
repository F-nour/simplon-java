	package co.simplon.POO.app;

import java.util.ArrayList;

public class Lists {

	public void  listeObjets() {
		ArrayList<Vehicule> vehicules = new ArrayList<Vehicule>();
		vehicules.add(new Moteurs());
		vehicules.add(new Bus());
		vehicules.add(new Camion());
	
		vehicules.get(0).peindre("vert");
		vehicules.get(1).peindre("rouge");
		vehicules.get(2).peindre("jaune");
	}
}
