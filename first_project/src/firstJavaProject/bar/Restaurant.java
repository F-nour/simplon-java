package firstJavaProject.bar;

public class Restaurant {
	
	Cafetiere cafetiere;
	double profit;
	
	public Restaurant() {
		this.cafetiere = new Cafetiere();
	}

	public double servir(Client client) {
		if (!getOut(client)) {
		
			getTasse(client); 
			
			this.cafetiere.remplir(
					client.tasse,
					client.commandeCafe.typeCafe,
					client.commandeCafe.quantiteLiquideMl
				);
			
			client.valeurFacture += facture(client);
			this.profit += client.valeurFacture; 
		}
		return client.valeurFacture;
	}
	
	public void getTasse(Client client) {
		if (client.tasse == null) {
			if (client.commandeCafe.quantiteLiquideMl > 100) {
				client.tasse = new Tasse(500);
				client.valeurFacture += 3;
			} else {
				client.tasse = new Tasse();
				client.valeurFacture += 2;
			}

		}
	}
	
	public double facture(Client client) {
		double facture =  client.commandeCafe.typeCafe.coutParMl * client.commandeCafe.quantiteLiquideMl;
		if (getOut(client)) {
			facture = 0; 
		}
		
		return facture;
	}
	
	public boolean getOut(Client client) {
		if (client.commandeCafe == null || client.commandeCafe.typeCafe == TypeCafe.BATARD) {
			System.out.println("Hors de mon resto !!");
			return true;
		}
		
		return false;
	}
	
}
