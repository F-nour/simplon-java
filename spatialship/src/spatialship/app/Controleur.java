package spatialship.app;

public class Controleur {
	
	Race race;

	public Controleur(Race race) {
		this.race = race;
	}
	
	public boolean verifierVaisseau(Vaisseau vaisseau) {
		boolean controle = true;
		if (!vaisseau.capitaine.isAdulte()) {
			controle = false;
			System.out.println("Le capitaine est un enfant !!!");
		};
		
		for (int i = 0 ; i < vaisseau.passagers.size() ; i++) {
			Creature passager = vaisseau.passagers.get(i);
			if (passager.race == Race.KLINGON) {
				if (this.race != Race.KLINGON) {
					controle = false;
					System.out.println("ATTENTION ! Il y a un passager " + passager.race + ".");
				}
			}
			if (passager.race == Race.HUMAIN) {
				int k = 1;
				k++;
				if (k % 2 != 0) {
					controle = false;
					System.out.println("Le nombre d'humains est impair.");
				}
			}
			
			if (passager.nom == "Nour-eddine FATTOUM" && passager.race == Race.HUMAIN) {
				controle = false;
				System.out.println("Vous avez le même nom que moi mais vous n'êtes pas humain");
			}
		}
		
		if (vaisseau.passagers.size() > vaisseau.nbMaximumPassager) {
			controle = false;
			System.out.println("Il y a trop de passager dans ce vaisseau ! ");
		}
		
		if (controle == false) {
			System.out.println("ECHEC DU CONTRÔLE !!! Le vaisseau reste à quais");
		} else {
			System.out.println("Le vaisseau peut partir !!!");
		}
		return controle;
	}
}
