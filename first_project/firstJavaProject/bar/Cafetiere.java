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
		if(tasse.cafe != null)
		{
			tasse.cafe.quantiteLiquideMl += quantite ; 
			if(typeCafe != tasse.cafe.typeCafe) tasse.cafe.typeCafe = TypeCafe.BATARD ; 
		}
		else tasse.cafe = new Cafe(typeCafe, quantite) ; 
		
		deborde(tasse);

	}
	
	private boolean deborde(Tasse tasse) {
		if(tasse.cafe.quantiteLiquideMl > tasse.quantiteCafeMax)
		{
			System.out.println("Mon cafe déborde !");
			tasse.cafe.quantiteLiquideMl = tasse.quantiteCafeMax ; 
			return true;
		}
		return false;
	}
}
