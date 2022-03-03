package p2;

public class Demo {

	public static void main(String[] args) {
		Name name = new Name("John", "Doe");
//		Name name2 = new Name("Jane", "Doe");
//		System.out.println(name.equals(name2));
		
		Student s1 = new Student(name, 3.0);
		
		s1.getName().setFirstName("John");
//		System.out.println(s1);
		
		Student s2 = new Student(s1);
		s2.getName().setFirstName("Jane");
//		System.out.println(s2);
		
//		System.out.println(name);
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

}
