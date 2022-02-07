package p1_courses;

public class Demo {
	private static final int COURSEBAG_MAX_SIZE = 1000;
	
	public static void main(String[] args) {
		CourseBag myBag = new CourseBag(COURSEBAG_MAX_SIZE);
		Course c1 = new Course("CSE110", "CS College Seminar", 1);
		Course c2 = new Course("CSE118", "Fundamentals of Programming", 3);
		Course c3 = new Course("CSE148", "Object-Oriented Programming", 4);
		myBag.insert(c1);
		myBag.insert(c2);
		myBag.insert(c3);
		myBag.display();
		Course courseRemoved = myBag.removeByCourseNumber("CSE118");
		myBag.display();
		System.out.println();
		System.out.println(courseRemoved);
	}
	
	

}
