package fr.algorithmie;

public class inverseContenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int[] arrayCopy = new int[array.length];
		for (int i = array.length - 1; i >= 0; i--) {

			arrayCopy[i] = array[array.length - 1 - i];
			System.out.println("la valeur du tableau 1 est" + arrayCopy[i] + "la valeur du tableau 2 est " + array[i]);

		}

	}

}
