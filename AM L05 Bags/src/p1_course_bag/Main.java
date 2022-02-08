package p1_course_bag;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Course c1 = new Course("CSE148", "OOP", 4);
		Course c2 = new Course("CSE110", "CS College Seminar", 1);
		Course c3 = new Course("MAT141", "Calc 1", 4);
		Course c4 = new Course("PHY130", "Physics I", 4);
		CourseBag myBag = new CourseBag(10);
		myBag.insert(c1);
		myBag.insert(c2);
		myBag.insert(c3);
		myBag.insert(c4);
		myBag.display();
		Course[] matches = myBag.searchByCredits(4);
		System.out.println(Arrays.toString(matches));
//		Course courseRemoved = myBag.removeByCourseNumber("MAT141");
//		System.out.println(courseRemoved);
//		System.out.println();
//		myBag.display();
	}

}
