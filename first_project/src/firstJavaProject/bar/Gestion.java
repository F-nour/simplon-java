package firstJavaProject.bar;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Gestion {
	
	final static JFrame frame = new JFrame();
	
	public static String nomClient(Restaurant restaurant) {
		String nom = JOptionPane.showInputDialog(frame,
				"Bonjour et bienvenue au restaurant " + restaurant.nom + ". \n" + "Quel est votre nom ? ", "Bienvenue !", JOptionPane.QUESTION_MESSAGE);
		
		if (nom == null) annulation();
		
		JOptionPane.showMessageDialog(frame, "Puis-je prendre votre commande " + nom + "?", "Bienvenue !" + nom, JOptionPane.QUESTION_MESSAGE);
	
		
		return nom;
	}

	public static int tassePossedee() {
		int tasse = JOptionPane.showConfirmDialog(null, "Avez-vous une tasse ?", "Besoin d'une tasse ?", JOptionPane.YES_NO_CANCEL_OPTION);

		if (tasse == 1) {
			String choixTasse = JOptionPane.showInputDialog(null, "Quelle taille de tasse souhaitez-vous ",
					"Taille de tasse souhaitée", JOptionPane.QUESTION_MESSAGE);
			tasse = convertInputValue(choixTasse, 100);
		} else if (tasse == JOptionPane.CANCEL_OPTION) annulation();
		
		return tasse;
	}
	
	public static TypeCafe choixCafe() {
		TypeCafe[] typeCafe = TypeCafe.values();
		TypeCafe choix = (TypeCafe) JOptionPane.showInputDialog(frame, "Quel type de café souhaitez-vous ?",
				"Choisissez votre type de café", JOptionPane.QUESTION_MESSAGE, null, typeCafe, typeCafe[0]);
		
		if (choix == null) annulation();
		
		return choix;
	}

	public static int quantiteCafe() {
		int quantite = 0;

		JOptionPane optionPane = new JOptionPane();
		JSlider slider = getSlider(optionPane);

		optionPane.setMessage(new Object[] { "Quantité de café souhaitée : ", slider });
		optionPane.setMessageType(JOptionPane.QUESTION_MESSAGE);
		optionPane.setOptionType(JOptionPane.OK_OPTION);

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

	public static void stop(String message) {
		JOptionPane.showMessageDialog(null, message, "Au revoir", JOptionPane.WARNING_MESSAGE);
		System.exit(0);

	}

	public static int convertInputValue(String inputValue, int value) {
		int conversion = value;
		
		if (inputValue == null) return conversion;
		
		if (!inputValue.isEmpty()) conversion = Integer.parseInt(inputValue);
		return conversion;
	}
	
	public static void annulation() {
		String message = "Vous avez annulé votre commande";
		stop(message);
	}
	
}
