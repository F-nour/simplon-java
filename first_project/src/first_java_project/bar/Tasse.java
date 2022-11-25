package first_java_project.bar;

public class Tasse {

	public double quantiteCafeMax; 
	public Cafe cafe;
	
	public Tasse(double quantiteCafeMax) { 
		this.quantiteCafeMax = quantiteCafeMax;
	}
	
	public Tasse() {
		super();
		this.quantiteCafeMax = 100;
	}

	public double boire(double quantiteBut) {
		cafe.quantiteLiquideMl = cafe.quantiteLiquideMl - quantiteBut;
		return cafe.quantiteLiquideMl;
	}
	
	public double boire() {
		cafe.quantiteLiquideMl = cafe.quantiteLiquideMl = 0;
		return cafe.quantiteLiquideMl;
	}
}
