package co.simplon.POO.app;

public class Camion extends Moteurs{

	int tailleRemorque; 
	
	@Override
	public void peindre(String couleur) {
		this.couleur = couleur;
	}
}
