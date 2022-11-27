package firstJavaProject.bar;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Brasserie {

	final static JFrame frame = new JFrame();
	
	public static void main(String[] args) {

		Restaurant restaurant = resto();
		
		String message = "";
		
		String nomClient = "";
		while (nomClient.isEmpty()) nomClient = Gestion.nomClient(restaurant);

		int tasse = Gestion.tassePossedee();

		TypeCafe typeCafe = Gestion.choixCafe();
		if (typeCafe == TypeCafe.BATARD) {
			message = "Vous n'êtes pas le bienvenue ! DEHORS !!!";
			Gestion.stop(message);
		}
			

		int quantiteMl = Gestion.quantiteCafe();

		Client client = Gestion.creerClient(nomClient, tasse, typeCafe, quantiteMl);

		restaurant.servir(client);
		
		double valeurFacture = client.valeurFacture * 100;
		int facture = (int) valeurFacture;
		
		String paiement = JOptionPane.showInputDialog(frame, "Vous nous devez " + facture + " centimes d'euros", "Montant de votre facture", JOptionPane.INFORMATION_MESSAGE);
		
		int pay = Gestion.convertInputValue(paiement, 0);
		if (pay < facture) {
			int manque = facture - pay;
			int i = 0;
			while (manque > 0) {
				i++;
				String resteAPayer = JOptionPane.showInputDialog(frame,
						"Vous nous deviez " + facture + " centimes d'euros et vous nous avez donné " + pay
								+ " centimes d'euros. \n" + "Vous nous devez encore " + manque + " centimes d'euros.",
								"Vous nous devez encore de l'argent...", JOptionPane.INFORMATION_MESSAGE);
				int resteDu = Gestion.convertInputValue(resteAPayer, 0);
				
				manque = manque - resteDu;
				pay += resteDu;
				if (i == 3) {
					message = "ö Voleur ! ö Voleur ! Mais que fait la police ?";
					Gestion.stop(message);
					
				}
			}

		}
		
		if (pay > facture) {
			double rendu = pay - facture;
			JOptionPane.showMessageDialog(frame,
					"Vous nous deviez " + facture + " centimes d'euros et vous nous avez donné " + pay + ". \n"
							+ "Nous vous rendons la somme de " + rendu + " centimes d'euros. \n\n"
							+ "Nous vous remercions de votre venu au restaurant " + restaurant.nom + " " + client.nom
							+ ".",
							"Merci de votre venue !", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(frame,
					"Nous vous remercions de votre venu au restaurant " + restaurant.nom + " " + client.nom + ".", "Merci de votre venue !", JOptionPane.INFORMATION_MESSAGE);
		}

	}

	public static Restaurant resto() {
		Random random = new Random();
		ArrayList<Restaurant> restaurants = BanqueDeDonnee.listeRestaurants;
		Restaurant restaurant = restaurants.get(random.nextInt(restaurants.size()));
		return restaurant;
	}
	
}
