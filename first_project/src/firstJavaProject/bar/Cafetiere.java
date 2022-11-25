package firstJavaProject.bar;

public class Cafetiere {

	public Cafetiere() {
	}

	public void remplirTasse(Tasse tasseDefault) {
		tasseDefault.cafe = new Cafe(TypeCafe.MOKA, tasseDefault.quantiteCafeMax); 	
	}

	public void remplirTasse(Tasse tasseAvecValeurs, TypeCafe bourbon, double d) {
		tasseAvecValeurs.cafe = new Cafe(bourbon, d);
	}
	
	public void remplir(Tasse tasse, TypeCafe typeCafe, double quantite) { 
		if (tasse.cafe != null) {
			tasse.cafe.quantiteLiquideMl += quantite; 
			tasse.cafe.typeCafe = TypeCafe.BATARD; 
		}
		tasse.cafe = new Cafe(typeCafe, quantite);
		if (quantite > tasse.quantiteCafeMax) {
			System.out.println("Le café a débordé !!!");
			tasse.cafe.quantiteLiquideMl = tasse.quantiteCafeMax;
		}
	}
}
