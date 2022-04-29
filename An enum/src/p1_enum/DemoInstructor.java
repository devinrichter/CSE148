package p1_enum;

public class DemoInstructor {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor("John", 10000, Rank.Professor);
		System.out.println(instructor1);
		
		Student s1 = new Student("Alan", Major.CSE);
		System.out.println(s1);
	}

}
