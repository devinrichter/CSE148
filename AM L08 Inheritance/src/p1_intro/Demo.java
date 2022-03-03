package p1_intro;

public class Demo {

	public static void main(String[] args) {
//		Name n1 = new Name();// default constructor
//		Student s1 = new Student(n1);
//		System.out.println(s1);
//		Instructor i1 = new Instructor(n1);
//		System.out.println(i1);
		Name name1 = new Name("John", "Doe");
		Student s2 = new Student(name1, 3.5);
		Person s1 = new Student(name1, 3.5); // polymorphism
		Name name2 = new Name("Jane", "Doe");
		Person i1 = new Instructor(name2);
		System.out.println(s1);
		System.out.println(i1);
//		System.out.println(s1.name = null);
		System.out.println(s1);
//		Person p1 = new Person(new Name("Bill", "Smith"));
		
		// using polymorphism, we can divorce the type of the 
		// reference variable from the object it references
		
		Person[] arr = new Person[2];
		arr[0] = s1;
		arr[1] = i1;
		System.out.println(s1);
	}

}
