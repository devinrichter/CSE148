package p1_intro;

public class Student extends Person {

	private double gpa;
	
	public Student(Name name) {
		super(name);
		this.gpa = 0.0;
	}
	
	public Student(Student student) {
		super(student);
		this.gpa = 0.0;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [" + super.toString() + ", gpa=" + gpa + "]";
	}
	
	
	
}
