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
	
	
	
	

	
}
