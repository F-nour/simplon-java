package firstJavaProject.bar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

public class ChaineDeRestaurant {

	public static void main(String[] args) {

		ArrayList<Client> clients1 = new ArrayList<Client>();
		getClients(clients1);


		ArrayList<Client> clients2 = new ArrayList<Client>();
		getClients(clients2);


		ArrayList<Client> clients3 = new ArrayList<Client>();
		getClients(clients3);
		
		ArrayList<Client> clients = new ArrayList<Client>();
		clients.addAll(clients1);
		clients.addAll(clients2);
		clients.addAll(clients3);
		
		
		ArrayList<Client> clientsExpulses = new ArrayList<Client>();
		
		ArrayList<Client> clientsServis = new ArrayList<Client>();
		
		ArrayList<Restaurant> restaurants = BanqueDeDonnee.listeRestaurants;
		
		
		for (int i = 0 ; i < clients.size() ; i++ ) {
			Client client = clients.get(i); 
			Restaurant restaurant = (Restaurant) getDatas(restaurants);
			restaurant.servir(client);
			if (client.valeurFacture == 0) {
				clientsExpulses.add(client);
			} else {
				clientsServis.add(client);
			}
		}
						
		int confirm = JOptionPane.showConfirmDialog(null, "Il devrait y avoir 60 clients qui se sont présentés aux trois restaurants."
				+ "\n"
				+ clients.size() + " clients se sont présentés dans les trois restaurants. \n\n"
				+ "C'est réussi ?");
		
		if (confirm == 0) {
			JOptionPane.showMessageDialog(null, "Il y a eu " + clientsServis.size() + " clients servis.\n"
				+ "En revanche, " + clientsExpulses.size() + " clients ont été expulsés. \n" 
				+ "\n"
				+ "Le restaurant " + restaurants.get(0).nom + " a fait " + restaurants.get(0).profit + " euros de profit. \n"
				+ "Le restaurant " + restaurants.get(1).nom + " a fait " + restaurants.get(1).profit + " euros de profit. \n"
				+ "Le restaurant " + restaurants.get(2).nom + " a fait " + restaurants.get(2).profit + " euros de profit. \n"
				);
		} else {
			JOptionPane.showMessageDialog(null, "Votre application a rencontré un problème. Merci de corriger ceci.");
		}
 	}
	
	private static Object getDatas(@SuppressWarnings("rawtypes") ArrayList items) {
		Random random = new Random();
		return items.get(random.nextInt(items.size()));
	}
	
	private static Client listClients() {
		String nom = (String) getDatas(BanqueDeDonnee.listeNoms);
		Cafe commande = (Cafe) getDatas(BanqueDeDonnee.listeCommandes);
		Tasse tasse = (Tasse) getDatas(BanqueDeDonnee.listeTasses);
		Client client;
		return client = new Client(nom, commande, tasse);

	};
	
	private static ArrayList<Client> getClients(ArrayList<Client> list) {
		for (int i = 0 ; i < 20 ; i++) {
			list.add(listClients());
		}
		return list;
	}
	
}
