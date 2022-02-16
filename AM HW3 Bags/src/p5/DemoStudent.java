package p5;

public class DemoStudent {

	public static void main(String[] args) {
		Course c1 = new Course("CSE110", "CS College Seminar", 1);
		Course c2 = new Course("CSE118", "Intro to Programming", 3);
		Course c3 = new Course("CSE148", "OOP", 4);
		Course c4 = new Course("MAT141", "Calc I", 4);
		
		Course[] arr1 = {c1, c4};
		Course[] arr2 = {c1, c2, c3};
		Course[] arr3 = {c2, c4};
		
		Name n1 = new Name("A", "AA");
		Name n2 = new Name("B", "BB");
		Name n3 = new Name("C", "CC");
		
		Student s1 = new Student(n1, arr1, "CSE", 3.5);
		Student s2 = new Student(n2, arr2, "MAT", 2.5);
		Student s3 = new Student(n3, arr3, "CST", 3.0);
		Student s4 = new Student(new Name("D", "DD"));
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
	}

}
