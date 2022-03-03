package p1;

import java.util.Arrays;

public class DemoVariables {

	public static void main(String[] args) {
//		int n = 10;
//		display(n);
//		System.out.println("Output from the main method: " + n);
		
		int[] arr = { 1 ,2, 3, 4};
		display(arr);
		System.out.println("Main Method: " + Arrays.toString(arr));
		
	}

	private static void display(int[] arr2) {
		int[] deepCopy = arrayDeepCopy(arr2);
		deepCopy[0] = 100;
		System.out.println("Display Method: " + Arrays.toString(deepCopy));
	}

	private static int[] arrayDeepCopy(int[] arr2) {
		int[] newArray = new int[arr2.length];
		for(int i = 0; i < arr2.length; i++) {
			newArray[i] = arr2[i];
		}
		return newArray;
	}

//	private static void display(int m) {
//		m = m * 2;
//		System.out.println("Output from the display method: " + m);
//	}

}
