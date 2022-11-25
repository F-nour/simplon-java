package firstJavaProject.bar;

public class Client {
	
	double valeurFacture;
	String nom;
	Cafe commandeCafe;
	Tasse tasse;
	
	public Client(String nom, Cafe commandeCafe, boolean avecTasse) {
		this.commandeCafe = commandeCafe;
		this.nom = nom;
		if (avecTasse) {
			this.tasse = new Tasse();
		}
	}

	public Client(String nom, Cafe commandeCafe, Tasse tasse) {
		super();
		this.nom = nom;
		this.commandeCafe = commandeCafe;
		this.tasse = tasse;
	}

	public Client() {
		super();
		this.nom = "Jean";
		this.tasse = new Tasse();
	}
}
