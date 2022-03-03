package p1_arrays;

import java.util.Arrays;

public class DemoArrays {

	public static void main(String[] args) {
//		int n = 10;
		int[] arr = {1, 2, 3, 4};
		
		display(arr);
		
//		System.out.println("\nIn the main method, n: " + n);
		System.out.println("In the main method: " + Arrays.toString(arr));
	}

	// In java, any data passing (paraments and arguments) is by value only!!!!!!
	private static void display(int[] rra) {
		rra[0] = 100;
//		System.out.println("In the display method: m: " + m);
		System.out.println("In the display method: " + Arrays.toString(rra));
	}

}
