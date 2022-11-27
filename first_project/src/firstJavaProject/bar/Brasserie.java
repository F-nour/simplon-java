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

		String nomClient = "";
		while (nomClient.isEmpty()) nomClient = nomClient(restaurant);

		int tasse = tassePossedee();

		TypeCafe typeCafe = choixCafe();
		if (typeCafe == TypeCafe.BATARD)
			stop();

		int quantiteMl = quantiteCafe();

		Client client = creerClient(nomClient, tasse, typeCafe, quantiteMl);

		restaurant.servir(client);
		
		double valeurFacture = client.valeurFacture * 100;
		int facture = (int) valeurFacture;
		
		String paiement = JOptionPane.showInputDialog(frame, "Vous nous devez " + facture + " centimes d'euros");
		int pay = convertInputValue(paiement, 0);
		
		if (pay < facture) {
			int manque = facture - pay;
			int i = 0;
			while (manque > 0) {
				i++;
				String resteAPayer = JOptionPane.showInputDialog(frame,
						"Vous nous deviez " + facture + " centimes d'euros et vous nous avez donné " + pay
								+ " centimes d'euros. \n" + "Vous nous devez encore " + manque + " centimes d'euros.");
				int resteDu = convertInputValue(resteAPayer, 0);
				
				manque = manque - resteDu;
				System.out.println(manque);
				pay += resteDu;
				if (i == 3) {
					JOptionPane.showMessageDialog(frame, "ö Voleur ! ö Voleur ! Mais que fait la police ?");
					System.exit(0);
				}
			}

		}
		
		if (pay > facture) {
			double rendu = pay - facture;
			JOptionPane.showMessageDialog(frame,
					"Vous nous deviez " + facture + " centimes d'euros et vous nous avez donné " + pay + ". \n"
							+ "Nous vous rendons la somme de " + rendu + " centimes d'euros. \n\n"
							+ "Nous vous remercions de votre venu au restaurant " + restaurant.nom + " " + client.nom
							+ ".");
		} else {
			JOptionPane.showMessageDialog(frame,
					"Nous vous remercions de votre venu au restaurant " + restaurant.nom + " " + client.nom + ".");
		}

	}

	public static Restaurant resto() {
		Random random = new Random();
		ArrayList<Restaurant> restaurants = BanqueDeDonnee.listeRestaurants;
		Restaurant restaurant = restaurants.get(random.nextInt(restaurants.size()));
		return restaurant;
	}

	public static String nomClient(Restaurant restaurant) {
		String nom = JOptionPane.showInputDialog(frame,
				"Bonjour et bienvenue au restaurant " + restaurant.nom + ". \n" + "Quel est votre nom ? ", "Bienvenue");
		
		if (!nom.isEmpty()) JOptionPane.showMessageDialog(frame, "Puis-je prendre votre commande " + nom + "?");
		return nom;
	}

	public static TypeCafe choixCafe() {
		TypeCafe[] typeCafe = TypeCafe.values();
		TypeCafe choix = (TypeCafe) JOptionPane.showInputDialog(frame, "Quel type de café souhaitez-vous ?",
				"Choisissez votre type de café", JOptionPane.QUESTION_MESSAGE, null, typeCafe, typeCafe[0]);

		return choix;
	}

	public static int tassePossedee() {
		int tasse = JOptionPane.showConfirmDialog(null, "Avez-vous une tasse ?");

		if (tasse == 1) {
			String choixTasse = JOptionPane.showInputDialog(null, "Quelle taille de tasse souhaitez-vous ",
					"Taille de tasse souhaitée");
			tasse = convertInputValue(choixTasse, 100);
		}
		return tasse;
	}

	public static int quantiteCafe() {
		int quantite = 0;

		JOptionPane optionPane = new JOptionPane();
		JSlider slider = getSlider(optionPane);

		optionPane.setMessage(new Object[] { "Quantité de café souhaitée : ", slider });
		optionPane.setMessageType(JOptionPane.QUESTION_MESSAGE);
		optionPane.setOptionType(JOptionPane.OK_CANCEL_OPTION);

		JDialog dialog = optionPane.createDialog(frame, "Quantité de café souhaitée");
		dialog.setVisible(true);

		String value = optionPane.getInputValue().toString();

		if (value == "uninitializedValue") {
			quantite = 50;
		}

		if (value != "uninitializedValue") {
			quantite = (int) optionPane.getInputValue();
		}

		return quantite;
	}

	private static JSlider getSlider(final JOptionPane optionPane) {
		JSlider slider = new JSlider();

		slider.setMajorTickSpacing(50);
		slider.setMaximum(500);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);

		ChangeListener changeListener = new ChangeListener() {
			public void stateChanged(ChangeEvent changeEvent) {
				JSlider theSlider = (JSlider) changeEvent.getSource();
				if (!theSlider.getValueIsAdjusting()) {
					optionPane.setInputValue((int) theSlider.getValue());
				}
			}
		};

		slider.addChangeListener(changeListener);

		return slider;
	}

	public static Client creerClient(String nomClient, int tasse, TypeCafe type, int quantite) {
		Client client = new Client(nomClient, new Cafe(type, quantite), false);
		if (tasse == 0) {
			client = new Client(nomClient, new Cafe(type, quantite), true);
		}
		return client;
	}

	public static void stop() {
		JOptionPane.showMessageDialog(frame, "Vous n'êtes pas le bienvenue", "DEHORS !!!", JOptionPane.WARNING_MESSAGE);
		System.exit(0);

	}

	private static int convertInputValue(String inputValue, int value) {
		int conversion = value;
		if (!inputValue.isEmpty()) conversion = Integer.parseInt(inputValue);
		return conversion;
	}
}
