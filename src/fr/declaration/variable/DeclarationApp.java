package fr.declaration.variable;

public class DeclarationApp {

	public static void main(String[] args) {
		
		byte nombre = 2;
		short number = 4;
		int a = 4;
		long b = 5L;
		float c = 7F;
		double d = 8D;
		char name = 'c';
		boolean resultat = true;
		String lastName = "landolsi";
		String randomString = "Voici le resultat d'un calcul : \n1+5=6";
		
	
		System.out.println(randomString);
		
		boolean result = a > 100;
				System.out.println(result);
		
		int[] tab = { 1, 2, 3 } ;
		switch(a) {
		case 3 :
			System.out.println("a est egal à 3");
			break;
			default : 
				System.out.println("i ne vaut pas 3");
				break;
				
		}
		
	}

}