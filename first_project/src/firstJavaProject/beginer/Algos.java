package firstJavaProject.beginer;

public class Algos {

	public static void Exemple(String name) {
		for (int i = 1 ; i <= 100 ; i++) {
			System.out.println(i + " : Je m'appelle " + name);
			
			if (i % 2 != 0) {
				System.out.println("Comment vous appelez vous ?");
			} else {
				System.out.println("Où sont les toilettes ?");
			}
			
			if (i % 3 == 0) System.out.println("Je ne parle pas binaire.");
			
			if (i % 5 == 0) System.err.println("FizzBuzz");
			
			if (i <= 2) System.out.println("“est-ce que le micro fonctionne ?");
		}
	}
	
	public static void fizzBuzz() {
		for (int i = 1 ; i <= 100 ; i++) {
			
			if (i % 3 == 0) {
				System.out.println("Fizz");
				System.out.println("FizzBuzz");
			}
			
			if (i % 5 == 0) {
				System.out.println("Fizz");
				System.out.println("FizzBuzz");
			}
			
			System.out.println(i + "\n");

		}
	}
	
	public static void occurence(int nombre) {
		if (nombre == 10) {
			for (nombre = 10 ; nombre >= 0 ; nombre--) System.out.println(nombre);
		}
		
		if (nombre == -10) {
			for (nombre = -10 ; nombre <= 100 ; nombre++) System.out.println(nombre);
		}
	}
	
	public static void relatif() {
		int x = 0;
		for (int i = -100 ; i <
 100 ; i++) {
			
			x++; 
			
			String typeNumber; 
			if (i < 0) {
				typeNumber = "négatif";
			} else { 
				typeNumber = "positif";
			}
			
			System.out.println("Je suis à ma " + x + "ième boucle. Mon i est de " + i + ". Il est donc " + typeNumber + ".");	
				
		}
	}
	
	public static void decrypt(String password) {
		boolean isTrusted = false;
		for (int i = 0 ; i < 10 ; i++) {
			for (int j = 0 ; j < 10 ; j++) {
				for (int k = 0 ; k < 10 ; k++) {
					for (int l = 0 ; l < 10 ; l++) {
						String decrypt = i + "" + j + "" + k + "" + l + "";
						System.out.println("Le code testé est " + decrypt);
						if (password.equals(decrypt)) {
							System.out.println("Matrix Resurrections");
							System.out.println("Le mot de passe est : " + password + ". Il a bien été décrypté!");
							isTrusted = true;
							break;
						}
					}
					if (isTrusted) break;
				}
				if (isTrusted) break;
			}
			if (isTrusted) break;
		}
	}
	
	public static void tresor(int tresorX, int tresorY) {
		boolean isTrusted = false;
		for (int x = 10 ; x <= 12 ; x++) {
			for (int y = 10; y <= 12 ; y++) {
				if (x == tresorX && y == tresorY) {
					System.out.println("J'ai trouvé le trésor");
					isTrusted = true;
					break;
				}
			}
			if (isTrusted) break;
		}
	if (!isTrusted) System.out.println("A zut j’ai perdu !!!");
	}	
}
