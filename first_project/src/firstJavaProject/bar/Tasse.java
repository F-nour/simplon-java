package firstJavaProject.bar;

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
	
	public int prix() {
		int cout;
		if (this.quantiteCafeMax <= 100) {
			cout = 2;
		} else if (this.quantiteCafeMax > 500) {
			cout = 0;
		} else {
			cout = 3;
		}
		return cout;
	}
}
