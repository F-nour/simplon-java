package co.simplon.POO.zoo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Zoo {

	public void createZoo() {
		
		List<Vertebre> vertebre = new ArrayList<Vertebre>();
		
		List<Mammifere> mammifere = new ArrayList<Mammifere>();

		List<Felin> felin = new ArrayList<Felin>();

		List<Chat> chat = Arrays.asList(
				new ChatDomestique(), new MainCoon(), new Persan()
		);	
		
		List<Tigre> tigre = Arrays.asList(
				new TigreBengale(), new TigreMalaisie(), new TigreJava()
		);

		
		List<Canin> canin = new ArrayList<Canin>();

		List<Chien> chien = new ArrayList<Chien>();

		List<Cocker> cocker = Arrays.asList(
				new SpanielAmericain(), new SpanielAnglais()
		);
		List<Bulldog> bulldog = Arrays.asList(
				new Anglais(), new Americain(), new Francais()
		);
		

		List<Invertebre> invertebre = new ArrayList<Invertebre>();
		List<Serpent> serpent = Arrays.asList(
				new Boa(), new Cobra()
		);
		
		
		felin.addAll(chat);
		felin.addAll(tigre); 
		
		mammifere.addAll (felin);
		
		
		chien.addAll(cocker);
		chien.addAll(bulldog); 
		chien.add(new Batard());
		
		canin.addAll(chien);
		
		mammifere.addAll(canin);

		
		vertebre.addAll(mammifere);
		invertebre.addAll(serpent); 
	
	} 
		
}
