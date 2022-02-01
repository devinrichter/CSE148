package p1_student;

public class Student {
	// instance variables, fields
	private String name;
	private int age;
	private double gpa;
	
	private static String major = "CS";
	
	// constructors: used to create objects
	// If no constructors are provided, Java provides a default constructor
	// overloaded constructors
	public Student(String name, int age, double gpa) {
		this.name = name;
		this.gpa = gpa;
		this.age = age;
	}
	
	public Student(String name, double gpa, int age) {
		this.name = name;
		this.gpa = gpa;
		this.age = age;
	}
	
	public Student(String name) {
		this.name = name;
	}
	
	public Student() {
		
	}
	
	public static String getMajor() {
			return major;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public static void setMajor(String major) {
		Student.major = major;
	}
	
	@Override
	public String toString() {
		return String.format("%-10S%10d%10.2f%10S%n", name, age, gpa, major);
	}
}
