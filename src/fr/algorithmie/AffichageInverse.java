package fr.algorithmie;

public class AffichageInverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);

		}
		int[] arrayCopy = new int[array.length];
		arrayCopy[0] = 1;
		for (int i = 0; i < array.length; i++) {
			arrayCopy[i] = array[i];
			System.out.println(arrayCopy[i]);
		}
	}

}
