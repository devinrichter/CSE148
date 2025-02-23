package p1;

public class Student implements Comparable<Student> {
	// instance variables reflecting the STATE of an object (usually are nouns)
	private String name;
	private double gpa;
	
	// instance variable reflecting the behavior of an object (usually are verbs)
//	private Playable playable; // function

	public Student(String name, double gpa) {
		super();
		this.name = name;
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
//		return -Double.compare(this.gpa, o.gpa);
	}

}
