package co.simplon.POO.app;

public class Bus extends Moteurs {
	int nbPortes; 
	int places;
	
	@Override
	public String toString() {
		super.toString();
		return "Ce bus a " + this.nbPortes + " et " + this.places + " assises.";
	}
	
	@Override
	public void peindre(String couleur) {
		this.couleur = couleur;
	}
}
