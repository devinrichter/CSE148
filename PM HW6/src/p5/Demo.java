package p5;

import java.util.Arrays;
import java.util.function.Predicate;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student(new Name("A", "AA"), 3.0);
		Student s2 = new Student(new Name("B", "BB"), 1.0);
		Student s3 = new Student(new Name("C", "CC"), 2.0);
		
		Instructor i1 = new Instructor(new Name("D", "DD"), "Prof");
		Instructor i2 = new Instructor(new Name("Z", "EE"), "Prof");
		Instructor i3 = new Instructor(new Name("M", "FF"), "Assistant Prof");
		Instructor i4 = new Instructor(new Name("Z", "DD"), "Prof");
		
		PersonBag theBag = new PersonBag(10);
		
		theBag.insert(i1);
		theBag.insert(s2);
		theBag.insert(i4);
		theBag.insert(s3);
		theBag.insert(i2);
		theBag.insert(i3);
		theBag.insert(s1);
		
//		Person[] personsFound = theBag.search((Person s) -> s.getId().compareTo("5") > 0);
//		Person[] personsFound = theBag.search((Person s) -> s.getName().getFirstName().equals("D"));
		
		Person[] personsFound = theBag.search(new Predicate<Person>() {

			@Override
			public boolean test(Person t) {
				return t.getName().getLastName().equals("DD");
			}
			
		});
		
		System.out.println(Arrays.toString(personsFound));
	}

}
