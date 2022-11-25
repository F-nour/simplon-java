package first_java_project.bar;

public class Client {
	
	public String nom;
	public Cafe commandeCafe;
	public Tasse tasse;
	public double facture;
	
	public Client(String nom, Cafe commandeCafe, boolean commande) {
		this.commandeCafe = commandeCafe;
		this.nom = nom;
		if (commande) {
			new Tasse();
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
