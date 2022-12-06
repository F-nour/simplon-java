package co.simplon.POO.app;

public class Moteurs extends Vehicule{
	
	String marque;
	int puissance;
	
	@Override	
	public String toString() {
		return "Mon véhicule est de marque " + this.marque + ". Il a " + this.puissance + " chevaux de puissance et il est de couleur "  + this.couleur + ".";
	}

	@Override
	public void peindre(String couleur) {
		this.couleur = couleur;
	}

	

}
