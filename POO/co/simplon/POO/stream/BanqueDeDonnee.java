package co.simplon.POO.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BanqueDeDonnee {
	
	public static void lists() {
		List<String> noms = new ArrayList<String>(Arrays.asList(
				"Nour", "Jean", "Arthur", "Thomas", "Béa", "Juliette", "Amira", "Radj", "Surya"
				));

		List<Integer> tailles = new ArrayList<Integer>(); 
		addInegerOnList(tailles, 150, 220, 5);
		
		
		
	}
	
	public static void addInegerOnList(List list, int min, int max, int indent) {
		for (int i = min ; i < max; i += indent) {
			list.add(i);
		}
	}

}
	
