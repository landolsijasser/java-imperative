package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 3, 7, 6};
		boolean result = false;
		if(array.length >= 1  && (array[0] == 6 || array[array.length - 1 ] == 6)) {
			result = true;
			
		}
System.out.println(result);
	}

}
