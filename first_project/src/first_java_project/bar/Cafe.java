package first_java_project.bar;

public class Cafe {
	
	public TypeCafe typeCafe;
	public double quantiteLiquideMl;
	
	public Cafe(TypeCafe typeCafe, double quantiteLiquideMl) {
		this.typeCafe = typeCafe;
		this.quantiteLiquideMl = quantiteLiquideMl;
	}
	
	public Cafe () {
		this.typeCafe = this.typeCafe.MOKA;
		this.quantiteLiquideMl = 100; 
	}
	
	
	
	

}
