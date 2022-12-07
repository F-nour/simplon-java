package spatialship.app;

public enum Race {

	HUMAIN(18),
	TOGRUTA(3),
	KLACKONS(6),
	KLINGON(12),
	EPSILON(24),
	BORON(48),
	FATTOUM_NOUREDDINE(96),
	;
	
	int ageAdulte;
	
	Race(int ageAdulte) {
		this.ageAdulte = ageAdulte;
	}
}
