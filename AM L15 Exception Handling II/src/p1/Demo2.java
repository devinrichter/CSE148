package p1;

public class Demo2 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		for (int i = 0; i <= arr.length; i++) {
			try {
				System.out.println(arr[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
//				System.out.println(e.getMessage());
			}
		}
		System.out.println("Finished!");
	}

}
