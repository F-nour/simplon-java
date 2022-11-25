package firstJavaProject.bar;

public class Restaurant {
	
	Cafetiere cafetiere;
	double profit;
	
	public Restaurant() {
		this.cafetiere = new Cafetiere();
	}

	public double servir(Client client) {
		if (client.tasse == null) {
			if (client.commandeCafe.quantiteLiquideMl > 100) {
			client.tasse = new Tasse(500);
			} else {
				client.tasse = new Tasse();
			}
		}
		
		if (getOut(client)) {
			System.out.println("Le client a été viré du bar ! La facture est de " + client.valeurFacture);
		}
		
		this.cafetiere.remplir(
				client.tasse,
				client.commandeCafe.typeCafe,
				client.commandeCafe.quantiteLiquideMl
			);
		if (client.commandeCafe == null) {
			getOut(client);
		}
		client.valeurFacture = facture(client);
		this.profit += client.valeurFacture; 
		return client.valeurFacture;
	}
	
	public double facture(Client client) {
		int prixTasse = client.tasse.prix(); 
		double facture = (client.commandeCafe.typeCafe.coutParMl * client.commandeCafe.quantiteLiquideMl) + prixTasse;
		if (getOut(client)) {
			facture = 0; 
		}
		
		return facture;
	}
	
	public boolean getOut(Client client) 
	{
		if (client.commandeCafe != null) {	
			if (client.commandeCafe.typeCafe == TypeCafe.BATARD) {
				return true;
			}
			
			if (client == new Client()) {
				return true;
			}
			
		}
		
		if (client.commandeCafe == null) { 
			return true;
		}
		
		return false;
	}
	
}
