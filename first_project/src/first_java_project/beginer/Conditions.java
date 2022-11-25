package first_java_project.beginer;

public class Conditions {

	public static void typage () {
		int annee = -3000;
		short nbClanMembers = 127;
		long nbChanceux = 8589934592L;
		String nomClan = "Pierre";
		char modifNom = 'a';
		boolean isFeuilleLetal = false;
		boolean isGrosseBrancheLetal = true;
		float eauEnPeauDeMammouth = 10.5f;
		double eauTotal = 1234567890123456789012345678901234567890.12345678901234567890;

		System.out.println("Nous somme en " + annee + " av. J.-C, mon nom est " + nomClan + modifNom
				+ " et je suis un brillant scientifique (Mon nombre favori est " + nbChanceux
				+ ", gros chiffre gros cerveau !)\nJe suis un des " + nbClanMembers + " membres du clan des " + nomClan
				+ "\n\nMes recherches m'ont permis de découvrir que frapper quelqu’un avec une feuille d'arbre "
				+ (isFeuilleLetal ? "est mortel" : "n'est pas mortel")
				+ ".\nCependant le frapper avec une grosse branche du même arbre "
				+ (isGrosseBrancheLetal ? "est mortel" : "n'est pas mortel")
				+ "!\n\nJ'ai également calculé que notre réserve d'eau s'élève actuellement à exactement "
				+ eauEnPeauDeMammouth
				+ " PMP (Peau de Mammouth Pleine).\nJ'estime que la réserve de l'océan s'élève à environ " + eauTotal
				+ " PMP ! \n\n");
	}
	
	public static void conditions() {
		if (5 <= 5 && 3 == 3) {
			System.out.println("Les deux conditions sont vraies");
		}
		
		if (5 < 5 || 3 == 3) {
			System.out.println("Une des deux conditions est vraie");
		}
		
		if (5 != 5) {
			System.out.println("c'est bon!!");
		} else {
			System.out.println("Cette conditions est fausse et ne sera jamais vraie");
		}
		
		System.out.println("\n");
	}
	
	public static void boucles() {
		for (int i = 1 ; i <= 5 ; i++) {
			System.out.println("Vous avez vu ce message " + i + " fois.");
		}
		System.out.println("\n");
	
		int number = 1;
		while (true) {
				System.out.println("cette boucle est infinie et a été répétée" + number + " fois.");
			number++;
			if (number > 3) break;
		}
		System.out.println("\n");
		do 
			System.out.println("Cette boucle s'éxécute une fois.\n");
			while (number < 2);
	
	}
	
	public static void options(int number) {
		String day;
		switch (number) {
		case 1 : 
			day = "lundi";
			break;
		case 2 : 
			day = "mardi";
			break;
		case 3 : 
			day = "mercredi";
			break;
		case 4 : 
			day = "jeudi";
			break;
		case 5 : 
			day = "Vendredi";
			break;
		case 6 : 
			day = "Samedi";
			break;
		case 7 : 
			day = "Dimanche";
			break;
		default : 
			day = "un jour parmis tant d'autres";
			break;
		}
		System.out.println("Nous sommes " + day + ".\n");
		
	}
	
	public static void moduloOne() {
		for (int i = 1 ; i <= 100 ; i++) {
			if (i % 3 == 0) System.out.println("Fizz \n");
			else if (i % 5 == 0) System.out.println("Buzz \n");
			else System.out.println(i + "\n");
		}
	}
}
