package first_java_project.beginer;

public class App {

	public static void main(String[] args) {
		int value1 = 12;
		long value2 = 123456798L;

		float value3 = 1.1f;
		double value4 = 1.21454487878;

		char value5 = 'a';
		String value6 = "je suis une chaîne de caractère";

		System.out.println("Voici ma première application !!!\n\n");

		Conditions.typage();

		Conditions.conditions();

		Conditions.boucles();

		Conditions.options(2);
		
		Algos.Exemple("Nour-eddine");
		
		Algos.fizzBuzz();
		
		Algos.occurence(10);
		
		Algos.occurence(-10);
		
		Algos.relatif();
		
		Algos.decrypt("9848");
		
		Algos.tresor(11, 12	);
		
		Algos.tresor(12, 13);
		
	}
}
