package firstJavaProject.bar;

public class Cafe {
	
	TypeCafe typeCafe;
	double quantiteLiquideMl;
	
	public Cafe(TypeCafe typeCafe, double quantiteLiquideMl) {
		this.typeCafe = typeCafe;
		this.quantiteLiquideMl = quantiteLiquideMl;
	}
	
	public Cafe () {
		this.typeCafe = this.typeCafe.MOKA;
		this.quantiteLiquideMl = 100; 
	}
	
	
	
	

}
