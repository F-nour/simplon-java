package firstJavaProject.fournitures;

import java.awt.Color;

public class Chaise {

	int nbrPieds;
//	Matiere matiere;
	Color couleur; 
	String author;
	int poidMax;
		
	public Chaise(Color couleur) {
		this.nbrPieds = 4;
		this.couleur = couleur;
		this.author = "Nour-eddine";
		this.poidMax = 300;
	}

	public int getNbrPieds() {
		return nbrPieds;
	}

	public void setNbrPieds(int nbrPieds) {
		this.nbrPieds = nbrPieds;
	}

	public Color getCouleur() {
		return couleur;
	}

	public void setCouleur(Color couleur) {
		this.couleur = couleur;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPoidMax() {
		return poidMax;
	}

	public void setPoidMax(int poidMax) {
		this.poidMax = poidMax;
	}
	
	
	
}
