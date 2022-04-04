package p2;

public class Demo {

	public static void main(String[] args) {
		try {
			Student s1 = new Student("A", -1.5);
			System.out.println(s1);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

}
