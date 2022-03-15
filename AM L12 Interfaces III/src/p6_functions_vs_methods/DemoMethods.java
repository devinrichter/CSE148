package p6_functions_vs_methods;

public class DemoMethods {

	public static void main(String[] args) {
		Student s1 = new Student("Alan", 4.0);
		Student s2 = new Student("Jose", 4.0);
		System.out.println(s1.getName());
		System.out.println(s2.getName());
		System.out.println(computer(5, 4));
	}

	private static int computer(int i, int j) {
		return i + j;
	}


}
