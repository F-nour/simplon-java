package first_java_project.poo;

import first_java_project.beginer.Algos; 

import java.util.Random;

public class Method {

	public static int addition(int a, int b) {
		return a + b;
	}
	
	public static void hello(String name) {
		System.out.println("Hello world ! " + name);
	}
	
	public static void explicit() {
		System.out.println("J'ai compris comment faire une méthode");
	}
	
	public static void number(int nombre) {
		if (nombre > 0) {
			for (int i = nombre ; i >= 0 ; i--) {
				System.out.println(i);
			}
		} else if (nombre == 0) { System.out.println(nombre);
		} else {
			for (int i = nombre ; i <= 0 ; i++) {
				System.out.println(i);
			}
		}
	}
		
	public static void stringSize(String word) {
		System.out.println("Taille du mot : " + word.length());
		for (int i = 0 ; i < word.length() ; i++) {
			System.out.println(i+1 + " : " + word);
		}
	}
	
	public static void diff(int nbr) {
		if (nbr > 0) {
			int result = nbr; 
			for (int i = nbr ; i >= 0 ; i-- ) {
				result = result + i;				
			}
			System.out.println("La somme des chiffres entre " + nbr + " et 0 est de " + result);
		} else { 
			System.out.println("Le nombre doit être positif"); 
		}
	}
	
	public static void typeNumber(int nbr) {
		if (nbr > 0) {
			System.out.println("Ce nombre est positif.");
		} else  if (nbr == 0) {
			System.out.println("Ce nombre est nul.");
		} else {
			System.out.println("Ce nombre est négatif.");
		}
		
		if (nbr % 2 == 0) { 
			System.out.println("Ce nombre est pair");
		} else {
			System.out.println("Ce nombre est impair"); 
		}
	}
	
	public static void goldCoin(int gold) {
		int life = gold / 100; 
		int rest = gold % 100; 
		System.out.println("Avec " + gold + " goldcoins, on peut avoir " + life + " vies. Il manque " + rest + " goldcoins pour avoir une vie supplémentaire");
	}
	
	public static void game() {
		int min = 1;
		int max = 6;
		Random random = new Random();
		int a = random.nextInt(max - min + 1) + 1;
		int b = random.nextInt(max - min + 1) + 1; 
		int sum = a + b;
		System.out.println("Le dé numéro un est de " + a);
		System.out.println("Le dé numéro un est de " + b);
		if (sum == 7) {
			System.out.println("Tu as gagné");
		} else {
			System.out.println("Tu as perdu");
		}
	}
	
	public static void decrypt(String password) {
		Algos.decrypt(password); 
	}
	
	public static void tresor(int tresorX, int tresorY) {
		Algos.tresor(tresorX, tresorY);
	}
}
