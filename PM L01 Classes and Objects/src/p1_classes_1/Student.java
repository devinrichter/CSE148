package p1_classes_1;

/* A class is a template used to create objects
 * 
 */
public class Student {
	
	// state of a student object, involves data (nouns)
	// Instance variables, fields, attributes, properties, instance fields
	private String name = null;// visible (accessible) inside the class
	private double gpa; // visible (accessible) inside the same package. Package (default) access
	private int age; //visible (accessible) to every program in the world
	
	// static variables: belongs to the class not to any objects
	private static String major = "CS"; //class variable
	
	
	
	// methods, behavior, involves action (verbs)
	
	// constructors
	public Student(String name, double gpa, int age) {
		this.name = name;
		this.gpa = gpa;
		this.age = age;
	}
	
	public Student() {
		
	}
	
	
	public void setName(String name) { // brown name has a local scope
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String getMajor() {
		return major;
	}
}
